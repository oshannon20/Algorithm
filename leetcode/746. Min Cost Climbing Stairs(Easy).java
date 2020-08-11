package com.example.lib2;

/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 */
class Solution {
    public static int minCostClimbingStairs(int[] cost) {
        for (int i=2; i<cost.length; i++){
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }

    public static int minCostClimbingStairs2(int[] cost) {
        int case1=0, case2=0;        // 각 계단별 최소비용
        int current;         // 현재 계단의 최소비용을 임시로 저장

        for(int i=cost.length-1; i>=0; i--){
            current = cost[i] + Math.min(case1, case2);
            // 한 칸 멀리 있던 계단은 두 칸 멀어지게 된다
            case2 = case1;
            // 현재 계단이 한 칸 멀리 있는 계단
            case1 = current;
            System.out.println(cost[i] + " " +current + " " + case2 + " " + case1);
        }
        return Math.min(case1,case2);
    }
}
