package leetcode;

/**
 * https://leetcode.com/problems/reverse-integer/ Level: Easy
 */
class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            System.out.println("tail "+tail);
            int newResult = result * 10 + tail;
            System.out.println("newResult: " + newResult);
            System.out.println("new-tail: "+ (newResult-tail));
            System.out.println("result: "+ result);
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
            System.out.println();
        }

        return result;
    }
}