abstract class Shape 
{
    abstract void area();
}

class Circl extends Shape {
    double r = 4;

    void area() {
        System.out.println("Area of Circle = " + (Math.PI * r * r));
    }
}

public class Circle 
{
    public static void main(String[] args) 
	{
        Circl c = new Circl();
        c.area();
    }
}
