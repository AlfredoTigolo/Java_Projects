import java.util.Scanner;
import java.util.Arrays;

class rowscolumns
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of box");
        String l = input.next();
        int sizeI = Integer.parseInt ( l );
        
        do {
            int i = 0; // initialize loop
            int j = 0; // inner loop
            int k = 0; // filler loop
            for (i = 0; i < sizeI - 1; i++) //print rows of x
                System.out.print("x");
                for ( j = 0; j < sizeI; j++)
                    System.out.println("x");
                    for (k = 1; i < sizeI - 1; k++) //print rows of x
                        System.out.print("x");
                if (sizeI - 1 == i) // exits do while loop                
                    break;
        } while (true);
    }
}
