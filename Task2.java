package Array;
/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */
public class Task2 {

    public static void main(String[] args) {
        char[] charArray = new char[]{'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int middle = reverse(charArray);
        printBiggerThanMiddle(middle, charArray);
    }

    public static int reverse(char[] charArray) {
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            System.out.print((int) charArray[i] + " ");
            sum = (sum + (int) charArray[i]);
        }
        System.out.println();
        int middle = sum / charArray.length;
        System.out.println("Среднее арифмитическое: " + middle);
        return middle;
    }

    public static void printBiggerThanMiddle(int middle, char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            if ((int) charArray[i] > middle) {
                System.out.print((int) charArray[i] + " ");
            }
        }
    }
}






