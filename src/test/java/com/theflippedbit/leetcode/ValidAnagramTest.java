package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {

    @Test
    void isAnagram() {
        // case 1
        String case1s1 = "rat";
        String case1s2 = "car";
        assertFalse(ValidAnagram.isAnagram(case1s1, case1s2));

        // case 2
        String case2s1 = "anagram";
        String case2s2 = "nagaram";
        assertTrue(ValidAnagram.isAnagram(case2s1, case2s2));
    }

}
