import java.sql.*;

public class JdbcUpdateDemo {
    public static void main(String[] args) {
        
        String url="jdbc:mysql://localhost:3306/STUDENT";
        String userName="root";
        String password="rootdev122";

        //DATA TO BE UPDATED
        int id=2;
        double newMarks=85.65;

        //UPDATE QUERY TO BE EXECUTED
        String query="UPDATE STUDENT SET MARKS=? WHERE ID=?";

        try {
            //MAKING CONNECTION WITH DATABASE
            Connection conn=DriverManager.getConnection(url,userName,password);

            //USING PREPARED STATEMENTS
            PreparedStatement ps=conn.prepareStatement(query);

            //SETTING VALUES FOR PLACE HOLDERS
            ps.setDouble(1,newMarks);
            ps.setInt(2, id);

            //DISPLAYING HOW MANY ROWS GOT AFFECTED
            int rowsAffected=ps.executeUpdate();
            System.out.println(rowsAffected + " ROW'S AFFECTED");

            //CLOSIG CONNECTIONS
            conn.close();
            ps.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}