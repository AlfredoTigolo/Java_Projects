import java.util.Scanner;
import java.util.Arrays;

public class helloworld
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] listInt = new int[50];        
        int[] rank = new int[50];

        int increment = 0;

        //System.out.println("hello world");

        do {
            System.out.println("Enter number");
            String i = in.next();
            int x = Integer.parseInt(i);            
            if (x == 99)
                break;
            listInt [increment] = x;
            System.out.println(Arrays.toString(listInt));
            //System.out.println(Arrays.deepToString(listInt));
            increment++;
        } while (true);
    
    }

}
