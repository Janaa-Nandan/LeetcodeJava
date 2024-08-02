package LeetcodeJava.CanPlaceFlowers;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 1;
        int len = flowerbed.length;
        if (len == 1){
            if (flowerbed[0]==0) count++;
            return count >= n;
        }
        if(flowerbed[0]==0&&flowerbed[1]==0){
            count++;
            i++;
        }
        for (; i < len-1;i++){
            if (flowerbed[i-1]==0&&flowerbed[i]==0&&flowerbed[i+1]==0){
                flowerbed[i]=1;
                count++;
                i++;
            }
        }
        if (flowerbed[len-1]==0&&flowerbed[len-2]==0&&len!=2){
            count++;
        }
        System.out.println(count);
        return count >= n;
    }
}
