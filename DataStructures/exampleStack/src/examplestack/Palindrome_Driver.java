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

public class Palindrome_Driver {
  static String[] st = null;
  public static void main(String[] args) throws NullPointerException {
//  String[] st = {"abcba", "chocolate", "coloroloc"};  //non palindrome.;

  if(args.length < 1){
    st = new String[4];
    st[0] = "ababa";
    st[1] = "chocolate";
    st[2] = "coloroloc";
    st[3] = "alfredogotit";
    System.out.println("USAGE: java Palindrome arg1 arg2 arg3 ....");
    System.out.println("Use built-in data: ");
  }else{
    st = new String[args.length];
    for (int i = 0; i < args.length; i++)
      st[i] = args[i].trim();
  }//end of IF()

  Palindrome pal = new Palindrome(st);
  pal.checkPalindrome(st);

  }//end of main()
}//end of class Palindrome{}
