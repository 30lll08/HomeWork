package Array;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными
 * элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class Task1 {

    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};
        int[] values2 = new int[getSizeValue2(values)];
        fillValues2(values, values2);
        multiplyArrayBySize(values2);
    }

    public static int getSizeValue2(int[] values) {
        int sizeWithoutMinus = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                sizeWithoutMinus = sizeWithoutMinus + 1;
            }
        }
        return sizeWithoutMinus;
    }

    public static void fillValues2(int[] values, int[] values2) {
        int i = 0;
        for (int j = 0; j < getSizeValue2(values); i++) {
            if (values[i] >= 0) {
                values2[j] = values[i];
                System.out.print(values2[j] + "  ");
                j = j + 1;
            }
        }
        System.out.println();
    }

    public static void multiplyArrayBySize(int[] values2) {
        for (int i = 0; i < values2.length; i++) {
            values2[i] = values2[i] * values2.length;
            System.out.print(values2[i] + " ");
        }
        System.out.println();
    }
}