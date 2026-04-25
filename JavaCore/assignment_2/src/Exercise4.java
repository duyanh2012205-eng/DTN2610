import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
    public static void question1(){
        Random random = new Random();
        int n = random.nextInt();
        System.out.println("Số ngẫu nhiên là: " + n);
    }

    public static void question2(){
        Random random = new Random();
        float n = random.nextFloat();
        System.out.println("Số ngẫu nhiên là: " + n);
    }

    public static void question3(){
        Random random = new Random();
        String [] name = {"A" ,"A1", "A2"};
        int n = random.nextInt(name.length);
        System.out.println("Tên ngẫu nhiên 1 bạn trong lớp: " + name[n]);
    }

    public static void question4(){
        Random random = new Random();
        int minDay = (int) LocalDate.of(1995,7,2).toEpochDay();
        int maxDay = (int) LocalDate.of(1995,12,2).toEpochDay();
        long randomInt = minDay + random.nextInt(maxDay - minDay);
        LocalDate ramdomDate = LocalDate.ofEpochDay(randomInt);
        System.out.println("Ngày ngẫu nhiên là: " + ramdomDate);
    }

    public static void question5(){
        Random random = new Random();
        int now = (int) LocalDate.now().toEpochDay();
        long randomInt = now - random.nextInt(365);
        LocalDate ramdomDate = LocalDate.ofEpochDay(randomInt);
        System.out.println("Ngày ngẫu nhiên là: " + ramdomDate);
    }

    public static void question6(){
        Random random = new Random();
        int now = (int) LocalDate.now().toEpochDay();
        long randomInt = now - random.nextInt(now);
        LocalDate ramdomDate = LocalDate.ofEpochDay(randomInt);
        System.out.println("Ngày ngẫu nhiên là: " + ramdomDate);
    }

    public static void question7(){
        Random random = new Random();
        int z = random.nextInt(999 - 100 + 1) + 100;
        System.out.println("Số ngẫu nhiên có 3 chữ số là: " + z);
    }
}
