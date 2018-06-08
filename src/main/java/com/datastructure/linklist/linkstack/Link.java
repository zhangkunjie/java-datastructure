package com.datastructure.linklist.linkstack;
//用链表实现的栈
public class Link {
	   public long dData;             // data item
	   public Link next;              // next link in list
	// -------------------------------------------------------------
	   public Link(long dd)           // constructor
	      { dData = dd; }
	// -------------------------------------------------------------
	   public void displayLink()      // display ourself
	      { System.out.print(dData + " "); }
	   }  // end class Link
////////////////////////////////////////////////////////////////
