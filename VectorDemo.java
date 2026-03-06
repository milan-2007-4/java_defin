import java.util.Vector;
public class 46_vector
{        public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println("Vector elements: " + v);
        v.remove(2);
        System.out.println("After removing index 2: " + v);
        for(int i=50;i<=100;i+=10)
        {
            v.add(i);
        }
        System.out.println("After adding more elements:"+v);
        System.out.println("Vector Size:"+v.size());
    }
}
/*
Vector elements: [10, 20, 30, 40]
After removing index 2: [10, 20, 40]
After adding more elements: [10, 20, 40, 50, 60, 70, 80, 90, 100]
Vector Size: 9
*/
