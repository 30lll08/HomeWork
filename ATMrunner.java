package dima.homework.oop;

import pgs.ATM;

/**
 * Создать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 20, 50 и 100.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */

public class ATMrunner {
    public static void main(String[] args) {
        ATM atm = new ATM(5, 2, 1);
        atm.addCash(0, 2, 0);
        System.out.println(atm.cashOut(190));
    }
}