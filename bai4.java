package com.company;
import java.util.Scanner;
public class bai4 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        System.out.println("UCLN của " + a + " và " + b + " là: " + UCLN(a, b));
        System.out.println("BCNN của " + a + " và " + b + " là: " + BCNN(a, b));
    }
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}
