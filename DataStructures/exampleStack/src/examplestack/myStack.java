package examplestack;

/**
 * <p>Title: Example Stack</p>
 * <p>Description: ADT Stack</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: CSULA</p>
 * @author Alfredo Tigolo III
 * @version 1.0
 */
import java.lang.Object;

public class myStack {

    int capacity = 32; //32 bit Operating System
    //int size = 0; //The max for size is  (capacity -1)
    int size = -1; //because of the isEmpty method
    Object[] o = new Object[capacity];

    public myStack() { }

    public myStack(Object[] ob, int max) {
      this.capacity = max;
      this.o = ob;
    }

    public boolean isFull() {
      boolean tmp = false;
      if (size == capacity -1)
        tmp = true;
       return tmp;
    }

    public boolean isEmpty() {
      boolean tmp = false;
      if (size < 0) //the size is changed from 0 to -1
        tmp = true;
      return tmp;
    }

    //need to return plus one because size, is the index
    public int getSize () { return this.size+1; }

    public void push(Object obj) {
      if(this.isFull())
        System.out.println("Stack is full");
      else
        o[++size] = obj; //increment the size
    }

    public Object pop() {
      Object tmp = null;
      if(this.isEmpty())
        System.out.println("Stack is empty");
      else
        tmp=o[size--];
       return tmp;
    }

    //want to look at the top element
    public void peek() {
      System.out.println(o[size]);
    }

  }//end Stack class
