package com.knoldus;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
    }
    public int add(int a, int b)
    {
        int c;
         c=a+b;
        return c;
    }
    public int sub(int a, int b)
    {
        int c;
        c=a-b;
        return c;
    }
    public int mul(int a,int b)
    {
        int c;
        c=a*b;
        return c;
    }
    public int div(int a, int b)
    {
        int c;
         c=a/b;
        return c;
    }
}