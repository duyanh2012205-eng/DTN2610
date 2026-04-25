import java.time.LocalDate;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department dep1 = new Department();
        dep1.departmentID = 1;
        dep1.departmentName = "Sale";

        Department dep2 = new Department();
        dep2.departmentID = 2;
        dep2.departmentName = "Marketing";

        Department dep3 = new Department();
        dep3.departmentID = 3;
        dep3.departmentName = "Engineering";


        Position pos1 = new Position();
        pos1.positionID = 1;
        pos1.positionName = PositionName.DEV;

        Position pos2 = new Position();
        pos2.positionID = 2;
        pos2.positionName = PositionName.TEST;

        Position pos3 = new Position();
        pos3.positionID = 3;
        pos3.positionName = PositionName.PM;

        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Group1";
        group1.createDate = LocalDate.now();

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "Testing System";
        group2.createDate = LocalDate.of(2021, 1, 1);

        Account acc1 = new Account();
        acc1.accountID = 1;
        acc1.email = "duyanh1@gmail.com";
        acc1.fullName = "Duy Anh 1";
        acc1.department = dep1;
        acc1.position = pos1;

        Account acc2 = new Account();
        acc2.accountID = 2;
        acc2.email = "duyanh2@gmail.com";
        acc2.fullName = "Duy Anh 2";
        acc2.department = dep2;
        acc2.position = pos2;

        Account acc3 = new Account();
        acc3.accountID = 3;
        acc3.email = "duyanh3@gmail.com";
        acc3.fullName = "Duy Anh 3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();

        GroupAccount ga1 = new GroupAccount();
        ga1.group = group1;
        ga1.account = acc1;
        ga1.joinDate = LocalDate.now();

        GroupAccount ga2 = new GroupAccount();
        ga2.group = group2;
        ga2.account = acc1;
        ga2.joinDate = LocalDate.now();

        acc1.groupAccounts = new GroupAccount[]{ga1, ga2};
        group1.groupAccounts = new GroupAccount[]{ga1};

        Account[] accounts = new Account[]{acc1, acc2, acc3};
        Department[] departments = new Department[]{dep1, dep2, dep3};

        Exam exam1 = new Exam();
        exam1.code = "EX001";
        exam1.createDate = new Date();

        Exam exam2 = new Exam();
        exam2.code = "EX002";
        exam2.createDate = new Date();

        Exam[] exams = new Exam[]{exam1, exam2};

        Exercise1.question1(acc1);
        Exercise1.question2(acc1);
        Exercise1.question3(acc1);
        Exercise1.question4(acc1);
        Exercise1.question5(group1);
        Exercise1.question6(acc1);
        Exercise1.question7(acc1);
        Exercise1.question8(accounts);
        Exercise1.question9(departments);
        Exercise1.question10(accounts);
        Exercise1.question11(departments);
        Exercise1.question12(departments);
        Exercise1.question13(accounts);
        Exercise1.question14(accounts);
        Exercise1.question15();
        Exercise1.question16_1(accounts);
        Exercise1.question16_2(departments);
        Exercise1.question16_3(departments);
        Exercise1.question16_4(accounts);
        Exercise1.question16_5();
        System.out.println("\n");
        Exercise2.question1();
        System.out.println("\n");
        Exercise2.question2();
        Exercise2.question3();
        Exercise2.question4();
        System.out.println("\n");
        Exercise2.question5();
        Exercise3.question1(exam1);
        Exercise3.question2(exams);
        Exercise3.question3(exams);
        Exercise3.question4(exams);
        Exercise3.question5(exams);
        Exercise4.question1();
        Exercise4.question2();
        Exercise4.question3();
        Exercise4.question4();
        Exercise4.question5();
        Exercise4.question6();
        Exercise4.question7();
        Exercise5.question1();
        Exercise5.question2();
        Exercise5.question3();
        Exercise5.question4();
        Exercise5.question5();
        Exercise6.question1();
        Exercise6.question2(acc1);
        Exercise6.question3();


    }
}