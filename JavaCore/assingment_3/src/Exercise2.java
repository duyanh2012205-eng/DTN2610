import java.time.LocalDate;
import java.util.ArrayList;

public class Exercise2 {

//    Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//            ∙ Email: "Email 1"
//            ∙ Username: "User name 1"
//            ∙ FullName: "Full name 1"
//            ∙ CreateDate: now

    public static void question1(){
        System.out.println("Tạo 5 phần tử Account:");
        Account[] accounts = new Account[5];
        for ( int i = 0; i < accounts.length; i++){
            Account acc = new Account();
            acc.email = "Email " +(i+1) ;
            acc.userName = "User name " + (i+1);
            acc.fullName = "Full name " + (i+1);
            acc.createDate = LocalDate.now();
            accounts[i] = acc;

        }
        for (Account acc : accounts) {
            System.out.println(acc.email + "  " + acc.userName + "  " + acc.createDate);
        }

    }

}
