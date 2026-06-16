/**
 * Selection Sort
 *
 * Description:
 * Finds the smallest element in the unsorted portion of the array
 * and places it in its correct position at each iteration.
 *
 * Time Complexity:
 * Best Case: O(n²)
 * Average Case: O(n²)
 * Worst Case: O(n²)
 *
 * Space Complexity:
 * O(1)
 *
 * Characteristics:
 * Stable: No
 * In-Place: Yes
 * Adaptive: No
 *
 * Strategy:
 * Selection
 */

package elementarysorts.selectionsort;

import interfaces.ISort;

public class SelectionSort<T extends Comparable<T>> implements ISort<T> {
    
    @Override
    public void sort(T[] array) {
        
        for (int i = 0; i < (array.length - 1); i++) {
            
            int minIndex = i;
            
            for (int j = i + 1 ; j < array.length; j++) {
                
                if (array[j].compareTo(array[minIndex]) < 0) {
                    
                    minIndex = j;
                    
                }
                
            }
            
            T temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
            
        }
        
    }
    
}
