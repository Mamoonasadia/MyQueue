/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMOONA SADIA
 */
class Queue
   {
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int Items;
   public Queue(int s)      
      {
      maxSize = s;
      queArray = new long[maxSize];
      front = 0;
      rear = -1;
      Items = 0;
      }

   public void push(long j)   
      {
      if(rear == maxSize-1)       
         rear = -1;
      queArray[++rear] = j;     
      Items++;                    
      }

   public long pop()       
      {
      long temp = queArray[front++];
      if(front == maxSize)           
         front = 0;
      Items--;                     
      return temp;
      }
   public boolean isEmpty()    // true if queue is empty
      {
      return (Items==0);
      }
//--------------------------------------------------------------
   public boolean isFull()     // true if queue is full
      {
      return (Items==maxSize);
      }

}