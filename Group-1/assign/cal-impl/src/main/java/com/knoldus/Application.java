package com.knoldus;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        System.out.println("Start");
        Calculator cal=new Calculator();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Addition" + " : " + cal.add(a,b));
        System.out.println("Subtraction" + " : " + cal.sub(a,b));
        System.out.println("Multiplication" +  " : " + cal.mul(a,b));
        System.out.println("Division" +  " : " + cal.div(a,b));
    }
}