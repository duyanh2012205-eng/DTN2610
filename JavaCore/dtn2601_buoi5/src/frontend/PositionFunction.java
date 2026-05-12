package frontend;


import backend.QLPosition;
import entity.Position;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositionFunction {
public static Scanner sc = new Scanner(System.in);
    public static void run() throws ClassNotFoundException {
        List<Position> positions = new ArrayList<>();
        while (true) {
            System.out.println("=== Mời bạn chọn chức năng ===");
            System.out.println("1. Xem ds position");
            System.out.println("2. Thêm mới position");
            System.out.println("3. Xóa position theo tên");
            System.out.println("4. Update position theo ID");
            System.out.println("5. Tìm kiếm position theo ID và tên position");
            System.out.println("6. Thoát");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    positions = QLPosition.showPosition();
                    showPosition(positions);
                    break;
                case "2":
                    insertPosition();
                    break;
                case "3":
                    deletePosition();
                    break;
                case "4":
                    updatePosition();
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

    public static void showPosition(List<Position> positions) {
        System.out.println("+-----+--------------------+");
        System.out.printf("|%5s|%20s|\n", "ID", "Tên chức vụ");
        System.out.println("+-----+--------------------+");
        for (Position position : positions) {

            System.out.printf("|%5s|%20s|\n",
                    position.getId(),
                    position.getName().name()
            );
        }
        System.out.println("+-----+--------------------+");
        if (positions.size() == 0) {
            System.out.println("Không tìm thấy");
        }
        System.out.println("+-----+--------------------+");
    }
    public static void findByIdAndName() throws ClassNotFoundException {
        System.out.println("Nhập ID vi tri cần tìm: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên vi tri cần tìm: ");
        String name = sc.nextLine();

        List<Position> positions = QLPosition.findByPositionIdAndName(id, name);
        showPosition(positions);
    }

    public static boolean insertPosition(String newName) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "insert into position (name) values (?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Vi tri " + newName);

            int c = preparedStatement.executeUpdate();
            if (c > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean deletePosition(String deleteName) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "delete from position where name like ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, deleteName);

            int c = preparedStatement.executeUpdate();
            if (c > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean updatePosition(int id, String updateName) {
        try {
            Connection connection = JDBCUtils.getConnection();

            String sql = "update position set name = ? where id = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, updateName);
            preparedStatement.setInt(2, id);

            int c = preparedStatement.executeUpdate();
            if (c > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void insertPosition() {
        System.out.println("Nhập tên ten vi tri: ");
        String name = sc.nextLine();
        boolean check = QLPosition.insertPosition(name);
        if (check) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }

    public static void deletePosition() {
        System.out.println("Nhập vi tri cần xóa: ");
        String name = sc.nextLine();
        boolean check = QLPosition.deletePosition(name);
        if (check) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa thất bại");
        }
    }


    public static void updatePosition() {
        System.out.println("Nhập tên ID phòng ban cần sửa: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên phòng ban muốn thay đổi: ");
        String name = sc.nextLine();

        boolean check = QLPosition.updatePosition(id, name);
        if (check) {
            System.out.println("Update thành công");
        } else {
            System.out.println("Update thất bại");
        }
    }
}
