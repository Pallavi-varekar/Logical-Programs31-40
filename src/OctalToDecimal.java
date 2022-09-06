import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a octal number : ");
        int octal = scanner.nextInt();
        int decimal=0;
        int n = 0;
        while (octal > 0)
        {
            int a = octal % 10;
            decimal += a * Math.pow(8, n);
            octal = octal / 10;
            n++;
        }
        System.out.println("Decimal number : " + decimal);
    }
}
