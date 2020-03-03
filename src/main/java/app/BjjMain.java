package app;

import database.DatabaseManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class BjjMain {
    public static void main(String[] args) {
        DatabaseManager dm = new DatabaseManager();
        //dm.Test();
    }
//    private static Connection con;
//    private static boolean hasData = false;
//
//    public ResultSet displayUsers() throws SQLException, ClassNotFoundException {
//
//        if (con == null) {
//            getConnection();
//        }
//
//        Statement state = con.createStatement();
//        ResultSet res = state.executeQuery("SELECT userName FROM user");
//        return res;
//
//    }
//
//    private void getConnection() throws ClassNotFoundException, SQLException {
//        Class.forName("org.sqlite.JDBC");
//        con = DriverManager.getConnection("jdbc:sqlite:BJJ");
//        initialise();
//    }
//
//    private void initialise() throws SQLException {
//        if (!hasData) {
//            hasData = true;
//
//            Statement state = con.createStatement();
//            ResultSet res = state.executeQuery("SELECT name FROM sqlite master WHERE type='table' AND name='user'");
//        }
//    }
}
