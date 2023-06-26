/*
Простая задача 2:Обработка некорректного ввода
   Напишите программу,которая запрашивает у пользователя его возраст.
   Если введенное значение не является числом,выбросите исключение NumberFormatException с сообщением"Некорректный ввод".
   Иначе выведите возраст на экран.
 */

import java.util.Scanner;

public class EasyTask02 {
    private String age;
    private final Scanner scanner;
    private final String INPUT_STRING = "Введите свой возраст: ";
    private final String CUSTOM_EXCEPTION = "Некорректный ввод";

    public EasyTask02() {
        this.age = "";
        this.scanner = new Scanner(System.in);
    }

    public void run(){
        inputAge();
        checkAge();
        printAge();
    }

    private void inputAge() {
        System.out.println(INPUT_STRING);
        this.age = scanner.nextLine();
    }

    private void printAge() {
        System.out.println(this.age);
    }

    private void checkAge() {
        try {
            Integer.parseInt(this.age);
        } catch(NumberFormatException e){
            System.out.println(CUSTOM_EXCEPTION);
        }
    }
}