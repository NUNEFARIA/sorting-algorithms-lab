/**
 * Bubble Sort
 *
 * Description:
 * Repeatedly compares adjacent elements and swaps them when they
 * are in the wrong order. After each iteration, the largest
 * unsorted element "bubbles up" to its correct position.
 *
 * Time Complexity:
 * Best Case: O(n)      // With early-exit optimization
 * Average Case: O(n²)
 * Worst Case: O(n²)
 *
 * Space Complexity:
 * O(1)
 *
 * Characteristics:
 * Stable: Yes
 * In-Place: Yes
 * Adaptive: Yes        // With early-exit optimization
 *
 * Strategy:
 * Exchange Sort
 */

package elementarysorts.bubblesort;

import interfaces.ISort;

    public class BubbleSort<T  extends Comparable<T>> implements ISort<T> {
        
        @Override
        public void sort(T[] array) {
            
            int size = (array.length - 1);
            boolean swapped;
            
            for (int i = 0; i < (array.length - 1); i++) {
                
                swapped = false;
                
                for (int j = 0; j < size; j++) {
                    
                    if(array[j].compareTo(array[j+1]) > 0 ) {
                        T temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                
                if (!swapped) {
                    break;
                }
                size--;
            }
        }
    }
