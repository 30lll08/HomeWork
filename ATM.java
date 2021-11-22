package dima.homework.oop;

public class ATM {
    private int countB20;
    private int countB50;
    private int countB100;

    public ATM(int countB20, int countB50, int countB100) {
        this.countB20 = countB20;
        this.countB50 = countB50;
        this.countB100 = countB100;
    }

    public void addCash(int countB20, int countB50, int countB100) {
        this.countB20 += countB20;
        this.countB50 += countB50;
        this.countB100 += countB100;
    }

    public void printResult() {
        System.out.println(" номинал 20 -- " + countB20 + " шт  | номинал 50 -- " + countB50 + " шт  | количество 100 -- " + countB100 + " шт");
    }

    public boolean cashOut(int value) {
        if (value < 20 || value % 10 != 0 || value == 30) {
            return false;
        } else {
            int i = 0;
            while (value >= 100 && countB100 > 0 && (value - 100 != 30) && (value - 100 != 10)) {
                value = value - 100;
                countB100--;
                i++;
            }
            int j = 0;
            while (value >= 50 && countB50 > 0 && (value - 50 != 30) && (value - 50 != 10)) {
                value = value - 50;
                countB50--;
                j++;
            }
            int k = 0;
            while (value >= 20 && countB50 > 0 && (value - 20 != 10)) {
                value = value - 20;
                countB20--;
                k++;
            }
            System.out.println("Номинал 100 " + i + " шт.");
            System.out.println("Номинал 50 " + j + " шт.");
            System.out.println("Номинал 20 " + k + " шт.");
            return true;
        }

    }
}
