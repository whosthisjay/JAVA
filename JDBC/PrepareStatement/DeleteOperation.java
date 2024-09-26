package JDBC.PrepareStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class DeleteOperation {
    private static final String url="jdbc:mysql://localhost:3306/myDatabase";
    private static final String username="root";
    private static final String password="IamBatman@87";

    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Class NoT Found");
        }

        try{
            connection=DriverManager.getConnection(url,username,password);
            String query ="DELETE FROM students where id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,8);
            int rowsAffected =preparedStatement.executeUpdate();
            if (rowsAffected>0){
                System.out.println("Data deleted Succesfully ");
            }else{
                System.out.println("Data not deleted ");
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if (connection!=null) connection.close();
                if (preparedStatement!=null) preparedStatement.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }

        }
    }
}

