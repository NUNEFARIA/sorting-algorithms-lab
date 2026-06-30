package efficientsorts.quicksort;

import interfaces.ISort;

public class QuickSort<T extends Comparable<T>> implements ISort<T> {

    @Override
    public void sort(T[] array) {

        if (array == null || array.length <= 1) {
            return;
        }

        quickSort(array, 0, array.length - 1);

    }

    private void quickSort(T[] array, int left, int right) {

        if (left < right) {

            int pivot = partition(array, left, right);
            quickSort(array, left, pivot - 1);
            quickSort(array, pivot + 1, right);

        }

    }

    private int partition(T[] array, int left, int right) {

        T pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {

            if (array[j].compareTo(pivot) <= 0) {

                i++;
                swap(array, i, j);
            }
        }

        i++;
        swap(array, i, right);
        return i;

    }

    private void swap(T[] array, int i, int j) {

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
