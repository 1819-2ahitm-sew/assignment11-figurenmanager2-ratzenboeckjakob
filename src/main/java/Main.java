import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eingabe;
        Quadrat qu = new Quadrat(8);

        do {
            System.out.println("(0) Exit");
            System.out.println("(1) Berechnung von Umfang und Fläche eines Quadrates");
            System.out.print("\nEingabe:");
            eingabe = scanner.nextInt();

            switch (eingabe) {
                case 0:
                    break;
                case 1:
                    System.out.println(qu.toString());
                    break;
            }
        } while (eingabe != 0);
    }
}
