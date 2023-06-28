package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SummSquere {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fill(list);
        System.out.println("List has numbers: " + list);
        System.out.print("Squered list: ");
        list.stream().map(number -> number * number).forEach(number -> System.out.print(number + ", "));
        System.out.println();
        System.out.println("summ = " + list.stream().map(number -> number * number).reduce(0, Integer::sum));
    }

    public static void fill(ArrayList<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 10; i++ ){
            list.add(random.nextInt(10));
        }
    }
}
