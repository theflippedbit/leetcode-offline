package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    @Test
    void isValid() {
        // case1
        String case1 = "()";
        assertTrue(ValidParentheses.isValid(case1));

        // case2
        String case2 = "()[]{}";
        assertTrue(ValidParentheses.isValid(case2));

        // case3
        String case3 = "(]";
        assertFalse(ValidParentheses.isValid(case3));

        // case4
        String case4 = "((([[[{{{}}}]]])))";
        assertTrue(ValidParentheses.isValid(case4));

        // case5
        String case5 = "((()[[[]{{{}}}]()]))";
        assertTrue(ValidParentheses.isValid(case5));
    }

}
