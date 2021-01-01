public class Solution_605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // 本题可以在数组前后补0，然后每有连续三个0就种一朵花
        int placeNum = 0;
        int space = 0;
        int index = 0;
        // 处理第一朵花之前的空位
        while (index < flowerbed.length && flowerbed[index] != 1) {
            index++;
            space++;
        }
        // 花坛全为空位
        if (index == flowerbed.length) {
            return n <= ((space + 1) / 2);
        }
        placeNum += (space / 2);
        space = 0;
        // 处理之后每两朵花之间的空位
        while (index < flowerbed.length) {
            if (flowerbed[index] == 1) {
                placeNum += ((space - 1) / 2);
                space = 0;
            } else {
                space++;
            }
            index++;
        }
        // 最后仍有空位种植
        if (space > 0) {
            placeNum += (space / 2);
        }
        // 判断能否种下n朵花
        return n <= placeNum;
    }

}
