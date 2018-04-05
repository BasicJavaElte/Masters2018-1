import java.util.Date;
import java.text.SimpleDateFormat;

public class Main{
    public static void main(String [] args) throws Exception{

        SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");

        Date birthday = myFormat.parse("19800302");

        System.out.println(birthday);

        Person p = new Person("Another","Guy");


        System.out.println(p.getName()+" "+p.getSurname());
    }

}
