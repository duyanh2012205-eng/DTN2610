package backend;


import entity.Department;
import utils.JDBCUtils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QLDepartment {


    public static List<Department> showDepartment() throws ClassNotFoundException {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select * from department;";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<Department> departments = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                Department dep = new Department(id, name);
                departments.add(dep);
            }
            return departments;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public static List<Department> findByDepartmentIdAndName(int searchId, String searchName) throws ClassNotFoundException {
        List<Department> departments = new ArrayList<>();
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select * from department where id = ? and name like ?;";
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, searchId);
            prepareStatement.setString(2, searchName);

            ResultSet rs = prepareStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                Department dep = new Department(id, name);
                departments.add(dep);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return departments;
    }

    public static boolean insertDerpartment(String newName) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "insert into department (name) values (?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Phong ban " + newName);

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


    // procedure

//    public static boolean insertDepartmentProcedure(String newName) {
//        try {
//            Connection connection = JDBCUtils.getConnection();
//            String sql = "{CALL insert_department(?)}";
//            CallableStatement callableStatement = connection.prepareCall(sql);
//            callableStatement.setString(1, newName);
//
//            int c = callableStatement.executeUpdate();
//            if (c > 0) {
//                return true;
//            }  else {
//                return false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

    public static boolean deleteDerpartment(String deleteName) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "delete from department where name like ?;";
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

    public static boolean updateDepartment(int id, String updateName) {
        try {
            Connection connection = JDBCUtils.getConnection();

            String sql = "update department set name = ? where id = ?;";
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
}
