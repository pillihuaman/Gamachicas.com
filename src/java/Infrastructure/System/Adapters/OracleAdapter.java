/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Infrastructure.System.Adapters;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/**
 *
 * @author zarmir
 */
public class  OracleAdapter {

     public  static Connection getConnection ()
     {
         Connection con= null;
          try
          {
          
          Class.forName("oracle.jdbc.driver.OracleDrive");
          con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","gamachicas","123456");
          }
          catch(ClassNotFoundException | SQLException ex)
          {
                ex.getMessage();
          
          }
         
     return  con;
     }
}
