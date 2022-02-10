import java.util.Scanner;

public class zad4 {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Liczba a ");
        int a = scanner.nextInt();
        System.out.println("Liczba b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Wieksza a");
        } else {
            System.out.println("Wieksza b");

        }


        if (a > 10)
        {
            System.out.println("a jest wieksze o 10");
        } else if (a < 100)
        {
            System.out.println("a jest wieksze o 100");
        } else if (b == 22)
        {
            System.out.println("b jest rowne 22");
        }


    }
}
