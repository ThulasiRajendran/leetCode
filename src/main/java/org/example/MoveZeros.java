package org.example;


import java.util.Arrays;

public class MoveZeros {

    public void Move_Zeros() {
        int a[] = {1, 0, 2, 0, 4};

        //need to set pointer
        int az = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[az] = a[i];
                az++;
            }
        }
        for (int i = az; i < a.length; i++) {
            a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }

    public void Move_Zeros_Oneloop() {
        int nums[] = {1, 0, 2, 0, 4};
        int nz = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap current non-zero with position nz
                int temp = nums[nz];
                nums[nz] = nums[i];
                nums[i] = temp;
                nz++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
