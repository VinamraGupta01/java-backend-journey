import java.sql.*;

public class JdbcTryWithResourcesDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/STUDENT";
        String userName = "root";
        String password = "rootdev122";

        String query =
            "INSERT INTO STUDENT (NAME, MARKS) VALUES (?, ?)";

        try (
            Connection conn = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = conn.prepareStatement(query)) {

            conn.setAutoCommit(false);

            ps.setString(1, "Riya");
            ps.setDouble(2, 92.5);
            ps.addBatch();

            ps.setString(1, "Karan");
            ps.setDouble(2, 85.0);
            ps.addBatch();

            ps.executeBatch();
            conn.commit();

            System.out.println("BATCH INSERT SUCCESSFUL");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
