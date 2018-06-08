package com.datastructure.simplesort.work;
/*3.1 bubbleSort.java�����嵥3.1����BubbleSortר��applet�У�in�����������Ǵ��� 
���ƶ��ģ�ֱ���ҵ��������������ƶ����ұߵ�out�����⡣�޸�bubbleSort()������ 
ʹ����Ϊ˫���ƶ��ġ�������in����������ǰһ��������������������Ƶ��ң������� 
��out����λ��ʱ������ͷ������С������������Ƶ�����Ҫ�����ⲿ����������һ���� 
�ұߣ���ǰ��out����������һ������ߡ�*/
public class DoubleBubbleSort {
   public static void main(String[] args) {
	   int a[]=new int[]{2,1,6,3,8,4,9};
	   int leftout = 0, rightout = a.length- 1, in; // leftout,rightoutΪ��������ָ��  
       for (; rightout > leftout; rightout--, leftout++) {  
           for (in = leftout + 1; in < rightout; in++)  
            if (a[in] > a[in + 1])  
            	{
            	int temp = a[in];
                a[in] = a[in+1];
                a[in+1] = temp;
                }
           
           for (in = rightout - 1; in > leftout; in--)  
               if (a[in] < a[in - 1])  
               {
               int temp = a[in];
               a[in] = a[in-1];
               a[in-1] = temp;
           }
       }  
       for(int n:a)
       {
        System.out.print(n);	
       }
  }
}
