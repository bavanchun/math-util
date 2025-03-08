package com.vchun.mathutil.core;

public class MathUtility {

    //class này là bo thu vien chua cac ham toan hoc giong class Math trong JDK
    //thu vien chua ham tinh toan ma khong can luu tru ket qua, chi tra ve ket qua, thi nen duoc thet ke laf hamf static, vi du Math.sqrt() Math.abs()
    // class nay tam lam ham tinh giai thua  n!
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        // CPU chay den day thi n chac chan la 2..20
//        // CPU chay den day thi n chac chan la 2..20
//        long result = 1; // coi n = 2 da xong
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }


    //code ham thi phai co kiem thu ham; muom kiem thu phai co test case
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        } // early return, thoat som neu co the
        // khong can viet else cho code nhin dep
        // n bat dau tu 1...
        // thuat toan con heo dat, nhan don, cong don
        long result = 1; // coi n = 2 da xong
        for (int i = 1; i <= n; i++) {
            result *= i;// i bij nhan don
        }
        return result;
    }

    //Test case #1
    //Verify getfactorial() with n = 0
    //Steps/procedure
    // (1) Given n with 0
    // (2) Call getFactorial(n)

    // expected value/result: the method will return 1

    //Test case #2
    //Verify getfactorial() with n = 1
    //Steps/procedure
    // (1) Given n with 1
    // (2) Call getFactorial(n)

    // expected value/result: the method will return 1

    //Test case #3
    //Verify getfactorial() with n = 2
    //Steps/procedure
    // (1) Given n with 2
    // (2) Call getFactorial(n)

    // expected value/result: the method will return 2

    //Test case #4
    //Verify getfactorial() with n = 5
    //Steps/procedure
    // (1) Given n with 5
    // (2) Call getFactorial(n)

    // expected value/result: the method will return 120

}
