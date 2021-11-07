package zotov;

//Даны два прямоугольных треугольника. Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
//        Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
//
//        Для этого понадобится написать 2 функции.
//        Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
//        Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше
//        или равен второму.


public class square {
    public static void main(String[] args) {
        int a = 11;
        int b = 12;

        int a2 = 12;
        int b2 = 10;

        double S1 = S(a, b);
        double S2 = S(a2, b2);
        compareSquare(S1, S2);
    }

    public static double S(int a, int b) {
        double S = (a * b) * 1.0 / 2;
        return S;
    }

    public static void compareSquare(double S1, double S2) {
        if (S1 > S2) System.out.println("S1 = " + S1 + "   >   S2 = " + S2);
        else if (S1 < S2) System.out.println("S1 = " + S1 + "   <   S2 = " + S2);
        else System.out.println("S1 = " + S1 + "   =   S2 = " + S2);
    }
}