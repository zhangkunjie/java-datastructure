package com.datastructure.stackandqueue.test;
public class Test {
 public static void main(String[] args) {
	Reverse reverse=new Reverse();
	System.out.println(reverse.reverse("ABC"));
	String inputStr[]="i love you".split(" ");
	String resultStr="";
	for(int n=0;n<inputStr.length;n++)
	{
		resultStr+=reverse.reverse(inputStr[n])+" ";
	}	
	System.out.println(resultStr);
 }
}
