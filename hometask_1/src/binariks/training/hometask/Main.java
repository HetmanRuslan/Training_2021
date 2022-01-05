package binariks.training.hometask;


import java.util.ArrayList;
import java.util.Scanner;

import static binariks.training.hometask.Polindome.istPalindrom;

public class Main {
    public static void main(String[] args) {
        //task_1 in FILE task.txt

        //Task_2
        System.out.println(Fibonacci.fib2(46));

        System.out.println(Fibonacci.fib(46));

        System.out.println("\n");

        //Task_3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слово для перевірки на поліндром-->");
        String wort = scanner.nextLine();
        System.out.println("\n");
        char[] warray = wort.toCharArray();
        System.out.println(istPalindrom(warray));


    }


}
