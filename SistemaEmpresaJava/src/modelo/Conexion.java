
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    //declar las variables url,user,pass
    String url="jdbc:mysql://localhost:3306/bd_ventas";//connexion a la base de datos
    String user="root";
    String pass="";
    
    //creamos el metodo
    
    public Connection Conectar(){
        //tri por que se trabaja con conexion a base de datos
        try {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection(url,user,pass);
             
        } catch (Exception e) {
        }
     return con;
    }
}
