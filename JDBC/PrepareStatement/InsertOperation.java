package JDBC.PrepareStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class InsertOperation {
    private static final String url="jdbc:mysql://localhost:3306/myDatabase";
    private static final String username="root";
    private static final String password="IamBatman@87";

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found! ");
        }

        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try{
            connection=DriverManager.getConnection(url,username,password);
            String query="INSERT INTO students(name,age,marks) VALUES(?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Kaduwii");
            preparedStatement.setInt(2,22);
            preparedStatement.setDouble(3,23);
            int rowsAffected=preparedStatement.executeUpdate();
            if(rowsAffected>0){
                System.out.println("Data Inserted Succesfully :-)");
            }
            else{
                System.out.println("Data Not Inserted :-( ");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(connection!=null)connection.close();
                if (preparedStatement!=null)preparedStatement.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
