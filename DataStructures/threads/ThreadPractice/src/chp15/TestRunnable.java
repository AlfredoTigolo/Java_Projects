package chp15;

/**
 * <p>Title: Alfredo Tigolo III</p>
 * <p>Description: Define threads using the Runnable interface </p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: </p>
 * @refer to page 668-670
 * @version 1.0
 */

public class TestRunnable {

  /**Main Method*/
  public static void main(String[] args) {
    new TestRunnable();
  }

  /**Default constructor*/
  public TestRunnable() {

    //Create threads
    Thread printC = new Thread(new PrintChar('c', 100));
    Thread printD = new Thread(new PrintChar('d', 100));
    Thread print100 = new Thread(new PrintNum(100));

    //Start threads
    print100.start();
    printC.start();
    printD.start();
  }


/**
 * The thread class for printing a specified character in specified times.
 * This class is declared an inner class because when a class implements
 * the Runnable interface, it is not really a thread, yet.  It must be wrapped
 * using the Thread class.
 */
class PrintChar implements Runnable {

  //data members
  private char charToPrint; //The character to print
  private int times; //The times to repeat

  /**Construct a thread with specified character and number of times
   * to print the character
   */
  public PrintChar(char c, int t) {
    charToPrint = c;
    times = t;
  }

  /**Override the run() method to tell the system what the thread will do*/
  public void run() {
    for (int i=0; i<times; i++)
      System.out.print(charToPrint);
  }
}

class PrintNum implements Runnable {

  //date member
  private int lastNum;

  /**Construct a thread for print 1, 2, ...i*/
  public PrintNum(int n) {
    lastNum = n;
  }

  /**Tell the thread how to run*/
  public void run() {
    for(int i =1; i <= lastNum; i++)
      System.out.print(" "+i);
  }

}


}