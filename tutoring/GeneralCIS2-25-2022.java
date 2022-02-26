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
            for ( int j = 0; j < increment - 1 ; j++)
            {                
                if (x > listInt[j])
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
