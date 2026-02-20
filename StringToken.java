import java.util.StringTokenizer;

public class StringToken
{
    public static void main(String[] args) {
        String str = "Java is a programming language";

        StringTokenizer st = new StringTokenizer(str);

        System.out.println("Number of tokens: " + st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
