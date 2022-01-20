package net.sqlitetutorial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
    public static void createNewTable() {
        String url = "jdbc:sqlite:C://sqlite/db/cinema.db";
        String sql = "CREATE TABLE IF NOT EXISTS movies (\n"
                + "	sid integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + " actor text NOT NULL,\n"
                + " director text NOT NULL,\n"
                + "	yearofrelease real\n"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        createNewTable();
    }

}
