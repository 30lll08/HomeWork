package zotov;

//Даны 3 переменные:
//        - operand1 (double)
//        - operand2 (double)
//        - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
//        Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
//        Протестировать функцию в main.
//        Например:
//        Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
//        Результат: 34.5 (24.4 + 10.1)

public class variables3 {

    public static void main(String[] args) {
        double operand1 = 20.6, operand2 = 10.4;
        char operation = '+';
        double x = getResult(operand1, operand2, operation);
        System.out.println(x + " (" + operand1 + " " + operation + " " + operand2 + ")");

    }

    public static double getResult(double operand1, double operand2, char operation) {
        double result = 0;
        if (operation == '+') {
            result = operand1 + operand2;
        }
        if (operation == '-') {
            result = operand1 - operand2;
        }
        if (operation == '*') {
            result = operand1 * operand2;
        }
        if (operation == '/') {
            result = operand1 / operand2;
        }
        if (operation == '%') {
            result = operand1 % operand2;
        }
        return result;
    }

}
