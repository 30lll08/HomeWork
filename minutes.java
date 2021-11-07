package zotov;

//В переменной minutes лежит число от 0 до 59.
//        Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
//        в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
//        Протестировать функцию в main.


public class minutes {
    public static void main(String[] args) {
        int minutes = 30;
        getQuarter(minutes);
    }

    public static void getQuarter(int minutes) {
        if (minutes > 59 || minutes < 0) {
            System.out.println("Неверные параметры");
        }
        if (minutes >= 0 && minutes < 15) {
            System.out.println("1 четверть");
        } else if (minutes >= 15 && minutes < 30) {
            System.out.println("2 четверть");
        } else if (minutes >= 30 && minutes < 45) {
            System.out.println("3 четверть");
        } else if (minutes >= 45 && minutes < 60) {
            System.out.println("4 четверть");
        }
    }
}
