import java.sql.*;

public class InsertDataJDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sys.employee";
        String user = "root";
        String password = "admin";


        int[] empcode = {101, 102, 103, 104, 105};
        String[] empname = {"Jenny", "Jacky", "Joe", "John", "Shameer"};
        int[] empage = {25, 30, 20, 40, 25};
        double[] esalary = {10000, 20000, 40000, 80000, 90000};
        String insertQuery = "INSERT INTO Employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";

        try {

            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            for (int i = 0; i < empcode.length; i++) {
                preparedStatement.setInt(1, empcode[i]);
                preparedStatement.setString(2, empname[i]);
                preparedStatement.setInt(3, empage[i]);
                preparedStatement.setDouble(4, esalary[i]);
                preparedStatement.executeUpdate();
            }

            System.out.println("Data inserted successfully.");
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
