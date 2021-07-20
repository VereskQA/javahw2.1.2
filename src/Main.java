public class Main {
    public static void main(String[] args) {
        int balance = 1755;
        int addingFunds = 1250;
        int bonus;

        if (addingFunds >= 1000) {
            bonus = addingFunds / 100;
        } else {
            bonus = 0;
        }
        int resultBalance = balance + addingFunds + bonus;

        System.out.println("Текущий баланс: " + resultBalance);
        System.out.println("Бонусных рублей начислено: " + bonus);
    }
}
