package JDBC.Statement;

import java.sql.*;

public class SelectOperation {
    // Database connection details
    private static final String url = "jdbc:mysql://localhost:3306/myDatabase"; // Replace with your actual database name
    private static final String userName = "root";  // Your MySQL username
    private static final String password = "IamBatman@87";      // Your MySQL password

    public static void main(String[] args) {
        Connection conn = null;
        Statement smt = null;
        ResultSet resultSet = null;
        // Step 1: Load the MySQL JDBC Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Loading the MySQL JDBC Driver
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found!");    // If the driver class is not found
        }

        // Step 2: Establish a connection to the database
        try {
            conn = DriverManager.getConnection(url, userName, password); // Establishing the connection

            // Step 3: Create a Statement object to send SQL queries to the database
            smt = conn.createStatement();

            // Step 4: Write and execute a SQL query
            String query = "SELECT * FROM students"; // SQL query to fetch all records from the 'students' table
            resultSet = smt.executeQuery(query); // Executing the query and getting the result set
            System.out.println("+-------------------+--------------------------------------+");

            // Step 5: Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");          // Fetching 'id' column value
                String name = resultSet.getString("name"); // Fetching 'name' column value
                int age = resultSet.getInt("age");        // Fetching 'age' column value
                double marks = resultSet.getDouble("marks"); // Fetching 'marks' column value

                // Printing the fetched data
                System.out.println("| ID : "+id+" | Name : "+name+"   | AGE : "+age+" | Marks : "+marks+"     |");
                System.out.println("+-------------------+--------------------------------------+");
            }

            // Step 6: Close the connection to the database
            conn.close(); // Closing the connection to free up resources
        } catch (SQLException e) {
            System.out.println(e.getMessage()); // Handling any SQL exceptions
        } finally {
            // Step 6: Close the result set, statement, and connection
            try {
                if (resultSet != null) resultSet.close(); // Closing the result set
                if (smt != null) smt.close();            // Closing the statement
                if (conn != null) conn.close();          // Closing the connection to free up resources
            } catch (SQLException e) {
                System.out.println(e.getMessage()); // Handling exceptions while closing resources
            }
        }
    }
}
