
import java.util.Scanner;

public class DivTrzy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        int e = input.nextInt();

        while (!(e >= 100 && e <= 200)) {
            if (e < 100) {
                System.out.println("Podana liczba jest za mała.");
                System.out.println("Podaj liczbę:");
                e = input.nextInt();

            } else if (e > 200) {
                System.out.println("Podana liczba jest za duża.");
                System.out.println("Podaj liczbę:");
                e = input.nextInt();
            }

            if (e % 3 != 0 && e >= 100 && e <= 200) {
                System.out.println("Liczba nie jest podzielna przez 3."); //
                System.out.println("Podaj liczbę:");
                e = input.nextInt();
            }
        }
        System.out.println("Twoja liczba jest ok.");
    }
}