import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int binary = scanner.nextInt();
        int decimal = 0;
        int n = 0;
        while (binary > 0) {
            int a = binary % 10;
            decimal += a * Math.pow(2, n);
            binary = binary / 10;
            n++;
        }
        int octal[] = new int[20];
        int i = 0;
        while (decimal > 0) {
            int r = decimal % 8;
            octal[i++] = r;
            decimal = decimal / 8;
        }
        System.out.print("Octal number : ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octal[j]);
    }
}
