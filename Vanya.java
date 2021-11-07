package zotov;

/*Программист Ваня сразу после окончания курсов dmdev устроился в
        IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
        Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.

        300$ в месяц Ваня тратит на еду и развлечения.
        10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.

        Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.*/

public class Vanya {
    public static void main(String[] args) {
        int salary = 600;
        int life = 300;
        int researchTime = 38;
        double partForInvest = 0.1;
        int salaryUpPeriod = 6;
        int salaryUpValue = 400;

        double sum = 0;
        double investition = 0;
        int n = 1;

        System.out.println("месяц  " + "  Зарплата  " + "  Счет Вани  " + "  Инвестиции  ");

        for (int i = 1; i <= researchTime; i++) {
            if (i == 1 + salaryUpPeriod * n) {
                salary = salary + salaryUpValue;
                n = n + 1;
            }
            sum = sum + salary - life - partForInvest * salary;

            if (i == 1) {
                investition = investition + partForInvest * salary;
            }
            if (i >= 2) {
                investition = investition * 1.02 + partForInvest * salary;
            }
            // за каждый месяц
         //   System.out.println(i + "          " + salary + "        " + sum + "        " + investition);
        }
        System.out.println(researchTime + "        " + salary + "        " + sum + "    " + investition);


    }
}