package JDBC.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class BatchProcessing {
    private static final String url="jdbc:mysql://localhost:3306/myDatabase";
    private static final String username="root";
    private static final String password="IamBatman@87";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Connection connection=null;
        Statement statement=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Class NoT Found !");
        }

        try{
            connection=DriverManager.getConnection(url,username,password);
            statement= connection.createStatement();
            while(true){
                System.out.print("Enter Name : ");
                String name=sc.next();
                System.out.print("Enter Age : ");
                int age=sc.nextInt();
                System.out.print("Enter Marks : ");
                double marks=sc.nextDouble();
                String query=String.format("INSERT INTO students(name,age,marks) VALUES('%s',%d,%f)",name,age,marks);
                statement.addBatch(query);
                System.out.println("Enter More Data[Y/N] : ");
                String choice=sc.next();
                if(choice.toUpperCase().equals("N")){
                    break;
                }

            }
            int[] arr= statement.executeBatch();
            for(int i=0;i<arr.length;i++){
                if (arr[i]==0){
                    System.out.println("Query : "+i+" not executed Succesfully !");
                }
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        finally {
            try{
                if (connection!=null) connection.close();
                if (statement!=null) connection.close();
                sc.close();
            }
            catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
