import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        String lina = in.nextLine();
        String[] numbers = lina.split(" ");
        int[] arr = new int[len];
        for (int i = 0; i < len ; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        int min;
        int indexMin;
        for (int i = 0; i < len; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            arr[indexMin] = arr[i];
            arr[i] = min;
        }
        int value1 = arr[0];
        int value2 = arr[len-1];
        int counter1 = 1;
        int counter2 = 1;
        boolean result = true;
        if (value1 != value2) {
            for (int i = 1; i < len-1; i++) {
                if (arr[i] == value1) {
                    counter1++;
                }
                else if (arr[i] == value2) {
                    counter2++;
                }
                else {
                    result = false;
                    break;
                }
            }
        }

        int value = abs(counter1 - counter2);
        if (value > 1){
            result = false;
        }
        if (result) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}