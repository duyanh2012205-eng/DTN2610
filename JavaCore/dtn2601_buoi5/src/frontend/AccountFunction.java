package frontend;

import backend.QLAccount;
import entity.Account;
import entity.Department;
import entity.Position;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AccountFunction {

    public static void run() throws ClassNotFoundException {
        List<Account> accounts = new ArrayList<>();
        while (true) {
            System.out.println("=== Mời bạn chọn chức năng ===");
            System.out.println("1. Xem ds account");
            System.out.println("2. Thêm mới account");
            System.out.println("3. Xóa account theo tên");
            System.out.println("4. Update account theo ID");
            System.out.println("5. Tìm kiếm account theo ID và tên account");
            System.out.println("6. Thoát");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    accounts = QLAccount.showAccount();
                    showAccount(accounts);
                    break;
                case "2":
                    insertAccount();
                    break;
                case "3":
                    deleteAccount();
                    break;
                case "4":
                    updateAccount();
                    break;
                case "5":
                    findByIdAndName();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Nhập sai, nhập lại.");
            }
        }
    }
    private static Scanner sc = new Scanner(System.in);
    public static void showAccount(List<Account> accounts) {
        System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+");
        System.out.printf("|%5s|%20s|%20s|%20s|%20s|%20s|\n", "ID", "FullName", "Email", "Username", "Tên phòng ban", "Tên chức vụ");
        System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+");
        for (Account account : accounts) {
            System.out.printf("|%5s|%20s|%20s|%20s|%20s|%20s|\n", account.getId(), account.getFullName(), account.getEmail(), account.getUsername(), account.getDepartment().getName(), account.getPosition().getName().name());
        }
        System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+");
        if (accounts.size() == 0) {
            System.out.println("Không tìm thấy");
        }
        System.out.println("+-----+--------------------+--------------------+--------------------+--------------------+--------------------+");
    }

    public static void findByIdAndName() throws ClassNotFoundException {
        System.out.println("Nhập tên ID account cần tìm: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên account cần tìm: ");
        String name = sc.nextLine();

        List<Account> accounts = QLAccount.findByAccountIdAndName(id, name);
        showAccount(accounts);
    }

    public static void insertAccount()
            throws ClassNotFoundException {

        System.out.println("Nhập username:");
        String username = sc.nextLine();

        System.out.println("Nhập full name:");
        String fullName = sc.nextLine();

        System.out.println("Nhập email:");
        String email = sc.nextLine();

        System.out.println("Nhập department id:");
        int departmentId = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập position id:");
        int positionId = Integer.parseInt(sc.nextLine());

        Department department = new Department();
        department.setId(departmentId);
        Position position = new Position();
        position.setId(positionId);
        boolean check = QLAccount.insertAccount(username, fullName, email, department, position, new Date());
        if (check) {
            System.out.println("Thêm account thành công");
        } else {
            System.out.println("Thêm account thất bại");
        }
    }

    public static void deleteAccount() throws ClassNotFoundException {
        System.out.println("Nhập username cần xóa: ");
        String name = sc.nextLine();
        boolean check = QLAccount.deleteAccount(name);
        if (check) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa thất bại");
        }
    }

    public static void updateAccount() throws ClassNotFoundException {
        System.out.println("Nhập ID account cần sửa: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập username mới: ");
        String username = sc.nextLine();

        System.out.println("Nhập full name mới: ");
        String fullName = sc.nextLine();

        System.out.println("Nhập email mới: ");
        String email = sc.nextLine();

        System.out.println("Nhập department id: ");
        int departmentId = sc.nextInt();

        System.out.println("Nhập position id: ");
        int positionId = sc.nextInt();
        sc.nextLine();

        Department department = new Department();
        department.setId(departmentId);

        Position position = new Position();
        position.setId(positionId);

        Date createDate = new Date();

        boolean check = QLAccount.updateAccount(id, username, fullName, email, department, position, createDate);
        if (check) {
            System.out.println("Update thành công");
        } else {
            System.out.println("Update thất bại");
        }
    }
}
