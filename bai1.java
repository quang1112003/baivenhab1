package com.company;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, a;
        System.out.println("Nhập số bất kì: ");
        a = sc.nextInt();
        for(int i=1;i<=a/2;i++){
            if(a%i==0)
                sum+=i;
        }
        if(sum==a){
            System.out.println(a + " là số hoàn hảo");
        }
        else {
            System.out.println(a + " ko phải số hoàn hảo");
        }
    }
}

