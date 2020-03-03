package database;

import java.sql.*;

public class DatabaseManager {
    private final String DB_URL = "jdbc:sqlite:Data/BJJTest.db";
    //private Connection connection = null;

    public DatabaseManager() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            ResultSet rs = connection.getMetaData().getTables(null, null, "users", null);
            //if ResultSet is closed that means the getTable() return nothing, so table does not exist, so we create it!
            if (rs.isClosed()) {
                System.out.println("'users' table does not exist!");
                System.out.println("creating new 'users' table.");
                String query = "CREATE TABLE IF NOT EXISTS users(_id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE)";
                Statement statement = connection.createStatement();
                statement.executeUpdate(query);
            }else{
                System.out.println("All OK");
            }
        } catch (SQLException e) {
            throw new Error("SQLException!", e);
        }

    }

//    public void Test(){
//        try {
//            connection = DriverManager.getConnection(DB_URL);
//
//            Statement stmt = null;
//            String query = "select * from userss";
//            try {
//                stmt = connection.createStatement();
//                ResultSet rs = stmt.executeQuery(query);
//                while (rs.next()) {
//                    String name = rs.getString("user");
//                    System.out.println(name);
//                }
//            } catch (SQLException e ) {
//                throw new Error("Problem", e);
//            } finally {
//                if (stmt != null) { stmt.close(); }
//            }
//
//        } catch (SQLException e) {
//            throw new Error("Problem", e);
//        } finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }


}
