package com.vchun;

import com.vchun.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgumentReturnsWell();
        testFactorialGivenRightArgumentReturnsWell1();
        testFactorialGivenRightArgumentReturnsWell2();
        testFactorialGivenWrongArgumentThrowsException();

    }

    //Code các test case để test hàm chạy đúng hay sai- Thực hành TDD
    //ham nay ung voi 1 test case, test case voi n = 0 thi ham phai tra ve ngon
    //ten ham mang y nghia test case luon, de giup dan dev khong nham lan va kiem tra thieu du
    //tranh dinh li thuoc tru sau
    public static void testFactorialGivenRightArgumentReturnsWell() {
        int n = 0; // cho/given n = 0
        long expectedResult = 1; // hy vong 0! o trn se la 1
        long actualValue = MathUtility.getFactorial(n);// thuc te la may doan xem
        // so sanh giua expected value va actual value
        System.out.println("Expected: " + expectedResult + "; Actual: " + actualValue);
        System.out.println("Status: " + (expectedResult == actualValue));
    }

    public static void testFactorialGivenRightArgumentReturnsWell1() {
        int n = 1; // cho/given n = 0
        long expectedResult = 1; // hy vong 0! o trn se la 1
        long actualValue = MathUtility.getFactorial(n);// thuc te la may doan xem
        // so sanh giua expected value va actual value
        System.out.println("Expected: " + expectedResult + "; Actual: " + actualValue);
        System.out.println("Status: " + (expectedResult == actualValue));
    }

    public static void testFactorialGivenRightArgumentReturnsWell2() {
        int n = 5; // cho/given n = 5
        long expectedResult = 120; // hy vong 0! o trn se la 1
        long actualValue = MathUtility.getFactorial(n);// thuc te la may doan xem
        // so sanh giua expected value va actual value
        System.out.println("Expected: " + expectedResult + "; Actual: " + actualValue);
        System.out.println("Status: " + (expectedResult == actualValue));
    }

    //test giai thua voi am 5 hy vong ngoai le xuat hien
    public static void testFactorialGivenWrongArgumentThrowsException() {
       MathUtility.getFactorial(-5);
    }// khi dua n = -2, thay ngoaij le
    //Code ta thiet ke la: neu n am thi phai co ngoai le xuat hien
    //maf bay gio khi minh run voi n = -2, ngoai le xhll, khong hoang hot
    //ma lai mung vi app run nhu thiet ke
}