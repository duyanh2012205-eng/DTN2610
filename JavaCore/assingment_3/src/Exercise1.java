import java.util.Random;
import java.util.Scanner;

public class Exercise1 {


//    Question 1:
//    Khai báo 2 số lương có kiểu dữ liệu là float.
//    Khởi tạo Lương của Account 1 là 5240.5 $
//    Khởi tạo Lương của Account 2 là 10970.055$
//    Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//    Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra

    public static void question1() {
        float Salary1 = 5240.5f;
        float Salary2 = 10970.055f;

        System.out.println(Salary1 + " " + Salary2);

        int Salary_1 = (int) Salary1;
        int Salary_2 = (int) Salary2;

        System.out.println(Salary_1 + " " + Salary_2);

    }

//    Question 2:
//    Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho      đủ 5 chữ số)

    public static void question2() {
        Random random = new Random();
        int ramdomNumber = random.nextInt(90000) + 10000;
        System.out.println("Số ngẫu nhiên: " + ramdomNumber);

    }

//    Question 3:
//    Lấy 2 số cuối của số ở Question 2 và in ra.
//    Gợi ý:
//    Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//    Cách 2: chia lấy dư số đó cho 100

    public static void question3() {
        Random random = new Random();
        int ramdomNumber = random.nextInt(90000) + 10000;
        System.out.println("Số ngẫu nhiên: " + ramdomNumber);
        int newRamdom = ramdomNumber % 100;
        System.out.printf("2 số cuối là: %02d", newRamdom);
        System.out.println("\n");

    }

//    Question 4:
//    Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng.

    public static void question4() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a = ");
        a = scanner.nextInt();
        while (true) {
            System.out.println("Nhập b = ");
            b = scanner.nextInt();
            if (b == 0) {
                System.out.println("Vui lòng nhập b khác 0 !");
            } else {
                break;
            }
        }
        System.out.println("Thương: " + (float) a / (float) b);
    }
}
