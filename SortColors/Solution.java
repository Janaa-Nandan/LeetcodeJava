package LeetcodeJava.SortColors;

import java.util.Arrays;
class Solution {
    public void sortColors(int[] nums) {
        int color0 = 0;
        int color1 = 0;
        int color2 = 0;
        int[] newnums = new int[nums.length];
        int i = 0;
        for (int e : nums){
            if (e==0){
                color0++;
                newnums[i]=0;
                i++;
            }
            else if (e==1)color1++;
            else color2++;
        }
        for (int j = color1; j > 0; j--){
            newnums[i]=1;
            i++;
        }
        for (int k = color2; k > 0; k--){
            newnums[i]=2;
            i++;
        }
        System.out.println(color0+" "+color1+" "+color2);
        System.out.println(Arrays.toString(newnums));
        System.out.println(Arrays.toString(nums));
        for(int l =0;l<nums.length;l++){
            nums[l] = newnums[l];
        }
    }
}