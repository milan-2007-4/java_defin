import java.util.Stack;
public class 50_stake 
{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack: " + s);
        System.out.println("Popped Element: " + s.pop());
        System.out.println("Stack After Pop: " + s);
    }
}
/*
Stack: [10, 20, 30]
Popped Element: 30
Stack After Pop: [10, 20]
*/
