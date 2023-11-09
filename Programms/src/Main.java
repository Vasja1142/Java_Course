public class Main {
    public static void main(String[] args) {
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

    }
}