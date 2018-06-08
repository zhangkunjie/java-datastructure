package com.datastructure.simplesort.selection;
/*
 ѡ�������㷨��
 �ٶ��������� array[0..n-1], ѡ������ĺ���˼���ǵ� i �������ǴӺ���� 
 n - i + 1��i = 1��2��3��4��. . .��n - 1��
��Ԫ����ѡ��һ��ֵ��С��Ԫ����� n - i + 1 ��Ԫ�ص���ǰ�ŵ��Ǹ�Ԫ�ؽ���λ�ã�
�����������еĵ� i ��Ԫ�ؽ���λ�á������ȥ��ֱ�� i = n - 1�����������
 */
public class SelectionSortDemo {
public static void main(String[] args) {
	    int a[]=new int[]{2,1,5,6,3,8,4,7,9};
	    int in,out,min;
	    for(out=0;out<a.length-1;out++)
	    {   
	    	min=out;
	    	for(in=out+1;in<a.length;in++)
	    	{
	    		if(a[in]<a[out])
	    		{   
	    			min=in;
	    		}
	    	}
	    	int temp=a[out];
			a[out]=a[min];
			a[min]=temp;
	    }
	    for(int n:a)
	    {
	     System.out.print(n+" ");	
	    }
	  }

}
