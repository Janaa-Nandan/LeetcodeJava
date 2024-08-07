package LeetcodeJava.SearchA2DArray;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++){
            int[] arr = matrix[i];
            for (int j = 0; j < arr.length; i++){
                if (arr[j]==target) return true;
            }
        }
        return false;
    }
}