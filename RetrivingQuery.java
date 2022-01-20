package net.sqlitetutorial;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class RetrivingQuery {
    private Connection connect() {
        String url = "jdbc:sqlite:C://sqlite/db/cinema.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void selectAll(){
        String sql = "SELECT sid, movie_name, actor_name, director_name, yearofrelease FROM movies";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("movie_name") + "\t" +
                                   rs.getString("actor_name") + "\t" +
                                   rs.getString("director_name") + "\t" +
                                   rs.getInt("yearofrelease"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        RetrivingQuery app = new RetrivingQuery();
        app.selectAll();
    }

}