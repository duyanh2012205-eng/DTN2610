package backend;

import entity.Department;
import entity.Position;
import enums.PositionName;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QLPosition {
    public static List<Position> showPosition() throws ClassNotFoundException {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select * from position;";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<Position> positions = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                PositionName name =PositionName.valueOf(rs.getString("name"));

                Position pos = new Position(id,name);
                positions.add(pos);
            }
            return positions;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public static List<Position> findByPositionIdAndName(int searchId, String searchName) throws ClassNotFoundException {
        List<Position> positions = new ArrayList<>();
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "select * from position where id = ? and name like ?;";
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, searchId);
            prepareStatement.setString(2, searchName);

            ResultSet rs = prepareStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                PositionName name = PositionName.valueOf(rs.getString("name"));

                Position pos = new Position(id, name);
                positions.add(pos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return positions;
    }

    public static boolean insertPosition(String newName) {
        try {
            Connection connection = JDBCUtils.getConnection();
            String sql = "insert into position (name) values (?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,newName);

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
            String sql = "delete from position where name = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, deleteName.toUpperCase());

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
