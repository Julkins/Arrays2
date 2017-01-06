/**
 * Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего массива должен равняться отношению
 * элемента из первого массива с i-ым индексом к элементу  из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых
 * элементов в третьем массиве.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];

        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) ((Math.random() * 10) + 1);
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) ((Math.random() * 10) + 1);
            System.out.print(array2[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array3.length; i++) {
            array3[i] = (double)array1[i] / (double) array2[i];
            System.out.print(array3[i] + " ");


            if (array3[i] % 1 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("В третьем массиве " + count + " целых чисел");
    }
}
