import java.util.Hashtable;
public class47_hashtabale 
{
    public static void main(String[] args)
{
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"Amit");
        ht.put(2,"Rahul");
        ht.put(3,"Neha")
        System.out.println("Student List: " + ht);
        ht.remove(2);
        System.out.println("After removing roll 2: " + ht);
        for(Integer key : ht.keySet())
        {
            System.out.println("Roll No: " + key + " Name: " + ht.get(key));
        }
    }
}
/*
Student List: {3=Neha, 2=Rahul, 1=Amit}
After removing roll 2: {3=Neha, 1=Amit}
Roll No: 3 Name: Neha
Roll No: 1 Name: Amit
*/
