public class Main {
    // Объявить метод «сгенерироватьМассив»

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
        System.out.println(summ);

    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int [] arr = generateRandomArray();
        int max = 0;
        int min = 200_001;

        for (final int current : arr) {
            if (max < current) {
                max = current;
            } else if (min > current) {
                min = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +min+ " рублей.");
        System.out.println("Максимальная сумма трат за день составила " +max+ " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3

    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4

    }

    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5

    }

    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6

    }

    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7

    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8

    }

}
