package com.datastructure.triangle.test;

public class Test {
	public static void main(String[] args) {
		int a[]=new int[]{1,4,7};
		int b[]=new int[]{2,3,5,6};
        int c[]=new int[7];
        
        
        
      
		
		
		
		

	}

	public static int binarySearch(int key,int lowerBounds,int upperBounds) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		while (true) {
			int half = (lowerBounds + upperBounds) / 2;
			if (a[half] == key) {
				return half;
			} else {
				if (a[half] > key) {
					return binarySearch(key,lowerBounds,half);
				} else {
					return binarySearch(key,half,upperBounds);
				}
			}
		}
	}
	
	
	
	
	
}
