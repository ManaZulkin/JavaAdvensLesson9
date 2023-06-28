package task4;

import java.util.Scanner;

public class Arithmetick_2 {
    public static void main(String[] args) {
        double num1, num2, result;
        Arithmet add;
        add = (a,b) -> a + b;
        Arithmet sub;
        sub = (a,b) -> a - b;
        Arithmet mult;
        mult = (a,b) -> a * b;
        Arithmet div;
        div = (a,b) -> a / b;

        num1 = input();
        num2 = input();

        result = add.calcelate(num1, num2);
        System.out.println("add: " + result);
        System.out.println("sud: " + sub.calcelate(num1, num2));
        System.out.println("mult: " + mult.calcelate(num1, num2));
        System.out.println("div: " + div.calcelate(num1, num2));
    }

    public static double input(){
        Scanner in = new Scanner(System.in);
        double num;
        System.out.println("Enter number");
        num = in.nextDouble();
        return num;
    }
}

interface Arithmet{
    double calcelate(double a, double b);
}