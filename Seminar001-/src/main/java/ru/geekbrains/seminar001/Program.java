package ru.geekbrains.seminar001;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean f = true;
        while (f){
            System.out.println("Меню приложения");
            System.out.println("===============");
            System.out.println("1 - Задача 1.");
            System.out.println("2 - Задача 2.");
            System.out.println("0 - Завершение приложения");
            System.out.println("=========================");
            System.out.print("Укажите номер задачи ");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num){
                case 0:
                    f = false;
                    System.out.println("Завершение работы приложения! Всего хорошего!");
                    break;
                case 1:
                    printName();
                    break;
                case 2:
                    int[] array1 = new int[] {1, 0, 1, 1, 1, 0, 0,};
                    processArray(array1);
                    break;
                default:
                    System.out.println("Вы указали некорректный пункт меню.\nПовторите попытку ввода.");
                    break;
            }
        }
    }

    static void printName(){
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

    }

    /**
     * Дан массив чисел, состоящий из 0 и 1, Вывести максимальное
     * количество подряд идущих 1.
     * @param array массив
     */
    static void processArray(int[] array){
        int counter = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                counter++;
            } else {
                if (counter > result) {
                    result = counter;
                }
                counter = 0;
            }
        }
        if (result < counter) {
            result = counter;
        }
        System.out.println("Количество подряд идущих единиц: " + result);
    }
}
