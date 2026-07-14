package org.example.q2009;


import java.util.Arrays;

class Solution {
    public static int minOperations(int[] nums) {
        // 4, 2, 5, 3

        Arrays.sort(nums);
        // 2  3  4  5
        // 0  1  2  3

        int min = nums[0];
        int max = nums[nums.length-1];
        int value = nums[0];
        int count = 0;

        for(int i=0; i < nums.length ; i++){
            if(value == nums[i]){
                count++;
            }else{
                value++;
                return 0;
            }
        }
        return -1;

    }

    public static void main(String[] args){

        int[] nums = {4, 2, 5, 3};

        System.out.println(minOperations(nums));
    }
}
