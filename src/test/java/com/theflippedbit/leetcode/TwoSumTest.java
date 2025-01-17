package com.theflippedbit.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void twoSum() {
        // case 1
        int[] case1 = {2, 7, 11, 15};
        int case1Target = 9;
        int[] expectedCase1 = {0, 1};
        int[] actualCase1 = TwoSum.twoSum(case1, case1Target);
        Assertions.assertThat(actualCase1).containsExactlyInAnyOrder(expectedCase1);

        // case 2
        int[] case2 = {3, 2, 4};
        int case2Target = 6;
        int[] expectedCase2 = {1, 2};
        int[] actualCase2 = TwoSum.twoSum(case2, case2Target);
        Assertions.assertThat(actualCase2).containsExactlyInAnyOrder(expectedCase2);

        // case 3
        int[] case3 = {3, 3};
        int case3Target = 6;
        int[] expectedCase3 = {0, 1};
        int[] actualCase3 = TwoSum.twoSum(case3, case3Target);
        Assertions.assertThat(actualCase3).containsExactlyInAnyOrder(expectedCase3);
    }

}
