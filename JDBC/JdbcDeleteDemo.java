import java.sql.*;

public class JdbcDeleteDemo {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/STUDENT";
        String userName="root";
        String password="rootdev122";

        //DATA TO BE DELETED
        int idToDelete=3;

        //DELETE QUERY TO BE EXECUTED
        String query="DELETE FROM STUDENT WHERE ID=?";

        try {
            //MAKING CONNECTION TO DATABASE
            Connection conn=DriverManager.getConnection(url,userName,password);

            //USING PREPARED STATEMENT
            PreparedStatement ps=conn.prepareStatement(query);

            //DELETING THE DATA
            ps.setInt(1, idToDelete);

            //DISPLAYING NUMBER OF ROWS AFFECTED
            int rowsAffected=ps.executeUpdate();
            System.out.println(rowsAffected+ " ROW'S AFFECTED");

            //CLOSING CONNECTION
            ps.close();
            conn.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}