package com.company;
import java.util.Scanner;
public class bai2 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = sc.nextInt();
        }while(n <= 0);
        System.out.format("vị trí thứ %d trong dãy Fibonacci là: %d", n, f(n));
    }
    public static int f(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return(f(n-2) + f(n-1));
        }
    }
}
