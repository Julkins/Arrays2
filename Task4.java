/**
 * Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[20];

        array[0] = 1;
        array[1] = 1;

        System.out.println(array[0]);
        System.out.println(array[1]);

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];

            System.out.println(array[i]);

        }
    }
}

