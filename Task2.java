/**
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
 */
public class Task2 {
    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        double average1 = 0;
        double average2 = 0;

        double summa1 = 0;
        double summa2 = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 6);
            System.out.print(array1[i] + " ");
        }

        for (int i = 0; i < array1.length; i++) {
            summa1 = summa1 + array1[i];
            average1 = summa1 / array1.length;
        }

        System.out.println();
        System.out.println("Average of the first array is " + String.format("%.5f", average1));

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 6);
            System.out.print(array2[i] + " ");
        }

        for (int i = 0; i < array1.length; i++) {
            summa2 = summa2 + array2[i];
            average2 = summa2 / array2.length;
        }
        System.out.println();
        System.out.println("Average of the second array is " + String.format("%.5f", average2));


        if (average1 > average2) {
            System.out.println("Average of the first array is bigger");
        }
        if (average1 < average2) {
            System.out.println("Average of the second array is bigger");
        }
        else {
            System.out.println("Arrays have the same average");
        }

    }
}
