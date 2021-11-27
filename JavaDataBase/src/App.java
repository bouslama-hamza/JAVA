import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class App {
    public static void main(String[] args) throws Exception {
        String db = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "oracle";
        // now let's make our connection 
        try {
            Connection connection = DriverManager.getConnection(db , username , password);
            String sql = "INSERT INTO STUDENT VALUES(1 , 'MAKE' , 25)";
            Statement statement = connection.createStatement();
            int test = statement.executeUpdate(sql);
            if(test > 0){
                System.out.println("One row has been insered");
            }
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("You have a fucking problem");
        }
    }
}