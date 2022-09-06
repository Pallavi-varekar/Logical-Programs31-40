import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int binary = scanner.nextInt();
        int decimal = 0;
        int n = 0;
        while(binary > 0)
        {
            int a = binary % 10;
            decimal += a*Math.pow(2,n);
            binary = binary / 10;
            n++;
        }
        System.out.println("Decimal number : "+decimal);

    }
}
