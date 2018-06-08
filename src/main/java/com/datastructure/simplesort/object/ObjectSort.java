package com.datastructure.simplesort.object;

public class ObjectSort {
public static void main(String[] args) {
	
	int maxSize = 100; // array size
	ArrayInOb arr; // reference to array
	arr = new ArrayInOb(maxSize); // create the array

	arr.insert("Evans", "Patty", 24);
	arr.insert("Smith", "Doc", 59);
	arr.insert("Smith", "Lorraine", 36);
	arr.insert("Smith", "Paul", 37);
	arr.insert("Yee", "Tom", 43);
	arr.insert("Hashimoto", "Sato", 21);
	arr.insert("Stimson", "Henry", 29);
	arr.insert("Velasquez", "Jose", 72);
	arr.insert("Vang", "Minh", 22);
	arr.insert("Creswell", "Lucinda", 18);

	System.out.println("Before sorting:");
	arr.display(); // display items

	//arr.insertionSort(); // insertion-sort them
	arr.insertSortByAge();
	System.out.println("After sorting:");
	arr.display(); // display them again
}
}
