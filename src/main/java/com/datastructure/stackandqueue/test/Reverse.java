package com.datastructure.stackandqueue.test;

public class Reverse {
public String reverse(String inputStr)
{
	String returnStr="";
	CharStack charStack=new CharStack(inputStr.length());
	for(int n=0;n<inputStr.length();n++)
	{
	   	charStack.push(inputStr.charAt(n));
	}
	for(int n=0;n<inputStr.length();n++)
	{
		returnStr+=charStack.pop();
	}
	return returnStr;
 }
}
