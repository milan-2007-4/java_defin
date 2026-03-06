import java.util.Scanner;
public class 54_tracatc 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        try
        {
            int c = a/b;
            System.out.println("Result = " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero not allowed");
        }
    }
}
/*
Enter first number: 10
Enter second number: 0
Division by zero not allowed
*/
