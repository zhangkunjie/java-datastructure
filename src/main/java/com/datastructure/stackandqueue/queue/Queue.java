package com.datastructure.stackandqueue.queue;
/*
 *队列：先进先出 
 */
public class Queue {
	   private int maxSize;//队列最大存储数量
	   private long[] queArray;//队列主体数组
	   private int front;//队列头部
	   private int rear;//队列尾部
	   private int nItems;//队列中的数据数量
	  //--------------------------------------------------------------
	   public Queue(int s)          // constructor
	      {
	      maxSize = s;
	      queArray = new long[maxSize];
	      front = 0;
	      rear = -1;
	      nItems = 0;
	      }
	//--------------------------------------------------------------
	   public void insert(long j)      // put item at rear of queue
	      {
	      if(rear == maxSize-1)         // deal with wraparound
	         rear = -1;
	      queArray[++rear] = j;         // increment rear and insert
	      nItems++;                     // one more item
	      }
	//--------------------------------------------------------------
	   public long remove()         // take item from front of queue
	      {
	      long temp = queArray[front++]; // get value and incr front
	      if(front == maxSize)           // deal with wraparound
	         front = 0;
	      nItems--;                      // one less item
	      return temp;
	      }
	//--------------------------------------------------------------
	   public long peekFront()      // peek at front of queue
	      {
	      return queArray[front];
	      }
	//--------------------------------------------------------------
	   public boolean isEmpty()    // true if queue is empty
	      {
	      return (nItems==0);
	      }
	//--------------------------------------------------------------
	   public boolean isFull()     // true if queue is full
	      {
	      return (nItems==maxSize);
	      }
	//--------------------------------------------------------------
	   public int size()           // number of items in queue
	      {
	      return nItems;
	      }
	//--------------------------------------------------------------
	   }  // end class Queue
	////////////////////////////////////////////////////////////////
