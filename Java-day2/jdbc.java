import java.sql.*;
import java.lang.Class;

public class dbConnection {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojects", "root", "");
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from students;");
      while (rs.next()) {
        System.out.println("rollno: " + " " + rs.getString(1));
      }
      con.close(); 
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
