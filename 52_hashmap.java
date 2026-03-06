import java.util.HashMap;
public class 52_hashmap 
{
    public static void main(String[] args) 
{
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(101,80);
        map.put(102,75);
        map.put(103,90);
        System.out.println("Student Marks: " + map);
        map.put(102,85);
        map.remove(101);
        for(Integer key : map.keySet())
        {
            System.out.println("ID: " + key + " Marks: " + map.get(key));
        }
    }
}
/*
Student Marks: {101=80, 102=75, 103=90}
ID: 102 Marks: 85
ID: 103 Marks: 90
*/
