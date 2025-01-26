package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void majorityElement() {
        // case 1
        int[] case1Nums = new int[]{3, 2, 3};
        int case1Expected = 3;
        int case1Actual = MajorityElement.majorityElement(case1Nums);
        assertEquals(case1Expected, case1Actual);

        // case 2
        int[] case2Nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        int case2Expected = 2;
        int case2Actual = MajorityElement.majorityElement(case2Nums);
        assertEquals(case2Expected, case2Actual);
    }

}
