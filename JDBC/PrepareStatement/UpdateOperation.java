package JDBC.PrepareStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
public class UpdateOperation {
    private static final String url="jdbc:mysql://localhost:3306/myDatabase";
    private static final String username="root";
    private static final String password="IamBatman@87";
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found !");
        }
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try{
            connection=DriverManager.getConnection(url,username,password);
            String query="UPDATE students SET marks=? where id=?";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.setDouble(1,33);
            preparedStatement.setInt(2,8);
            int rowsAffected=preparedStatement.executeUpdate();
            if(rowsAffected>0){
                System.out.println("Data Updated Succesfully ");
            }else{
                System.out.println("Data Not Upadated");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if (connection!=null) connection.close();
                if (preparedStatement!=null) preparedStatement.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
