//package stack_queue;

public class QueueTest {
  public static void main(String[] args) {
  Integer[] intObj = new Integer[5];
  myQueue Q1 = new myQueue(intObj.length);

  for(int i = 0; i < intObj.length; i ++)
    intObj[i] = new Integer((int)(Math.random()*100));

System.out.println("Here is the array elements of intObj[]:");
  for(int i = 0; i < intObj.length; i ++)
    System.out.print(intObj[i] + "  ");

  System.out.println("\nenQueue(intObj[2]) = " + intObj[2]);
    Q1.enQueue(intObj[2]);
  System.out.println("enQueue(intObj[1]) = " + intObj[1]);
    Q1.enQueue(intObj[1]);
  System.out.println("enQueue(intObj[3]) = " + intObj[3]);
    Q1.enQueue(intObj[3]);

  System.out.println("deQueue from the queue get: " + Q1.deQueue() + "\tSize of queue is now " + Q1.size());
  System.out.println("enQueue(intObj[0]) = " + intObj[0]);
    Q1.enQueue(intObj[0]);
  System.out.println("deQueue from the queue get: " + Q1.deQueue() + "\tSize of queue is now " + Q1.size());
  System.out.println("deQueue from the queue get: " + Q1.deQueue() + "\tSize of queue is now " + Q1.size());
  System.out.println("deQueue from the queue get: " + Q1.deQueue() + "\tSize of queue is now " + Q1.size());
  System.out.println("deQueue from the queue get: " + Q1.deQueue() + "\tSize of queue is now " + Q1.size());
  System.out.println("deQueue from the queue get: " + Q1.deQueue() + "\tSize of queue is now " + Q1.size());
  }//end of main()
}//end of class QueueTest{}
