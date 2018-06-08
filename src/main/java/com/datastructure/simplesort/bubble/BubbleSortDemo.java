package com.datastructure.simplesort.bubble;
/*
   ð�������㷨��
   �����鳤��ΪN��
1���Ƚ����ڵ�ǰ��������ݣ����ǰ�����ݴ��ں�������ݣ��ͽ��������ݽ�����
2������������ĵ�0�����ݵ�N-1�����ݽ���һ�α���������һ�����ݾ͡������������N-1��λ�á�
3��N=N-1�����N��Ϊ0���ظ�ǰ�����������������ɡ�
 */
public class BubbleSortDemo {
  public static void main(String[] args) {
    int a[]=new int[]{2,1,6,3,8,4,9};
    int in,out;
    for(out=a.length-1;out>0;out--)
    {   
    	for(in=0;in<out;in++)
    	{
    		if(a[in]>a[in+1])
    		{
    			int temp=a[in];
    			a[in]=a[in+1];
    			a[in+1]=temp;
    		}
    	}
    }
    for(int n:a)
    {
     System.out.print(n);	
    }
  }
}
