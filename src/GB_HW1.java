public class GB_HW1 {
    public static void main(String[] args) {

        System.out.println("Здание 1");
        int a = 5;
        int b = 12;
        boolean isBetween = isBetween10And20(a, b);
        System.out.println(isBetween);

        System.out.println("Здание 2");
        isPositiveOrNegative(5);

        System.out.println("Здание 3");
        boolean isNegative = isNegative( -3);
        System.out.println(isNegative);

        System.out.println("Здание 4");
        printWordNTimes("Hello!!!", 6);

        System.out.println("Здание 5");

    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean isBetween10And20(int left, int right) {
        int sum = left + right;
        return 10 < sum && sum <= 20;
    }

    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void isPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }
    //3. Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        }
            return false;
    }
    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
    //отпечатать в консоль указанную строку, указанное количество раз
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
    //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
    //не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
    //при этом каждый 400-й – високосный.
}



