import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class Exercise2 {
    public static void question1(){
        int a =5;
        System.out.printf("%d", a);
    }

    public static void question2(){
        int a =100000000;
        System.out.printf(Locale.UK,"%,d%n", a);
    }

    public static void question3(){
        float c = 5.567098f;
        System.out.printf("%5.4f%n", c);

    } public static void question4(){
        String ten = "Nguyễn Văn A";
        System.out.printf("Tên tôi là " + ten + " và tôi đang độc thân.");
    }

    public static void question5(){
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }
}
