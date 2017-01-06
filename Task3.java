/**
 * Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            array[i] = (int) ((Math.random() * 90) + 10);
            System.out.print(array[i] + " ");

            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }

        if (array[maxIndex] != array[array.length - 1]) {
            System.out.println("Последовательность не является строго возрастающей");
        }
    }
}

