package zotov;

/*Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
        Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр
        (вторая функция - нечетных).
        Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).*/


public class EvenAndOdd {
    public static void main(String[] args) {
        int value = 12347778;
        int evenN = even(value);
        int oddN = odd(value);
        System.out.println("У числа " + value + " " + evenN + " четных" + " и " + oddN + " нечетных");
    }

    public static int even(int x) {
        int i = 0;
        while (x > 0) {
            int remainder = x % 10;
            if (remainder % 2 == 0) {
                i = i + 1;
                System.out.println(remainder + " ");
            }
            x = x / 10;
        }
        System.out.println("Количество четных цифр " + i);
        return i;
    }

    public static int odd(int x) {
        int i = 0;
        while (x > 0) {
            int remainder = x % 10;
            if (remainder % 2 != 0) {
                i = i + 1;
                System.out.println(remainder + " ");
            }
            x = x / 10;
        }
        System.out.println("Количество нечетных цифр " + i);
        return i;
    }

}
