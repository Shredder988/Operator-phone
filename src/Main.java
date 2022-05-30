public class Main {
    public static void main(String[] args) {
        int personalAccount = 100; // начальный счет
        int paymentInvoice = 1300; // сумма пополнения
        int bonus;
        if (paymentInvoice > 1000) {
            bonus = paymentInvoice / 100;
        } else {
            bonus = 0;
        } int balance = personalAccount + paymentInvoice + bonus;
        System.out.println("Здравствуйте, спасибо за ваш платеж. Ваш баланс: " + balance + " руб. Ваш бонус: " + bonus + " руб.");
    }
}
