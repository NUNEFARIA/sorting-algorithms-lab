package elementarysorts.incertionsort;

import interfaces.ISort;

public class InsertionSort<T extends Comparable<T>> implements ISort<T> {


    @Override
    public void sort(T[] array) {

        for (int i = 1; i < array.length; i++) {

            T key = array[i];
            int j = i - 1;

            while (j >= 0 && key.compareTo(array[j]) < 0) {

                array[j + 1] = array[j];
                j--;

            }

            array[j + 1] = key;
        }
    }
}
