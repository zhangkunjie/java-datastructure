package com.datastructure.stackandqueue.test;

public class CharStack {
private  int   maxSize;
private char[] stackArray;
private int top;
  public CharStack(int s)
  {   
	maxSize=s;
	stackArray=new char[maxSize];
	top=-1;
 
  }
  public void push(char j)
  {
	  stackArray[++top]=j;
  }
  public char  pop()
  {
	  return stackArray[top--];
  }
  public char  peek()
  {
	  return stackArray[top];
  }
  public boolean isEmpty()
  {
	  return (top==1);
	  
  }
  public boolean isFull()
  {
	  return (top==maxSize-1);
  }
  
}