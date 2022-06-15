public class Main {
    public static void main(String[] args) {
        int check = 100; // начальный счет
        int pay = 1420; // сумма пополнения
        int bonus;
        if (pay>=1000) {
            bonus = pay / 100;
        } else  {
           bonus = 0;
        }
        int summa = check + pay + bonus;

        System.out.println("Сумма бонусов: " + bonus);
        System.out.println("Сумма на счете: " + summa);
    }
}
