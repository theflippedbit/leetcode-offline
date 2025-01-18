package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    @Test
    void containsDuplicate() {
        // case 1
        int[] case1 = {1, 2, 3, 1};
        assertTrue(ContainsDuplicate.containsDuplicate(case1));

        // case 2
        int[] case2 = {1, 2, 3, 4};
        assertFalse(ContainsDuplicate.containsDuplicate(case2));

        // case 3
        int[] case3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(ContainsDuplicate.containsDuplicate(case3));
    }

}
