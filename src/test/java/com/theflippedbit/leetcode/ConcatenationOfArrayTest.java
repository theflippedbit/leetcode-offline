package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ConcatenationOfArrayTest {

    @Test
    void getConcatenation() {
        // case1
        int[] case1Nums = {1, 2, 1};
        int[] case1Expected = {1, 2, 1, 1, 2, 1};
        int[] case1Ans = ConcatenationOfArray.getConcatenation(case1Nums);
        assertArrayEquals(case1Expected, case1Ans);

        // case2
        int[] case2Nums = {1, 3, 2, 1};
        int[] case2Expected = {1, 3, 2, 1, 1, 3, 2, 1};
        int[] case2Ans = ConcatenationOfArray.getConcatenation(case2Nums);
        assertArrayEquals(case2Expected, case2Ans);
    }

}
