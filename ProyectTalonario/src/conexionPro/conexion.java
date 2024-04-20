
package conexionPro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conexion {
    public Connection conexion(){
        Connection conectar =null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/telonary", "root", "");
        }catch(SQLException|ClassNotFoundException e){
            System.out.println("ERROR: "+ e.getMessage());
        }
        
        
        return conectar;
    }
}
