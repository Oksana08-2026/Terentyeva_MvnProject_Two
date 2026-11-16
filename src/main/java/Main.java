import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int deposit = 100;
        int amountDeposit = 1600;
        int bonusLimit = 1000;
        int bonus;
        if (amountDeposit > bonusLimit) {
            bonus = amountDeposit / 100;
        } else {
            bonus = 0;
        }
        int total = deposit + amountDeposit + bonus;
        System.out.println("Бонусные рубли:" + bonus);
        System.out.println("Итоговая сумма на счёте:" + total);
    }
}
