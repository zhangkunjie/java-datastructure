package com.datastructure.simplesort.oddevensort;
//��ż����
public class OddEvenSort {
	  public static void main(String[] args) {
		//����һ�������ظ����ݵ�����������
		int a[]=new int[]{2,1,3,5,8,4,9};
		int  nElems=a.length;
		boolean change=true;//�����ı�־λ
		while (change) {
	    change=false;
	    for(int i=0;i<nElems-1;i+=2)
			 {  
			    if(a[i]>a[i+1])
			    {
			       int temp=0;
			       temp=a[i];
			       a[i]=a[i+1];
			       a[i+1]=temp;	
			       change=true;
			    }
			 } 
	    for(int j=1;j<nElems-1;j+=2)
		 {  
		    if(a[j]>a[j+1])
		    {
		       int temp=0;
		       temp=a[j];
		       a[j]=a[j+1];
		       a[j+1]=temp;	
		       change=true;
		    }
		 } 
			
		}
		 for(int m:a)
		 {
		  System.out.print(m+" ");	
		 }
		}
	}
