package com.datastructure.stackandqueue.reverse;

public class StackX {
	   private int maxSize;
	   private char[] stackArray;
	   private int top;
	//--------------------------------------------------------------
	   public StackX(int max)    // constructor
	      {
	      maxSize = max;
	      stackArray = new char[maxSize];
	      top = -1;
	      }
	//--------------------------------------------------------------
	   public void push(char j)  // put item on top of stack
	      {
	      stackArray[++top] = j;
	      }
	//--------------------------------------------------------------
	   public char pop()         // take item from top of stack
	      {
	      return stackArray[top--];
	      }
	//--------------------------------------------------------------
	   public char peek()        // peek at top of stack
	      {
	      return stackArray[top];
	      }
	//--------------------------------------------------------------
	   public boolean isEmpty()  // true if stack is empty
	      {
	      return (top == -1);
	      }
}
