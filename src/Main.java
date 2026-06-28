import elementarysorts.incertionsort.InsertionSort;
import elementarysorts.selectionsort.SelectionSort;
import interfaces.ISort;



public class Main {
    public static void main(String[] args) {

        Integer[] S = {3,56,1,0,34};
        
        for(Integer i : S){
            System.out.printf("%d  ",i);
        }
        
//        ISort<Integer> sorter = new BubbleSort<>();
//        sorter.sort(S);
        
//        ISort<Integer> sorter = new SelectionSort<>();
//        sorter.sort(S);

        ISort<Integer> sorter = new InsertionSort<>();
        sorter.sort(S);

        System.out.println();
        
        for(Integer i : S){
            System.out.printf("%d  ",i);
        }
    }
}