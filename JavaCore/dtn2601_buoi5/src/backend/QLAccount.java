package backend;

import entity.Account;
import entity.Department;
import entity.Position;
import enums.PositionName;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QLAccount {
    public static List<Account> showAccount() throws ClassNotFoundException {
        List<Account> accounts = new ArrayList<>();
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select acc.*, de.name AS department_name, po.name AS position_name \n" + "from account acc\n" + "left join department de on acc.department_id = de.id\n" + "left join position po on acc.position_id = po.id;";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Integer id = rs.getInt("account_id");
                String email = rs.getString("email");
                String userName = rs.getString("username");
                String fullName = rs.getString("full_name");
                Integer departmentID = rs.getInt("department_id");
                String departmentName = rs.getString("department_name");
                Integer positionID = rs.getInt("position_id");
                String positionName = rs.getString("position_name");
                Date createDate = rs.getDate("create_date");

                Department department = new Department(departmentID, departmentName);
                Position position = new Position(positionID, PositionName.valueOf(positionName));

                Account account = new Account(id, userName, fullName, email, department, position, createDate);
                accounts.add(account);
            }
        } catch (Exception e) {
            System.out.println("Kết nối DB ko thành công");
            e.printStackTrace();
        }
        return accounts;
    }

    public static List<Account> findByAccountIdAndName(int searchId, String searchName) throws ClassNotFoundException {
        List<Account> accounts = new ArrayList<>();
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select * from account where account_id = ? and username like ?;";
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, searchId);
            prepareStatement.setString(2, searchName);

            ResultSet rs = prepareStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("account_id");
                String name = rs.getString("username");

                Account acc = new Account(id, name);
                accounts.add(acc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public static boolean insertAccount(String username, String fullName, String email, Department department, Position position, Date createDate) throws ClassNotFoundException {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "INSERT INTO account " + "(username, full_name, email, department_id, position_id, create_date) " + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, fullName);
            preparedStatement.setString(3, email);
            preparedStatement.setInt(4, department.getId());
            preparedStatement.setInt(5, position.getId());
            preparedStatement.setDate(6, new java.sql.Date(createDate.getTime()));
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
    public static boolean deleteAccount(String username) throws ClassNotFoundException {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "delete from account where username like ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);

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
    public static boolean updateAccount(
            int id,
            String username,
            String fullName,
            String email,
            Department department,
            Position position,
            Date createDate) {

        try {
            Connection connection = JDBCUtils.getConnection();

            String sql = "UPDATE account " + "SET username = ?, " + "full_name = ?, " + "email = ?, " + "department_id = ?, " + "position_id = ?, " + "create_date = ? " + "WHERE id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, fullName);
            preparedStatement.setString(3, email);
            preparedStatement.setInt(4, department.getId());
            preparedStatement.setInt(5, position.getId());
            preparedStatement.setDate(6, new java.sql.Date(createDate.getTime()));
            preparedStatement.setInt(7, id);
            int c = preparedStatement.executeUpdate();
            return c > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
