import java.lang.*;
import java.util.Scanner;

public class ReadKeyboard
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("String line: ");
        String c = sc.nextLine();
        System.out.println(c);

        System.out.print("Integer: ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.print("Float: ");
        float b = sc.nextFloat();
        System.out.println(b);

        int x, y;
        System.out.println("Enter 2 numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();

        int z = x + y;
        System.out.println("Sum is " + z);

        System.out.print("String word: ");
        String d = sc.next();
        System.out.println(d);

        sc.close();
    }
}
