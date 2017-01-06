import java.util.Arrays;
import java.util.Scanner;

import static com.sun.jmx.snmp.ThreadContext.contains;

/**
 * Создайте массив из 8 случайных целых чисел из отрезка [1;10].
 * Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
 */
public class Task1 {

    public static void main(String[] args) {

        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;

            if (i % 2 != 0) {

                array[i] = 0;
            }

            System.out.print(array[i] + " ");
        }
    }
}





