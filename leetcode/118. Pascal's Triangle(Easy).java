package com.example.lib2;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 */
class Solution {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // 사용자가 0개 열을 요청할 때, 빈 배열을 리턴한다.
        if (numRows == 0) return triangle; // return [ ];

        // 첫번째 열은 항상 [1]이다.
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            // 열의 첫번째 값은 항상 1이다.
            row.add(1);

            // (첫번째와 마지막을 제외한) 각 열의 요소는 이전 열의 왼쪽과 오른쪽 값의 합과 같다.
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // 열의 마지막 값은 항상 1이다.
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}
