import java.math.*;
import java.util.Scanner;

public class Currency_convert {

    public static void main(String args[]) {

                // Program info

        System.out.println("Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.");

                // Data processing

        boolean success_flag_1 = true, success_flag_2 = true;
        double sum_rub = 0.0, usd_exchange_rate = 0.0;

        do {

            try {

                Scanner in = new Scanner(System.in);
                System.out.println("Введите текущий курс доллара: ");
                System.out.print("1 USD = ");
                usd_exchange_rate = in.nextDouble();
                success_flag_1 = !success_flag_1;

            } catch (java.util.InputMismatchException e) {

                System.out.println("Ошибка ввода: введите число!");

            }

        } while (success_flag_1);

        do {

            try {

                Scanner in = new Scanner(System.in);
                System.out.println("Введите сумму в рублях для конвертации: ");
                System.out.print("Сумма = ");
                sum_rub = in.nextDouble();
                success_flag_2 = !success_flag_2;

            } catch (java.util.InputMismatchException e) {

                System.out.println("Ошибка ввода: введите число!");

            }

        } while (success_flag_2);

        BigDecimal usd_sum = new BigDecimal(sum_rub / usd_exchange_rate).setScale(2, RoundingMode.HALF_UP);

                // Output data

        System.out.println("Всего USD = " + usd_sum);

    }

}