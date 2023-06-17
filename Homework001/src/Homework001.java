import java.util.Scanner;

public class Homework001 {

    public static void main(String[] args) {
//        task001();
//        task002();
        task003();
    }

    // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    static void task001() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.printf("Факториал от %d = %d \n", num, result);
        in.close();
    }

    // 2) Вывести все простые числа от 1 до 1000
    static void task002() {
        short value = 0;
        for (int i = 1; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }

            if (flag == true & value < 20) {
                value++;
                System.out.printf("%d, ", i);
            } else if (flag == true) {
                value = 0;
                System.out.printf("%d,\n ", i);
            }
        }
    }

    // 3) Реализовать простой калькулятор
// + - / *
// Введите первое число: A \n
// Введите знак: *
// Введите второе число: B
// Результат: A*B
    static void task003() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = in.nextInt();
        System.out.print("Введите знак: ");
        String action = in.next();
        System.out.print("Введите второе число: ");
        double num2 = in.nextInt();
        double result;
        switch (action) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                result = 0;
        }
        System.out.println(result);
    }
}
