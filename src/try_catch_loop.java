import java.util.Scanner;

public class try_catch_loop
{
    public static void main(String[] args)
    {
        boolean x = false;

        do
        {
            try
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj prawde!");
                x = scanner.nextBoolean();
                scanner.close();
            }
            catch (Exception e)
            {
                if (x != true)
                {
                    System.out.println("Miala byc prawda!");
                }
            }
            finally
            {
                System.out.println("Wreszcie podano prawde!");
            }
        }
        while (x == true);
    }
}
