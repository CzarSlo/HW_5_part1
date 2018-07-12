public class Table2 {
    public static void main(String[] args) {
        int[] number = new int[5];

        for (int i = 0; i < 5; i++) {
            number[i] = i;
        }

        int sum = 0;
        for (int i = 0; i < 5; i += 2) {
            int b = number[i];
            sum = sum + b;
        }

        System.out.println("Suma liczb 1.,3. i 5. wynosi: ");
        System.out.println(sum);
    }
}
