package com.datastructure.simplesort.work;

public class InsertSortNodups {
  public static void main(String[] args) {
	  int a[]=new int[]{2,1,6,3,8,4,9,2,6};
	    int in,out;
	    for(out=1;out<a.length;out++)
	    {    int temp=a[out];
	         in=out;
	    	 while(in>0&&a[in-1]>temp)
	    	 {
	    		 a[in]=a[in-1];
	    		 --in;
	    	 }
	    	 a[in]=temp;
	    }
	    for(int n:a)
	    {
	     System.out.print(n);	
	    }
  }
}
