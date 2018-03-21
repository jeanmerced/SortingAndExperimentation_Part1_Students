package sortersTesterClasses;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;

public class EnteroComparatorTester {
	
	public static void main(String[] args) { 
		 
		Entero[] arr = new Entero[5];
		arr[0] = new Entero(8);
		arr[1] = new Entero(5);
		arr[2] = new Entero(11);
		arr[3] = new Entero(6);
		arr[4] = new Entero(8);
		
		Sorter<Entero> sorter = new BubbleSortSorter<Entero>();
		sorter.sort(arr, null);
	}

}
