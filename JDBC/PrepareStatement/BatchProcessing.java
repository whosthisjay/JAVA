package JDBC.PrepareStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchProcessing {
    private static final String url="jdbc:mysql://localhost:3306/myDatabase";
    private static final String username="root";
    private static final String password="IamBatman@87";

    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        Scanner sc=new Scanner(System.in);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println("Class Not Found !");
        }

        try{
            connection=DriverManager.getConnection(url,username,password);
            String query ="INSERT INTO students(name,age,marks) VALUES(?,?,?)";
            preparedStatement=connection.prepareStatement(query);
            while (true){
                System.out.print("Enter Name : ");
                String name=sc.next();
                System.out.print("Enter Age : ");
                int age=sc.nextInt();
                System.out.print("Enter Marks : ");
                double marks = sc.nextDouble();
                System.out.println("Enter More Data[Y/N] : ");
                String choice=sc.next();

                preparedStatement.setString(1,name);
                preparedStatement.setInt(2,age);
                preparedStatement.setDouble(3,marks);
                preparedStatement.addBatch();
                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }
            int[] arr= preparedStatement.executeBatch();
            for(int i=0;i<arr.length;i++){
                if (arr[i]==0){
                    System.out.println("Query : "+i+" not executed Successfully !");
                }
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                if (connection!=null) connection.close();
                if (preparedStatement!=null) connection.close();
                sc.close();
            }
            catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
