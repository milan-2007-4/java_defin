class wrepep
{
    public static void main(String[] args) {

        // Autoboxing
        Integer i = 10;
        Double d = 5.5;

        // Unboxing
        int x = i;
        double y = d;

        // Parsing
        int num = Integer.parseInt("100");
        double num2 = Double.parseDouble("12.34");

        System.out.println("Integer = " + i);
        System.out.println("Double = " + d);
        System.out.println("Unboxed int = " + x);
        System.out.println("Parsed int = " + num);
        System.out.println("Parsed double = " + num2);
    }
}
