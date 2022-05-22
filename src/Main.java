public class Main {

    public static void main(String[] args) {
        int balance = 100;
        int amount = 1100;
        int limit = 1;

        int bonus = amount / 100 * limit;

        if (amount < 1000) {
            bonus = 0;
        }
        if (amount >= 1000) {
            bonus = amount / 100 * limit;
        }

        int total = balance + bonus;

        System.out.println(total = amount + balance + bonus);


    }
}

