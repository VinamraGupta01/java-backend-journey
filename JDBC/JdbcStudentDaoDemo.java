import java.sql.*;

class StudentDAO {

    private final String url = "jdbc:mysql://localhost:3306/STUDENT";
    private final String username = "root";
    private final String password = "rootdev122";

    // INSERT METHOD
    public void insertStudent(String name, double marks) {

        String query = "INSERT INTO STUDENT (NAME, MARKS) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setDouble(2, marks);

            ps.executeUpdate();
            System.out.println("STUDENT INSERTED");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //READ METHOD
    public void getAllStudents() {

        String query = "SELECT * FROM STUDENT";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            System.out.println("\nID NAME MARKS");
            System.out.println("--------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("ID") + " " +
                        rs.getString("NAME") + " " +
                        rs.getDouble("MARKS")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class JdbcStudentDaoDemo {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        // INSERT DATA
        dao.insertStudent("ARJUN", 90.5);

        // READ DATA
        dao.getAllStudents();
    }
}
