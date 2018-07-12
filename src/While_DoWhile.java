import java.util.Locale;

public class While_DoWhile {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        double b = 0;
        while (b <= 3) {
            b += 0.1;
            System.out.printf("%.1f, ", b);
        }
        System.out.println();

        double c = 0;
        do {
            c += 0.1;
            System.out.printf("%.1f, ", c);
        } while (c <= 3);

    }
}