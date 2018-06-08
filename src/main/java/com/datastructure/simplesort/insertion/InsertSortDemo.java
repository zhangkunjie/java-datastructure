package com.datastructure.simplesort.insertion;
/*
 ���������㷨 
 �����һ��һά���� array[0..n-1], �� i �������ǽ��������±�Ϊ i �ĵ� i + 1 ��Ԫ�ز��뵽һ���Ѿ���ֵ�������е������еĺ���λ�á�
1.��������ʼʱ�� ��һ��Ԫ�ؿ����������У����±�Ϊ i = 1 �ĵڶ���Ԫ�ؿ�ʼ��ÿһ�����򶼽��±�Ϊ i ��Ԫ�ز��뵽֮ǰ�����������У�
Ȼ�� i = i + 1 ������һ��Ԫ�صĲ��������ɴ˿ɼ�����������Ҫ n - 1 ������
2. ÿ��Ѱ�Ҳ���Ԫ�� array[i] ��λ��ʱ�Ǵ��������е����һ��Ԫ�� array[i-1] ��ʼ���ң�ֱ���ҵ�ĳһλ�õ�Ԫ�� array[j] (j >= 0 && j <= i-1)���� array[j] <= array[i], ��ô�±�Ϊ 
j + 1 ��λ�þ�Ӧ���ǲ���Ԫ�� array[i]�ĺ���λ�á����������е����һ��Ԫ�ؿ�ʼ���ң��߲��ұ��ƶ�Ԫ�أ����������ҵ�����λ�����ƶ�Ԫ�أ����������Ч�ʡ�
*/
public class InsertSortDemo {
  public static void main(String[] args) {
    int a[]=new int[]{2,1,6,3,8,4,9};
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
