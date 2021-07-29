public class GB_HW1 {

        // Задание 1
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
        //Задание 2
        public static void printThreeWords () {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        //Задание 3
        public static void checkSumSign () {
            int a = 15;
            int b = -20;
            int sum = a + b;

            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

        //Задание 4
        public static void printColor () {
            int value = 170;

            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 0 & value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }

        //Задание 5
        public static void compareNumbers () {
            int a = 10;
            int b = 5;

            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }
    }
