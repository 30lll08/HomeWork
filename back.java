package zotov;
//Дано целое число.
//        Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
//        Результат вывести на консоль.
//        Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321

public class back {
    public static void main(String[] args) {
        int x = 1234567;
        System.out.println(x + " -> " + reversal(x));
    }

    public static int reversal(int value) {
        double sum = 0;
        double valueBack = 0;
        int valueCopy = value;
        int valueCopy2 = value;
        int i = 1;

        while (valueCopy / 10 > 10) {
            int remainder = valueCopy % 10;
            valueCopy = valueCopy / 10;
            i = i + 1;
        }

        for (int r = i; r >= 0; r--) {
            int remainder = valueCopy2 % 10;
            sum = remainder * Math.pow(10, r);
            valueBack = valueBack + sum;
            valueCopy2 = valueCopy2 / 10;
        }

        int valueBackInt = (int) valueBack;
        return valueBackInt;
    }


}