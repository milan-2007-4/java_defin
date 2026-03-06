import java.util.TreeSet;
public class 49_treeset
{
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(20);
        System.out.println("Sorted Elements: " + set);
    }
}
/*
Sorted Elements: [10, 20, 40, 50]
*/
