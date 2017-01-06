/**
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */
public class Task5 {
    public static void main(String[] args) {

        int[] array = new int[12];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            array[i] = (int) ((Math.random() * 31) - 15);
            System.out.print(array[i] + " ");

            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        System.out.println("Max array element is " + array[maxIndex] + ", its index is " + maxIndex);
    }
}

