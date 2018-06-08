package com.datastructure.seniorsort.quicksort1;

public class QuickSort1App {
	public static void main(String[] args) {
		int maxSize = 5; // array size
		ArrayIns arr;
		arr = new ArrayIns(maxSize); // create array

		for (int j = 0; j < maxSize; j++) // fill array with
		{ // random numbers
			long n = (int) (Math.random() * 99);
			arr.insert(n);
		}
		arr.display(); // display items
		arr.quickSort(); // quicksort them
		arr.display(); // display them again
	} // end main()
} // end class QuickSort1App
// //////////////////////////////////////////////////////////////
