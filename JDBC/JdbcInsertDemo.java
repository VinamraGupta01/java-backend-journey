import java.sql.*;

public class JdbcInsertDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/STUDENT";
        String userName = "root";
        String password = "rootdev122";

        String enterName = "NAMAN";
        Date enterDob = Date.valueOf("2002-06-15");
        double enterMarks = 92.45;

        String query =
            "INSERT INTO STUDENT (NAME, DOB, MARKS) VALUES (?, ?, ?)";

        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, enterName);
            ps.setDate(2, enterDob);
            ps.setDouble(3, enterMarks);

            int count = ps.executeUpdate();
            System.out.println(count + " row inserted");

            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
