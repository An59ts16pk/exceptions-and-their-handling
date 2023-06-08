package SemDZ_2;
/*
 * Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит
 * пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любой текст: ");
        try {
            String result = reader.readLine();
            if(result.equals(""))
             throw new RuntimeException("Пустую строку вводить нельзя!");
            System.out.println("\nВведённый текст: " + result);
        } finally {
            System.out.println("\n");
        }
    }    
}
