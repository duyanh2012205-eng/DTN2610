import java.time.LocalDate;

public class Program {
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

        Account acc1 = new Account();
        acc1.accountID = 1;
        acc1.email = "duyanh1@gmail.com";
        acc1.fullName = "Duy Anh 1";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();

        Account acc2 = new Account();
        acc2.accountID = 2;
        acc2.email = "duyanh2@gmail.com";
        acc2.fullName = "Duy Anh 2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.now();

        Account acc3 = new Account();
        acc3.accountID = 3;
        acc3.email = "duyanh3@gmail.com";
        acc3.fullName = "Duy Anh 3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();

        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Group1";
        group1.creator = acc1;
        group1.createDate = LocalDate.now();

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "Group2";
        group2.creator = acc2;
        group2.createDate = LocalDate.now();

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "Group3";
        group3.creator = acc3;
        group3.createDate = LocalDate.now();

        TypeQuestion type1 = new TypeQuestion();
        type1.typeID = 1;
        type1.typeName = TypeName.ESSAY;

        CategoryQuestion cat1 = new CategoryQuestion();
        cat1.categoryID = 1;
        cat1.categoryName = "Java";

        Question q1 = new Question();
        q1.questionID = 1;
        q1.content = "Hàm main trong Java là gì?";
        q1.category = cat1;
        q1.type = type1;
        q1.creator = acc1;
        q1.createDate = LocalDate.now();

        Answer ans1 = new Answer();
        ans1.answerID = 1;
        ans1.content = "Là điểm bắt đầu của chương trình";
        ans1.question = q1;
        ans1.isCorrect = true;

        Answer ans2 = new Answer();
        ans2.answerID = 2;
        ans2.content = "Dùng lệnh CREATE TABLE";
        ans2.question = q1;
        ans2.isCorrect = true;

        Exam exam1 = new Exam();
        exam1.examID = 1;
        exam1.code = "JV1";
        exam1.title = "Đề thi Java";
        exam1.category = cat1;
        exam1.duration = 60;
        exam1.creator = acc1;
        exam1.createDate = LocalDate.now();

        GroupAccount ga1 = new GroupAccount();
        ga1.group = group1;
        ga1.account = acc1;
        ga1.joinDate = LocalDate.now();



        System.out.println("Account 1: " + acc1.fullName + " Phòng: " + acc1.department.departmentName + " Chức vụ: " + acc1.position.positionName + " Ngày tạo: " + acc1.createDate);
        System.out.println("Account 2: " + acc2.fullName + " Phòng: " + acc2.department.departmentName + " Chức vụ: " + acc2.position.positionName + " Ngày tạo: " + acc2.createDate);

        System.out.println("Group: " + group1.groupName + "  Người tạo: " + group1.creator.fullName);
        System.out.println("Group: " + group2.groupName + "  Người tạo: " + group2.creator.fullName);

        System.out.println("Phòng ban 1: " + dep1.departmentName);
        System.out.println("Phòng ban 2: " + dep2.departmentName);
        System.out.println("Phòng ban 3: " + dep3.departmentName);

    }
}