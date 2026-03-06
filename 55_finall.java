public class 55_finall 
{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try
        {
            int c = a/b;
            System.out.println("Result = " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Occurred");
        }
        finally
        {
            System.out.println("Finally block executed");
        }
    }
}
/*
Exception Occurred
Finally block executed
*/
