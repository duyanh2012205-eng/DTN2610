import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Exercise3 {
    public static void question1(Exam exam) {
        Locale locale = new Locale("vi", "VN");
        DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateformat.format(exam.createDate);
        System.out.println(exam.code + ": " + date);
    }

    public static void question2(Exam[] exams) {
        String pattern = "yyyy-MM-dd-HH-mm-ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        for (Exam exam : exams) {
            String date = simpleDateFormat.format(exam.createDate);
            System.out.println(exam.code + ": " + date);

        }
    }

    public static void question3(Exam[] exams) {
        String pattern = "yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        for (Exam exam : exams) {
            String date = simpleDateFormat.format(exam.createDate);
            System.out.println(exam.code + ": " + date);

        }
    }

    public static void question4(Exam[] exams) {
        String pattern = "yyyy-MM";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        for (Exam exam : exams) {
            String date = simpleDateFormat.format(exam.createDate);
            System.out.println(exam.code + ": " + date);

        }
    }

    public static void question5(Exam[] exams) {
        String pattern = "MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        for (Exam exam : exams) {
            String date = simpleDateFormat.format(exam.createDate);
            System.out.println(exam.code + ": " + date);

        }
    }
}

