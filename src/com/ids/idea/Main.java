package com.ids.idea;

public class Main {
    public static void main(String[] args){
        int[] nums = {5, 4, 3, 2, 1};
        int l = nums.length-1;
        int m = nums.length/2;
        nums[0] = nums[0]+nums[l];
        nums[l] = nums[0]-nums[l];
        nums[0] = nums[0]-nums[l];
        System.out.println(nums[0]+nums[m]);
    }
}