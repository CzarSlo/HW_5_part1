public class OdZeraDoStu {
    public static void main(String[] args) {

        int sum = 0;
        for (int d = 0; d <= 100; d += 2) {
            sum = sum + d;
            System.out.print(" " + d);
        }
        System.out.println();
        System.out.println("Suma liczb parzystych od 0 do 100 wynosi: " + sum);
    }
}
