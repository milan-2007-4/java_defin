import java.util.LinkedList;
import java.util.Queue;
public class 51_que
{
    public static void main(String[] args) 
{
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Queue: " + q);
        q.remove();
        System.out.println("Queue after remove: " + q);
    }
}
/*
Queue: [10, 20, 30]
Queue after remove: [20, 30]
*/
