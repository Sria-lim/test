package com.eg.calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number");
        int no1 = in.nextInt();
        System.out.println("enter second number");
        int no2 =in.nextInt();
        System.out.println("select sym(+,-,*,/)");
        String sym=in.next();
        int res;
        switch(sym)
        {
            case"+": res=no1+no2;
                System.out.println("add="+res);
                break;
            case"-": res=no1-no2;
                System.out.println("sub="+res);
                break;
            case"*": res=no1*no2;
                System.out.println("multi="+res);
                break;
            case"/": res=no1/no2;
                System.out.println("divid="+res);
                break;
            default:
                System.out.println("invalid sym");
        }
    }
}