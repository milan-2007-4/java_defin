class OUTEr_INNE
 {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x = " + x);
        }
    }
}

public class OUTE_INNE
{
    public static void main(String[] args) {
        OUTEr_INNE obj = new OUTEr_INNE();
        OUTEr_INNE.Inner in = obj.new Inner();
        in.display();
    }
}
