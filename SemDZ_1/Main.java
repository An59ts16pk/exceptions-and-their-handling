package SemDZ_1;
/*
* Задание 1. Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения;
* Задание 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
* public static int sum2d(String[][] arr) {
*   int sum = 0;
*   for (int i = 0; i < arr.length; i++) {
*     for (int j = 0; j < 5; j++) {
*       int val = Integer.parseInt(arr[i][j]);
*       sum += val;
*     }
*   }
*   return sum;
* }
* Задание 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
* и возвращает новый массив, каждый элемент которого равен разности элементов двух входящих
* массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить
* пользователя.
* Задание 4. (Не обязательное)* Реализуйте метод, принимающий в качестве аргументов два
* целочисленных массива, и возвращает новый массив, каждый элемент которого равен частному
* элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
* необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное
* исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше. 
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // если b = 0 -> ArithmeticException - делить на ноль нельзя
        System.out.println(divide(8, 2));
        
        // если i > 2 -> ArrayIndexOutOfBoundsException - индекс выходит за пределы массива
        int[] arrayNumber = {1, 2, 3};
        System.out.println(elementArray(arrayNumber, 2));

        // если name = null -> NullPointerException - обращение к не существующему объекту
        String name = "ertyy";
        System.out.println(getSizeString(name));

        // Задание 3. Разность двух массивов
        int[] array_1 = {5, 2, 8, 9};
        int[] array_2 = {2, 6, 1, 9};
        System.out.println(Arrays.toString(arrayIntDifferent(array_1, array_2)));

        // Задание 4. Деление двух массивов
        System.out.println(Arrays.toString(arrayIntDivide(array_1, array_2)));

    }
    
    // Задание 1. Реализуйте 3 метода, чтобы в каждом из них получить разные
    // стандартные для Java исключения;
    public static int divide(int a, int b) {
        return a / b;
    }

    public static int elementArray(int[] arr, int i) {
        return arr[i];
    }

    public static long getSizeString(String str) {
        return str.length();
    }

    // Задание 2. Посмотрите на код, и подумайте сколько разных типов
    // исключений вы тут сможете получить?
    public static int sum2d(String[][] arr) { // на входе может быть null -> NullPointerException
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // размеры массивов могут не совпадать -> 
            for (int j = 0; j < 5; j++) {      // ArrayIndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]); // элементы могут быть буквами -> NumberFormatException
                sum += val;
            }
        }
        return sum;
    }

    // Задание 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращает новый массив, каждый элемент которого равен разности элементов двух входящих
    // массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить
    // пользователя.
    public static int[] arrayIntDifferent ( int[] arr1, int[] arr2){
        int length = arr1.length;
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длина массивов разная.");
        } else {
            int[] result = new int[length];
            for (int i = 0; i < length; i++) {
                result[i] = arr1[i] - arr2[i];
            }
            return result;
        }
    }

    // Задание 4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращает новый массив, каждый элемент которого равен частному элементов двух
    // входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить
    // пользователя. При выполнении метода единственное исключение, которое пользователь может увидеть
    // - RuntimeException, т.е. ваше. 
    public static double[] arrayIntDivide (int[] arr1, int[] arr2){
        int length = arr1.length;
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длина массивов разная.");
        } else {
            double[] result = new double[length];
            for (int i = 0; i < length; i++) {
                if (arr2[i] == 0) {
                    throw new RuntimeException("Аргумент равен нулю - делить на ноль нельзя");
                }
                result[i] = arr1[i] * 1.0 / arr2[i];
            }
            return result;
        }
    }
}
