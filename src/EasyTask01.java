import java.util.Scanner;

/*
Простая задача 1:Проверка деления на ноль
   Напишите программу,которая запрашивает у пользователя два целых числа и выполняет их деление.
   Если второе число равно нулю,выбросите исключение ArithmeticException с сообщением"Деление на ноль недопустимо".
   Иначе выведите результат деления на экран.
 */

public class EasyTask01 {
    private int numberFirst;
    private int numberSecond;
    private int result;
    private final Scanner scanner;
    private final String INPUT_STRING = "Введите два числа:\n";
    private final String INPUT_STRING_FIRST_NUMBER = "Введите первое число: ";
    private final String INPUT_STRING_SECOND_NUMBER = "Введите второе число: ";
    private final String CUSTOM_EXCEPTION = "Деление на ноль недопустимо";

    public EasyTask01() {
        this.numberFirst = 0;
        this.numberSecond = 0;
        this.result = 0;
        this.scanner = new Scanner(System.in);
    }

    public void run(){
        inputNumbers();
        divide();
    }

    private void inputNumbers() {
        System.out.println(INPUT_STRING);
        System.out.println(INPUT_STRING_FIRST_NUMBER);
        this.numberFirst = Integer.parseInt(scanner.nextLine());

        System.out.println(INPUT_STRING_SECOND_NUMBER);
        this.numberSecond = Integer.parseInt(scanner.nextLine());
    }

    private void divide() {
        checkZero();
        this.result = this.numberFirst / this.numberSecond;
        System.out.println(this.result);
        scanner.close();
    }

    private void checkZero() {
        if (numberSecond == 0) {
            scanner.close();
            throw new ArithmeticException(CUSTOM_EXCEPTION);
        }
    }
}
