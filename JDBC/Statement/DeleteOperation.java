package JDBC.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class DeleteOperation {
    private static final String url="jdbc:mysql://localhost:3306/myDatabase";
    private static final String userName="root";
    private static final String password="IamBatman@87";

    public static void main(String[] args){
        Connection conn=null;
        Statement smt=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found");
        }

        try{
            conn= DriverManager.getConnection(url,userName,password);
            smt=conn.createStatement();
            String query="DELETE FROM students where id=6";
            int rowsAffected=smt.executeUpdate(query);
            if(rowsAffected>0){
                System.out.println("DATA Deleted!");
            }else{
                System.out.println("DATA Not Deleted!");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if(conn!=null)conn.close();
                if(smt!=null)smt.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
