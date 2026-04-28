import java.util.Scanner;

public class Exercise4 {
    //    Question 1:
//    Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng );
    public static void question1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi ký tự: ");
        String s = sc.nextLine();
        String[] word = s.split(" ");
        System.out.println("Số kí tự: " + word.length);
    }

//    Question 2:
//    Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;

    public static void question2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi 1: ");
        String s1 = sc.nextLine();
        System.out.println("Nhập vào chuỗi 2: ");
        String s2 = sc.nextLine();
        System.out.println("Kết quả sau khi nối chuỗi: " + s1 + " " + s2);
        sc.close();
    }

//    Question 3:
//    Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chữ viết hoa chữ cái đầu thì viết hoa lên.

    public static void question3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Tên: ");
        String name = sc.nextLine();

        if (!name.isEmpty()) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            System.out.println(name);
        }
        sc.close();
    }
//    Question 4:
//    Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
//    VD:
//    Người dùng nhập vào "Nam", hệ thống sẽ in ra
//        "Ký tự thứ 1 là: N"
//                "Ký tự thứ 1 là: A"
//                "Ký tự thứ 1 là: M"

    public static void question4() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        name = name.toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + name.charAt(i));
        }
        sc.close();
    }


    //    Question 5:
//    Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ.

    public static void question5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ: ");
        String firstName = sc.nextLine();
        System.out.println("Nhập tên: ");
        String lastName = sc.nextLine();
        System.out.println("Họ tên đầy đủ: " + firstName + " " + lastName);
        sc.close();
    }

//    Question 6:
//    Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//    VD:
//    Người dùng nhập vào "Nguyễn Văn Nam"
//    Hệ thống sẽ in ra
//    "Họ là: Nguyễn"
//            "Tên đệm là: Văn"
//            "Tên là: Nam"

    public static void question6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        String fullName = sc.nextLine();
        String[] name = fullName.split(" ");

        String lastName = name[0];
        String firstName = name[name.length - 1];
        String midName = "";
        for (int i = 1; i < name.length - 1; i++) {
            midName = midName + name[i] + " ";
        }

        System.out.println("Họ là: " + lastName);
        System.out.println("Tên đệm là: " + midName);
        System.out.println("Tên là: " + firstName);

    }
//    Question 7:
//    Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên của họ như sau:
//    a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn   nam"
//    b) Viết hoa chữ cái mỗi từ của người dùng
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"

    public static void question7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên đầy đủ: ");
        String fullName = sc.nextLine().trim().replaceAll("\\s+", " ");
        System.out.println("Câu a: " + fullName);

        String[] name = fullName.split(" ");
        String result = "";
        for (String word : name) {
            String first = word.substring(0, 1).toUpperCase();
            String next = word.substring(1);
            word = first + next;
            result += word + " ";
        }
        System.out.println("Họ tên sau sửa: " + result);
    }


//    In ra tất cả các group có chứa chữ "Java"

    public static void question8() {
        String[] groupNames = { "Java 1", "Java 2 ", "java , 123" };
        for (String groupName : groupNames) {
            if (groupName.contains("Java")) {
                System.out.println(groupName);
            }
        }
    }

//    Question 9:
//    In ra tất cả các group "Java"

    public static void question9() {
        String[] groupNames = { "Java", "java", "123" };
        for (String groupName : groupNames) {
            if (groupName.equals("Java")) {
                System.out.println(groupName);
            }
        }
    }

//    Question 10:
//    Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//    Nếu có xuất ra “OK” ngược lại “KO”.
//    Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
    public static void question10() {
        Scanner scanner = new Scanner(System.in);
        String s1, s2, S1 = "";

        System.out.println("Nhập chuỗi 1");
        s1 = scanner.nextLine();

        System.out.println("Nhập chuỗi 2");
        s2 = scanner.nextLine();

        scanner.close();

        for (int i = s1.length() - 1; i >= 0; i--) {
            S1 += s1.substring(i, i + 1);
        }
        if (s2.equals(S1)) {
            System.out.println("Đây là chuỗi đảo ngược !");
        }
        else {
            System.out.println("Đây không phải chuỗi đảo ngược");
        }
    }

    public static void question11() {
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.println("Mời bạn nhập vào một chuỗi: ");
        str = scanner.nextLine();
        scanner.close();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('a' == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);








}
