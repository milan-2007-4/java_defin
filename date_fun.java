import java.util.Date;
import java.text.SimpleDateFormat;

public class date_fun{
    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Current Date & Time: " + sdf.format(d));
    }
}
