package SemDZ_2;
/*
 * Задание 1. Реализуйте метод, который запрашивает у пользователя ввод 
 * дробного числа (типа float), и возвращает введенное значение. Ввод 
 * текста вместо числа не должно приводить к падению приложения, вместо 
 * этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        numberFloat();
        
    }

    // метод ввода дробного числа
    public static void numberFloat() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.print("Введите дробное число: ");
            try{
                Float fNumber = Float.parseFloat(reader.readLine());
                System.out.printf("\nВведённое число = %f\n", fNumber);
                break;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число!!!");
            }
        }    
    }
}
