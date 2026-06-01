package org.example;

import java.util.HashMap;
import java.util.Map;

    class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

    static class stringreverse {

        public String Reversestring() {


        String name = "java";
        StringBuilder sb = new StringBuilder(String.valueOf(name));
        return  sb.reverse().toString();
    }
    }

    public static void main(String[] args) {

        stringreverse rev= new stringreverse();
        System.out.println(rev.Reversestring());



        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Numbers: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
