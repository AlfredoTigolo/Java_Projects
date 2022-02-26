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
           int k = 0; // filler loop
            for (i = 0; i < sizeI - 1; i++) //print rows of x horizontally
                System.out.print("x" + i);
                for ( j = 0; j < sizeI; j++)
                    System.out.println("x" + j); // prints columns of x veritically
                    for (k = 0; k < j - 1; k++) //print rows of x
                        System.out.print("x" + k);
                if (sizeI - 1 == i) // exits do while loop                
                    break;
        } while (true);
    }
}
