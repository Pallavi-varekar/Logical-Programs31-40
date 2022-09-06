import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int octal = 0, i = 1, remainder;
        System.out.println("Enter a Decimal Number : ");
        int decimal = scanner.nextInt();

        while (decimal > 0) {
            remainder = decimal % 8;
            octal += i * remainder;
            decimal = decimal / 8;
            i = i * 10;
        }
        System.out.println("Octal: " + octal);
    }
}
