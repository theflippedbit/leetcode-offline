package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {
        // case 1
        int[] case1Nums = new int[]{3, 2, 2, 3};
        int case1Val = 3;
        int case1Expected = 2;
        int case1Actual = RemoveElement.removeElement(case1Nums, case1Val);
        assertEquals(case1Expected, case1Actual);

        // case 2
        int[] case2Nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int case2Val = 2;
        int case2Expected = 5;
        int case2Actual = RemoveElement.removeElement(case2Nums, case2Val);
        assertEquals(case2Expected, case2Actual);
    }
}
