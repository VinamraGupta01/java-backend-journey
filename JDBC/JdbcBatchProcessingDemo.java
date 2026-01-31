import java.sql.*;

public class JdbcBatchProcessingDemo {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/STUDENT";
        String userName="root";
        String password="rootdev122";

        //INSERT QUERY TO BE EXECUTED
        String insertQuery="INSERT INTO STUDENT (NAME,MARKS) VALUES (?,?)";

        Connection conn=null;

        try {
            //ESTABLISHING A CONNECTION TO DATABASE
            conn=DriverManager.getConnection(url, userName, password);

            //PREPARED STATEMENT FOR INSERT QUERY
            PreparedStatement ps=conn.prepareStatement(insertQuery);

            conn.setAutoCommit(false);

            //FIRST RECORD
            ps.setString(1,"FARHAN");
            ps.setDouble(2,89.45);
            ps.addBatch();

            //SECOND RECORD
            ps.setString(1,"LAVANYA");
            ps.setDouble(2,80.39);
            ps.addBatch();

            //THIRD RECORD
            ps.setString(1,"TIYA");
            ps.setDouble(2,98.95);
            ps.addBatch();

            //FOURTH RECORD
            ps.setString(1,"MUKESH");
            ps.setDouble(2,55.55);
            ps.addBatch();

            int result[]=ps.executeBatch();
            
            //SAVING CHANGES
            conn.commit();

            System.out.println(result.length+ " RECORDS ENTERED SUCCESSFULLY");

            //CLOSING CONNECTIONS
            ps.close();
            conn.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}