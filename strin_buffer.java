public class strin_buffer{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        sb.insert(5, "Language ");
        sb.reverse();
        sb.delete(0, 4);

        System.out.println(sb);
    }
}
