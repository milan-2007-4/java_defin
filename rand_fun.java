import java.util.Random;

public class rand_fun {
    public static void main(String[] args) {
        Random r = new Random();

        int i = r.nextInt(100);
        float f = r.nextFloat();
        boolean b = r.nextBoolean();

        System.out.println("Random Integer: " + i);
        System.out.println("Random Float: " + f);
        System.out.println("Random Boolean: " + b);
    }
}
