package mythread;

import java.io.*;
import java.util.*;

public class File_IO1 {
  public static void main(String[] args) throws IOException{
  String file = null, line;
  BufferedReader buf = null;
  BufferedReader answer = new BufferedReader(new InputStreamReader(System.in));
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int lineNum = 0;
char ans = 'y';

while(ans == 'y'){
  do{
    System.out.println("Enter the file's name: " );
      file = in.readLine();
  } while(file.length() == 0);

buf = new BufferedReader(new FileReader(file));
line = buf.readLine();

  while(line != null){
    lineNum++;
    System.out.println(line);
    line = buf.readLine();
  }

System.out.println("Enter <n/N> to quit, else press any key: ");
  String input = answer.readLine();
  if(input.length() == 0)  //If the user presses the <ENTER> key.
    ans = 'y';  //Assume that the user'd like to continue, so the answer is 'y'.
  else
    ans = input.charAt(0);
  }  //END of WHILE

  }  //END of main()
}  //END of calss File_IO1{}