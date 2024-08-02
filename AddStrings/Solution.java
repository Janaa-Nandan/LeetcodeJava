package LeetcodeJava.AddStrings;

import static java.lang.Math.abs;
class Solution {
    public String addStrings(String num1, String num2) {
        int zeroes = num1.length() - num2.length();
        if (zeroes > 0){
            for (int i = 0; i < zeroes; i++) num2 = "0" + num2;
        }
        else if (zeroes < 0){
            for (int i = 0; i < abs(zeroes); i++) num1 = "0" + num1;
        }
        int max = num1.length();
        String str = "";
        System.out.println(num1);
        System.out.println(num2);
        int remainder = 0;
        for (int i = max-1; i >= 0; i--) {
            int sum = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i))+remainder;
            System.out.println(sum);
            if (sum>9){
                remainder = 1;
                sum-=10;

            }
            else{
                remainder = 0;
            }
            str = sum + str;
        }
        if (remainder == 1){
            str = "1"+str;
        }
        return str;
    }
}
