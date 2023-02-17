public class Main {
    // Объявить метод «сгенерироватьМассив»

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int [] arr = generateRandomArray();
        int summ = 0;
        for (int j : arr) {
            summ = summ + j;
        }
        System.out.println("Сумма трат за месяц составила " +summ+ " рублей.");
        System.out.println();


    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int [] arr = generateRandomArray();
        int max = 0;
        int min = 200_001;

        for (final int current : arr) {
            if (max <= current) {
                max = current;
            } else if (min >= current) {
                min = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +min+ " рублей.");
        System.out.println("Максимальная сумма трат за день составила " +max+ " рублей.");
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int [] arr = generateRandomArray();
        float average = 0;
        int numbers = 0;
        int summ = 0;

        for (int j : arr) {
            summ = summ + j;
            numbers++;
        }
        average = (float) summ / numbers;
        System.out.println("Средняя сумма трат за месяц составила " +average+ " рублей.");
        System.out.println();

    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reverseFullName.length - 1; j >= 0;  j--) {
            System.out.print(reverseFullName[j]);
        }
        System.out.println();
        System.out.println();
    }

}
