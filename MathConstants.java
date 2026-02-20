final class MathConstant 
{
    final double PI = 3.14159;
}

// class Test extends MathConstants {}  // ? Not allowed

public class MathConstants 
{
    public static void main(String[] args) {
        MathConstant m = new MathConstant();
        System.out.println("Value of PI = " + m.PI);
    }
}
