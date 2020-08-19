package com.eg.smallesttest;
import java.util.Scanner;
public class SmallestTest {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("enter first number");
        int a=in.nextInt();
        System.out.println("enter second number");
        int b=in.nextInt();
        System.out.println("enter the third number");
        int c=in.nextInt();
        int res=(a<b&& a<c)? a:((b<c&&b<a) ? b:c);
        System.out.println("Smallest of three number is:"+res);
    }
}
