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

        return
    }

}
