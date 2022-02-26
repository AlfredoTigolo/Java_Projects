// Rank sorting example

import java.util.Scanner;
import java.util.Arrays;

public class helloworld
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] listInt = new int[51];
        int[] rankInt = new int[51];
        int[] rank = new int[51];

        int increment = 0;
        int rankkey = 0;

        //System.out.println("hello world");

        do {
            System.out.println("Enter number");
            String i = in.next();
            int x = Integer.parseInt(i);            
            if (x == 99)
                break;
            listInt [increment] = x;
            System.out.println(Arrays.toString(listInt));   
            
            //for ( int j = 0; j < listInt.length - 1 ; j++)
            // j is the start of the for loop
            // increment is the size of number input you entered
            // rankkey gives the range of first, second, third, 4th, etc place
            for ( int j = 0; j < increment; j++)
            {                
                if (x > listInt[j]) // reverse the sign to less then to put in order from largest to smallest 2342, 2321, 46 are example numbers
                rankkey++;
            }
            System.out.print("rank " + rankkey);
            rankInt[rankkey] = x;            
            rankkey = 0;
            //System.out.println(Arrays.deepToString(listInt));
            increment++;
        } while (true);

        System.out.println(Arrays.toString(rankInt));
    
    }
