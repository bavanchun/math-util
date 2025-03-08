package com.vchun.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
    @Test
    public  void testFactorialGivenRightArgumentReturnsWell4() {
        assertEquals(24, MathUtility.getFactorial(4) );
    }

    @Test
    public  void testFactorialGivenRightArgumentReturnsWell3() {
        assertEquals(6, MathUtility.getFactorial(3) );
    }

    @Test
    public  void testFactorialGivenRightArgumentReturnsWell2() {
        assertEquals(2, MathUtility.getFactorial(2) );
    }

    @Test
    public  void testFactorialGivenRightArgumentReturnsWell1() {
        assertEquals(1, MathUtility.getFactorial(1) );
    }

    // Test case with 0!
    @Test
    public  void testFactorialGivenRightArgumentReturnsWell0() {
        assertEquals(1, MathUtility.getFactorial(0) );
    }
    @Test
    public  void testFactorialGivenRightArgumentReturnsWell5() {
        int n = 5; // cho/given n = 5
        long expectedResult = 120; // hy vong 0! o trn se la 1
        long actualValue = MathUtility.getFactorial(n);// thuc te la may doan xem
        assertEquals(expectedResult, actualValue);
    }

}