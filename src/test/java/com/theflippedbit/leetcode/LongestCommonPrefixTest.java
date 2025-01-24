package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        // case 1
        String[] case1 = new String[]{"flower", "flow", "flight"};
        String case1Expected = "fl";
        String case1Actual = LongestCommonPrefix.longestCommonPrefix(case1);
        assertEquals(case1Expected, case1Actual);

        // case 2
        String[] case2 = new String[]{"dog", "racecar", "car"};
        String case2Expected = "";
        String case2Actual = LongestCommonPrefix.longestCommonPrefix(case2);
        assertEquals(case2Expected, case2Actual);
    }

}
