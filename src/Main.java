import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double C = 0;

        System.out.print("Please enter C temperature: ");
        if(in.hasNextDouble())
        {
            C = in.nextDouble();
            in.nextLine();

            double F = C*1.8+32;

            System.out.println("F temperate is: " + F);
        }
        else
        {
            System.out.println("Please enter a correct input");
        }
    }
}
