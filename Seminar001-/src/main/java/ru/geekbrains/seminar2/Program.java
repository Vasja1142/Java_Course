package ru.geekbrains.seminar2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение: ");
        String text = in.nextLine();
        int index;
        char n;
        int[] statistic = new int[26];
        for (int i = 0; i < text.length(); i++) {
            n = text.charAt(i);
            index = n - 97;
            statistic[index]++;
            System.out.println(n);
        }
        System.out.println(statistic    );

    }
}
