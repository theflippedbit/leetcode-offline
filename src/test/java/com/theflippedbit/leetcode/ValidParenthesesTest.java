package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    @Test
    void isValid() {
        // case1
        String case1 = "()";
        Assertions.assertTrue(ValidParentheses.isValid(case1));

        // case2
        String case2 = "()[]{}";
        Assertions.assertTrue(ValidParentheses.isValid(case2));

        // case3
        String case3 = "(]";
        Assertions.assertTrue(ValidParentheses.isValid(case3));
    }

}
