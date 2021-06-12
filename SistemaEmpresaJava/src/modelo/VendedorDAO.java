package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VendedorDAO {

    //METODOS PARA LA EXTRACION DE DATOS
    PreparedStatement ps;
    ResultSet rs;

    Conexion con = new Conexion();
    //despues declarar variable connection
    Connection acceso;

    //otro metodo mamalon donde se valida
    public EntidadVendedor ValidarVendedor(String dnicVendedor, String user) {
        //instanciar la clase conexion y vendedor
        EntidadVendedor ev = new EntidadVendedor();
        //variable para la consulta sql
        String sql = "select * from vendedor where DnicVendedor=? and User=?";
        try {
            //el acceso
            //consulta preciosa
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);//va la consulta
            ps.setString(1, dnicVendedor);
            ps.setString(2, user);
            rs = ps.executeQuery();
            //buscar dentro de la base de datos
            while (rs.next()) {
                ev.setIdVendedor(rs.getInt(1));//EL UNO SIGNIFICA LA COLUMNA
                ev.setUser(rs.getString(6));
                ev.setTelefonoVendedor(rs.getString(3));
                ev.setEstadoVendedor(rs.getString(4));
                ev.setDnicVendedor(rs.getString(5));
                ev.setNombreVendedor(rs.getString(2));

            }

        } catch (Exception e) {
        }

        return ev;

    }

}
