import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n, count = 0, a;
        String m = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter decimal number:");
        n = scanner.nextInt();
        while (n > 0) {
            a = n % 2;
            if (a == 1) {
                count++;
            }
            m = a + "" + m;
            n = n / 2;
        }
        System.out.println("Binary number:" + m);
    }
}
