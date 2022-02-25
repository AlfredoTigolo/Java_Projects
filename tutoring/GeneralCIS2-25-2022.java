import java.util.Scanner;

public class helloworld
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] listInt;

        //System.out.println("hello world");

        do {
            System.out.println("Enter number");
            String i = in.next();
            int x = Integer.parseInt(i);
            if (x == 99)
                break;
            
        } while (true);
    
    }

}
