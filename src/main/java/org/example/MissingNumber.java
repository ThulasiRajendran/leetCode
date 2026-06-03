package org.example;

public class MissingNumber {


    public static void main(String[] args) {
         int nums[]={0,1,2,4,5};
            int n = nums.length;
            int sum = n * (n + 1) / 2;
            int sum_array = 0;
            for (int i = 0; i < n; i++) {
                sum_array += nums[i];
            }
            int missingNumber = sum - sum_array;

            System.out.println(missingNumber);


        }
}
