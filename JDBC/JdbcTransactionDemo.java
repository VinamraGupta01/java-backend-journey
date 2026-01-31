import java.sql.*;

public class JdbcTransactionDemo {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/STUDENT";
        String userName="root";
        String password="rootdev122";

        //INSERT QUERY
        String insertQuery="INSERT INTO STUDENT (NAME, MARKS) VALUES (?, ?)";
        
        //UPDATE QUERY
        String updateQuery="UPDATE STUDENT SET MARKS=? WHERE ID=?";

        Connection conn=null;

        try {
            //CONNECTING TO DATABASE
            conn=DriverManager.getConnection(url, userName, password);
            conn.setAutoCommit(false);

            //INSERT QUERY USING PREPARED STATEMENT
            PreparedStatement ps1=conn.prepareStatement(insertQuery);
            ps1.setString(1, "KANISHKA");
            ps1.setDouble(2, 91.85);
            ps1.executeUpdate();

            //UPDATE QUERY USING PREPARED STATEMENT
            PreparedStatement ps2=conn.prepareStatement(updateQuery);
            ps2.setDouble(1, 65.78);
            ps2.setInt(2, 1);
            ps2.executeUpdate();

            //SAVING CHANGES IF TRANSACTION SUCCESSFULL
            conn.commit();
            System.out.println("TRANSACTION SUCCESSFUL");

            //CLOSING CONNECTIONS
            ps1.close();
            ps2.close();
            conn.close();

        } catch(Exception e) {
            try {
                //ROLLING BACK IF TRANSACTION FAILS
                if(conn != null) {
                    conn.rollback();
                    System.out.println("TRANSACTION ROLLED BACK");
                }
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
