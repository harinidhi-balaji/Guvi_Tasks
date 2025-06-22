import java.sql.*;

public class JdbcInsert{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/task2";
        String user = "root";
        String password = "India123";

        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            String sql1 = "Insert into employee(empCode, empName, emPage, eSalary) values" +
             "(101, 'Jenny', 25, 10000), " +
                         "(102, 'Jacky', 30, 20000), " +
                         "(103, 'Joe', 20, 40000), " +
                         "(104, 'John', 40, 80000), " +
                         "(105, 'Shameer', 25, 90000);";

                        
            stmt.executeUpdate(sql1);
            System.out.println("Records Inserted Successfully");

            stmt.close();
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}