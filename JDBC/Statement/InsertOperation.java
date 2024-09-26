package JDBC.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
public class InsertOperation {
    private static final String url = "jdbc:mysql://localhost:3306/myDatabase"; // Replace with your actual database name
    private static final String username="root";
    private static final String password="IamBatman@87";
    public static void main(String[] args){
        Connection conn=null;
        Statement smt=null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found! 🚫");
        }

        try{
            conn=DriverManager.getConnection(url,username,password);
            smt= conn.createStatement();
            String query="INSERT INTO students(name,age,marks) VALUES(\"Jyoti\",22,100.0)";
             int rowsAffected=smt.executeUpdate(query);
            if(rowsAffected>0){
                System.out.println("Data Inserted Succesfully 😀");
            }else {
                System.out.println("Data Insertion Failed 💥");
            }


        }catch(SQLException e){
            System.out.println(e.getMessage());
        } finally {
            // Step 6: Close the result set, statement, and connection
            try {
                if (smt != null) smt.close();            // Closing the statement
                if (conn != null) conn.close();          // Closing the connection to free up resources
            } catch (SQLException e) {
                System.out.println(e.getMessage()); // Handling exceptions while closing resources
            }
        }
    }
}
