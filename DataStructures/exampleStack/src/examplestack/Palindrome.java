package examplestack;

/**
 * <p>Title: Example Stack</p>
 * <p>Description: ADT Stack</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: CSULA</p>
 * @author Alfredo Tigolo III
 * @version 1.0
 */

//package stack_queue;

public class Palindrome {
  private myStack mystak = new myStack();
  private myStack mystak2 = new myStack();
  //private myStack mystak3 = new myStack();
  //private myStack mystak4 = new myStack();
  private String[] st = null;

  public Palindrome(){}
  public Palindrome(String[] str){
    this.st = str;
  }

  public void checkPalindrome(String[] str) {
    //keeps track of word number taken which is used in the catch block

//THE TRY BLOCK CODE
//THE TRY BLOCK CODE
//THE TRY BLOCK CODE
//    try
//    {
      System.out.println("Try Block");
      for(int i = 0; i < str.length; i++){  //push the first half of the string to the stack.
        //for(int k = 0; k < (str[i].length()/2); k++){
        for(int k = 0; k < str[i].length(); k++){
          //error is here. Must distinguish counter and index
          mystak.push(new Character(str[i].charAt(k)));
//          mystak.peek();
        }//end of inner FOR()
        //get the other half of the string. Starting from the END of the string.
        //for(int m = (str[i].length() - 1); m > str[i].length()/2; m--){
        for (int m = str[i].length(); m > 0; --m) {
			//error is here. Must distinguish counter and index
          //System.out.println("i:"+i+" m:"+m); //debug
          mystak2.push(new Character(str[i].charAt(m-1)));
//          mystak2.peek();
        }//end of inner FOR()

        boolean palin = false;
        while(!mystak.isEmpty()){
          if(mystak.pop().toString().compareTo(mystak2.pop().toString().trim()) != 0)
            palin = false;//DO NOT BREAK OUT of the loop. We NEED to pop() all elements
          else
            palin = true;//from the current stack out to empty the stack. Otherwise comparison will be INCORRECT.
        }//end of WHILE()
        if(palin)
          System.out.println("The string " + str[i] + " is a palindrome!");
        else
          System.out.println("The string " + str[i] + " is NOT a palindrome.");
      }//end of outer FOR()
//    }//end try
//THE CATCH BLOCK CODE
//THE CATCH BLOCK CODE
//THE CATCH BLOCK CODE
/*
      catch (NullPointerException npe) {
        System.out.println("Catch Block "+npe.getMessage());//debug
      for(int i = 0; i < str.length; i++){  //push the first half of the string to the stack.
        for(int k = 0; k < str[i].length()/2; k++){
          //error is here. Jen Chen Divides an integer into an interger
          //mystak.push(new Character(str[i].charAt(k)));
          mystak3.push(new Character(str[i].charAt(k)));
//      mystak.peek();
        }//end of inner FOR()
        //get the other half of the string. Starting from the END of the string.
        for(int m = (str[i].length()-1); m > str[i].length()/2; m--){
          //mystak2.push(new Character(str[i].charAt(m)));
          mystak4.push(new Character(str[i].charAt(m)));
//        mystak2.peek();
        }//end of inner FOR()

        boolean palin = false;
        while(!mystak3.isEmpty()){
          //if(mystak.pop().toString().compareTo(mystak2.pop().toString().trim()) != 0)
          if(mystak3.pop().toString().compareTo(mystak4.pop().toString()) != 0)
            palin = false;//DO NOT BREAK OUT of the loop. We NEED to pop() all elements
          else
            palin = true;//from the current stack out to empty the stack. Otherwise comparison will be INCORRECT.
        }//end of WHILE()
        if(palin)
          System.out.println("The string " + str[i] + " is a palindrome!");
        else
          System.out.println("The string " + str[i] + " is NOT a palindrome.");
      }//end of outer FOR()
      }
*/
  }//end of method checkPalindrome()
}//end of class Palindrome{}