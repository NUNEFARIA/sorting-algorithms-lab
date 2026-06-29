package efficientsorts;

import interfaces.ISort;

public class MergeSort<T extends Comparable<T>> implements ISort<T> {


    @Override
    public void sort(T[] array) {

    }

    public void mergeSort(T[] array, int left, int right) {

        if (left < right) {

            int middle = (left + right)/2;
            mergeSort(array, left, middle);
            mergeSort(array,middle+1, right);
            merge(array, right, middle, right);
        }

    }

    public void merge(T[] array, int right, int meddle, int left) {



    }
}
