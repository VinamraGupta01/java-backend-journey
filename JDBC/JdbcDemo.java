import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/STUDENT?useSSL=false&serverTimezone=UTC";
        String userName = "root";
        String password = "rootdev122";
        String query = "SELECT * FROM STUDENT";

        try {
            //LOADING DRIVER
            Class.forName("com.mysql.cj.jdbc.Driver");

            //CREATING CONNECTION
            Connection conn = DriverManager.getConnection(url, userName, password);

            //CREATING STATEMENT
            Statement st = conn.createStatement();

            //EXECUTING QUERY
            ResultSet rs = st.executeQuery(query);

            //READING RESULT
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                float marks = rs.getFloat("MARKS");

                System.out.println(id + " " + name + " " + marks);
            }

            //CLOSING RESOURCES
            rs.close();
            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
