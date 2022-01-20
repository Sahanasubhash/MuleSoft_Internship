package net.sqlitetutorial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertValues {
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
    public void insert(Integer sid, String movie_name, String actor_name, String director_name, Integer yearofrelease) {
        String sql = "INSERT INTO movies(sid, movie_name, actor_name, director_name, yearofrelease) VALUES(?,?,?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, capacity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

        InsertValues app = new InsertValues();
        
        app.insert(1,"Mission: Impossible III ","James McGarth","J.J. Abrams",2006);
        app.insert(2,"Ten Seconds to Hell","Jack Palance","Robert Aldrich",1959);
        app.insert(3,"Men of Crisis: The Harvey Wallinger Story","Diane Keaton","Woody Allen",1971);
        app.insert(4,"Untitled Wes Anderson film","Bill Murray","Wes Anderson",2006);
        app.insert(5,"Iron Man","Robert Downey Jr.","Jon Favreau",2008);
        app.insert(6,"Thor","Chris Hemsworth","Kenneth Branagh",2011);
    }

}