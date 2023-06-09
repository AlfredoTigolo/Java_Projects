//package stack_queue;

public class Palindrome_Queue {
  static String[] st = null;
  public static void main(String[] args) {
  if(args.length < 1){
    st = new String[3];
    st[0] = "abcba";  //palindrome.;
    st[1] = "chocolate";  //non palindrome.;
    st[2] = "coloroloc";  //palindrome.;
    System.out.println("USAGE: java Palindrome arg1 arg2 arg3 ....");
    System.out.println("Use built-in data: ");
  }else{
    st = new String[args.length];
    for (int i = 0; i < args.length; i++)
      st[i] = args[i].trim();
  }//end of IF()

  myQueue mq = new myQueue(st.length);
  myQueue mq2 = new myQueue(st.length);

  for (int i = 0; i < st.length; i++){
    for (int j = 0; j < st[i].length()/2; j++){//Enqueue() the first half of the string into the first queue.
      mq.enQueue(new Character(st[i].charAt(j)));
//      mq.peek();
//      System.out.println("Size of mq = " + mq.size());
    }
    for (int k = (st[i].length() - 1); k > st[i].length()/2; k--){
      mq2.enQueue(new Character(st[i].charAt(k)));//Enqueue() the first half of the string into the 2nd queue.
//      mq2.peek();
//      System.out.println("Size of mq2 = " + mq2.size());
    }
    boolean palin = false;
    while(!mq.isEmpty()){
      if(mq.deQueue().toString().compareTo(mq2.deQueue().toString()) != 0)
        palin = false;//DO NOT BREAK OUT of the loop. We NEED to pop() all elements
      else
        palin = true;//from the current stack out to empty the stack. Otherwise comparison will be INCORRECT.
    }//end of WHILE()
  if(palin)
    System.out.println("The string " + st[i] + " is a palindrome!");
  else
    System.out.println("The string " + st[i] + " is NOT a palindrome.");
  }//end of FOR()

  }//end of main()
}//end of class Palindrome_queue{}
