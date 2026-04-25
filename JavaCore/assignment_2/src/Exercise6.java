public class Exercise6 {

    public static void question1() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public static void question2(Account account) {
        System.out.println("ID: " + account.accountID + " Email: " + account.email + " Username: " + account.userName + " FullName: " + account.fullName + " CreareDate: " + account.createDate);

    }

    public static void question3() {
        for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
        }
    }

}
