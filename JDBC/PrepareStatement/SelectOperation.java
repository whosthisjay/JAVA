package JDBC.PrepareStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectOperation {
    private static final String url="jdbc:mysql://localhost:3306/myDatabase";
    private static final String username="root";
    private static final String password="IamBatman@87";

    public static void main(String[] args) {
        Connection connection =null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found!");
        }
        try{
            connection= DriverManager.getConnection(url,username,password);
            String query="SELECT * FROM students";
            preparedStatement=connection.prepareStatement(query);
           resultSet=preparedStatement.executeQuery();
            System.out.println("+-------------------+--------------------------------------+");
            while(resultSet.next()){
                int id=resultSet.getInt("id");
                int age=resultSet.getInt("age");
                String name=resultSet.getString("name");
                double marks=resultSet.getDouble("marks");
                System.out.println("| ID : "+id+" | Name : "+name+"   | AGE : "+age+" | Marks : "+marks+"     |");
                System.out.println("+-------------------+--------------------------------------+");
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(connection!=null)connection.close();
                if (resultSet!=null)resultSet.close();
                if (preparedStatement!=null)preparedStatement.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
