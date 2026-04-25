import java.time.LocalDate;
import java.util.Scanner;

public class Exercise5 {
    public static void question1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 3 số nguyên");
        System.out.println("Nhập vào số 1: ");
        int a = sc.nextInt();

        System.out.println("Nhập vào số 2: ");
        int b = sc.nextInt();

        System.out.println("Nhập vào số 3: ");
        int c = sc.nextInt();

        System.out.printf("3 số vừa nhập là: %d %d %d", a, b, c);
    }

    public static void question2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 2 số thực");
        System.out.println("Nhập vào số 1: ");
        float a = sc.nextFloat();

        System.out.println("Nhập vào số 2: ");
        float b = sc.nextFloat();

        System.out.printf("2 số vừa nhập là: %f %f", a, b);
    }

    public static void question3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ và tên:");
        String ten = sc.nextLine();

        System.out.println("Tên bạn là " + ten);
    }

    public static void question4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào năm sinh:");
        int year = sc.nextInt();

        System.out.println("Mời bạn nhập vào tháng:");
        int month = sc.nextInt();

        System.out.println("Mời bạn nhập vào ngày sinh:");
        int day = sc.nextInt();

        LocalDate dateBirth = LocalDate.of(year, month, day);
        System.out.println("Ngày sinh của bạn là: " + dateBirth);
    }

    public static void question5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin account cân tạo: ");

        Account acc = new Account();
        System.out.println("Nhập ID: ");
        acc.accountID = sc.nextInt();

        System.out.println("Nhập email: ");
        acc.email = sc.next();

        System.out.println("Nhập userName: ");
        acc.userName = sc.next();

        System.out.println("Nhập fullName: ");
        acc.fullName = sc.next();

        System.out.println("Nhập position (Nhập các số từ 1 đến 4 tương ứng với: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM): ");
        int posNum = sc.nextInt();
        switch (posNum) {
            case 1:
                Position pos1 = new Position();
                pos1.positionName = PositionName.DEV;
                acc.position = pos1;
                break;
            case 2:
                Position pos2 = new Position();
                pos2.positionName = PositionName.TEST;
                acc.position = pos2;
                break;
            case 3:
                Position pos3 = new Position();
                pos3.positionName = PositionName.SCRUM_MASTER;
                acc.position = pos3;
                break;
            case 4:
                Position pos4 = new Position();
                pos4.positionName = PositionName.PM;
                acc.position = pos4;
                break;
        }

        System.out.println("Thông tin Acc vừa nhập, ID: " + acc.accountID + " Email: " + acc.email + " UserName: " + acc.userName + " FullName: " + acc.fullName + " Position: " + acc.position.positionName);

    }
}
