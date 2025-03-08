package com.vchun.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // Chuẩn bị 1 mảng 2 chiều để chứa data đưa vào test hàm getFactorial() của mình
    // Hàm này phải là Static vì - nằm 1 choox cố định trong ram ể cung cấp data cho các hàm test
    public static Object[][] initData() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},
                {7, 5040},
                {8, 40320},
                {9, 362880},
                {10, 3628800},
                {11, 39916800},
                {12, 479001600},
                {13, 6227020800L},
                {14, 87178291200L},
                {15, 1307674368000L},
                {16, 20922789888000L},
                {17, 355687428096000L},
                {18, 6402373705728000L},
                {19, 121645100408832000L},
                {20, 2432902008176640000L}
        };
    }

    @ParameterizedTest
    @MethodSource("initData")
    public  void testFactorialGivenRightArgumentReturnsWell1(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n) );
    }
}