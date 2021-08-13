package com.company;

import java.util.Scanner;

public class Main
{
    public  static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите t");
        double t = in.nextDouble();
        System.out.println("Введите l");
        double l = in.nextDouble();
        double R = 3 * Math.pow(t, 2.0) + 5 * Math.pow(l, 5.0) + 4.9;
        System.out.println("R равно" + " " + R);
        System.out.println(" ");
        System.out.println("Введите x");
        double x = in.nextDouble();
        double l1 = 1.51 * Math.cos(Math.pow(x, 2.0)) + 2 * Math.pow(x, 3.0);
        System.out.println("L равно" + " " + l1);
        System.out.println(" ");
        System.out.println("Введите t");
        double t1 = in.nextDouble();
        System.out.println("Введите y");
        double y =  in.nextDouble();
        double t2 = (2.37 * Math.sin(t1 + 1.0))/(Math.sqrt(4 * Math.pow(y, 2.0) - 0.1 * y + 5));
        System.out.println("T равен" + " " + t2);
    }
}
