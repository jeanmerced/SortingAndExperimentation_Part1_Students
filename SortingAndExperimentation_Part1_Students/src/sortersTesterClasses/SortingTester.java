package sortersTesterClasses;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;
import sorterClasses.HeapSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

public class SortingTester {

	public static void main(String[] args) { 
		
		Integer[] arr = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		
		Sorter<Integer> sorter;
		
		sorter = new BubbleSortSorter<>();
		sorter.sort(arr, new IntegerComparator1());
		showArray("Testing BubbleSort: Comparator1", arr);
		sorter.sort(arr, new IntegerComparator2());
		showArray("Testing BubbleSort: Comparator2", arr);
		
		sorter = new InsertionSortSorter<>();
		sorter.sort(arr, new IntegerComparator1());
		showArray("Testing InsertionSort: Comparator1", arr);
		sorter.sort(arr, new IntegerComparator2());
		showArray("Testing InsertionSort: Comparator2", arr);
		
		sorter = new SelectionSortSorter<>();
		sorter.sort(arr, new IntegerComparator1());
		showArray("Testing SelectionSort: Comparator1", arr);
		sorter.sort(arr, new IntegerComparator2());
		showArray("Testing SelectionSort: Comparator2", arr);
		
		sorter = new HeapSortSorter<>();
		sorter.sort(arr, new IntegerComparator1());
		showArray("Testing HeapSort: Comparator1", arr);
		sorter.sort(arr, new IntegerComparator2());
		showArray("Testing HeapSort: Comparator2", arr);
		
	}
	
	private static void showArray(String msg, Integer[] a) {
		System.out.println(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}
}
