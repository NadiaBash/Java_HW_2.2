import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int balance = 100;
        int amount = 1100;
        int limit = 1;

        int bonus = amount / 100 * limit;

        if (amount > 1000) {
            bonus = amount / 100 * limit;
        } else {
            bonus = 0;
        }

        int total = balance + bonus + amount;

        System.out.println(total);
        System.out.println(bonus);


    }
}

