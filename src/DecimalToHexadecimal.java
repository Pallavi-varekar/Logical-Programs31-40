import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String args[])
    {
        char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem,num;
        String hexadecimal= " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Decimal number: ");
        num=scanner.nextInt();
        System.out.println("Hexadecimal number is : ");
        while(num != 0)
        {
            rem= num % 16;
            hexadecimal= a[rem] + hexadecimal;
            num= num / 16;
        }
        System.out.print(hexadecimal);
    }
}
