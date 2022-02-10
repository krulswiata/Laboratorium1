import java.util.Scanner;

public class zad5
{
        public static void main(String[] args) {


            int mojWiek = 22;

            if (mojWiek%3==0){
                System.out.println("Podzielny przez 3");
            }else{
                System.out.println("Niepodzielny przez 3");
            }


            int index = 60471;
            int wynik = (index%2==0)? 0 : 1;
            System.out.println("wynik= " + wynik);


            Scanner scanner = new Scanner(System.in);

            System.out.println("cyfra z przecinkiem");

            double a = scanner.nextDouble();

            if (a>11)

            {
                System.out.println("a wieksza od 11");
            }

            else if (a<10)

            {
                System.out.println("a mniejsza od 10");
            }
            else if (a==5)

            {
                System.out.println("a rowne 5");
            }



        }
    }

