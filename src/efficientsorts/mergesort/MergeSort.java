package efficientsorts.mergesort;

import interfaces.ISort;

public class MergeSort<T extends Comparable<T>> implements ISort<T> {


    @Override
    public void sort(T[] array) {

        if (array == null || array.length <= 1) {
            return;
        }
        mergeSort(array, 0, array.length-1);
    }

    private void mergeSort(T[] array, int left, int right) {

        if (left < right) {

            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array,middle+1, right);
            merge(array, left, middle, right);
        }

    }

    private void merge(T[] array, int left, int middle, int right) {

        int indexLeft = left;
        int indexRight = middle +1;

        // Solution from ChatGPT allow to create array generic type
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Comparable[right - left + 1];
        int indexTemp = 0;

        while (indexLeft <= middle && indexRight <= right) {

            if (array[indexLeft].compareTo(array[indexRight]) <= 0) {

                temp[indexTemp++] = array[indexLeft++];

            }
            else {

                temp[indexTemp++] = array[indexRight++];

            }
        }

        while (indexLeft <= middle) {
            temp[indexTemp++] = array[indexLeft++];
        }

        while (indexRight <= right) {
            temp[indexTemp++] = array[indexRight++];
        }

        for (int i = 0; i < temp.length; i++) {
            array[left + i] = temp[i];
        }

    }
}
