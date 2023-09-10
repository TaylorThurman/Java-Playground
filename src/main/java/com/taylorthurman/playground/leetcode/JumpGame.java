package com.taylorthurman.playground.leetcode;

public class JumpGame {

    /*
     * https://leetcode.com/problems/jump-game/
     *
     * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
     * Return true if you can reach the last index, or false otherwise.
     *
     * Example 1:
     * Input: nums = [2,3,1,1,4]
     * Output: true
     * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
     * Example 2:
     *
     * Input: nums = [3,2,1,0,4]
     * Output: false
     * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
     */

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("Can jump: " + canJump(nums));

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Can jump: " + canJump(nums2));

        int[] nums3 = {0};
        System.out.println("Can jump: " + canJump(nums3));

        int[] nums4 = {1, 1, 2, 2, 0, 1, 1};
        System.out.println("Can jump: " + canJump(nums4));
    }

    public static boolean canJump(int[] nums) {
        int reachable = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, nums[i] + i);
        }

        return true;
    }
}
