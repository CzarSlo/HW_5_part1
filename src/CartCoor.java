import java.util.Scanner;

public class CartCoor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj X");
        int x = input.nextInt();
        System.out.println("Podaj Y");
        int y = input.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży w I ćwiartce układu współrzędnych.");
        } else if (x > 0 && y < 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży w II ćwiartce układu współrzędnych.");
        } else if (x < 0 && y < 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży w III ćwiartce układu współrzędnych.");
        } else if (x < 0 && y > 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży w IV ćwiartce układu współrzędnych.");
        } else if (x == 0 && y > 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży na dodatniej części osi Y.");
        } else if (x == 0 && y < 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży na ujemnej części osi Y.");
        } else if (x > 0 && y == 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży na dodatniej części osi X.");
        } else if (x < 0 && y == 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży na ujemnej części osi X.");
        } else {
            System.out.println("Wybrałeś środek układu współrzędnych.");
        }
    }
}