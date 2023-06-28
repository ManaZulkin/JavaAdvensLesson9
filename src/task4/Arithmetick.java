package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Arithmetick {
    public static void main(String[] args) {
        ArrayList<Double> num = new ArrayList<>();
        input(num);
        System.out.println("sum: "  + num.stream().reduce(Double::sum));
        System.out.println("multiply: "  + num.stream().reduce((a,b)->(a * b)));
        System.out.println("subtraction: "  + num.stream().reduce((a,b)->(a - b)));
        System.out.println("division: "  + num.stream().reduce( (a,b)->(a / b)));

    }

    public static void input(ArrayList<Double> numb){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter number");
            numb.add(in.nextDouble());
        }
    }
}


