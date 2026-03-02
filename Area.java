class Area
{
    public static void main(String[] args)
    {
        double r = Double.parseDouble(args[0]);
        double l = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);

        double circleArea = 3.14159 * r * r;
        double rectangleArea = l * b;

        System.out.println("Area of Circle = " + circleArea);
        System.out.println("Area of Rectangle = " + rectangleArea);
    }
}
