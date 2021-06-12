
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class VentasDAO {
    //metodos para realizar el mantenimiento en base de datos
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Cliente co=new Cliente();
    
    public String IdVentas(){
    String idv="";
    String sql="select * from ventas"
        try {
            
        } catch (Exception e) {
        }
}
    
}
