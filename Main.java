import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] arg) 
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Clothes> clothesList = new ArrayList<Clothes>();

        System.out.println("How many items are there?");
        int n = sc.nextInt();

        int i = 0;
        
        //asks user to pick clothes
        while(i < n)
        {
            System.out.println("What is the name of the item? ");
            String name = sc.next();

            System.out.println("What is the type of the item? ");
            String type = sc.next();

            Clothes c = new Clothes(name, type);

            clothesList.add(c);

            System.out.println("\n");
            i++;
        }

    }


    public void randomize(Clothes clothesList)
    {
        ArrayList<Clothes> tops = new ArrayList<Clothes>();
        ArrayList<Clothes> bottoms = new ArrayList<Clothes>();

        
    }
}