/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 * 
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            System.out.println(getString());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputStr = scanner.nextLine();
        if (inputStr == "") {
            throw new RuntimeException("Ввод пустых строк не допускается");
        }
        return inputStr;
    }
}
