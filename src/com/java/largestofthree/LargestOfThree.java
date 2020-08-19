package com.java.largestofthree;

public class LargestOfThree {
    public static void main(String[] args) {
        int a=20,b=10,c=40;
        int res=(a>b&&a>c) ? a:((b>c&&b>a)? b:c);
        System.out.printf( "largest of three number %d %d and %d is %d ",a,b,c,res);

    }
}
