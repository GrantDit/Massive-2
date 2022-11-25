public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        //Задание 1
        System.out.println("Задание 1");
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
            if (i < 31) ;
            System.out.print("Сумма трат за месяц составила " + summa + " рублей");
        }
        //Задание 2
        System.out.println();
        System.out.println("Задание 2");
        int minimum = arr[0];
        int maximum = arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
            System.out.print("Минимальная сумма трат за день составила " + minimum + " рублей. Максимальная сумма трат за день составила " + maximum + " рублей».");
        }
        //Задание 3
        System.out.println();
        System.out.println("Задание 3");
        double total = summa / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + total + " рублей");


        //Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}