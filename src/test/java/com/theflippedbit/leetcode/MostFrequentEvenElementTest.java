package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentEvenElementTest {

    @Test
    void mostFrequentEven() {
        // case1
        int[] case1Nums = new int[]{0, 1, 2, 2, 4, 4, 1};
        int case1Expected = 2;
        int case1Actual = MostFrequentEvenElement.mostFrequentEven(case1Nums);
        assertEquals(case1Expected, case1Actual);

        // case2
        int[] case2Nums = new int[]{4, 4, 4, 9, 2, 4};
        int case2Expected = 4;
        int case2Actual = MostFrequentEvenElement.mostFrequentEven(case2Nums);
        assertEquals(case2Expected, case2Actual);

        // case3
        int[] case3Nums = new int[]{29, 47, 21, 41, 13, 37, 25, 7};
        int case3Expected = -1;
        int case3Actual = MostFrequentEvenElement.mostFrequentEven(case3Nums);
        assertEquals(case3Expected, case3Actual);
    }

}
