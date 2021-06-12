
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class VendedorDAOO implements CRUD{
    
      Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
          List<EntidadVendedor> lista = new ArrayList<>();  //objeto que queremos listar en el caso entidad vendedor
        String sql = "select * from vendedor";//consulta
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);//seconectan para general la consulta sql
            rs = ps.executeQuery();
            while (rs.next()) {
                EntidadVendedor ev = new EntidadVendedor();
                ev.setIdVendedor(rs.getInt(1));
                ev.setNombreVendedor(rs.getString(2));
                ev.setTelefonoVendedor(rs.getString(3)); //ojito con esta
                ev.setEstadoVendedor(rs.getString(4));
                ev.setDnicVendedor(rs.getString(5));
                ev.setUser(rs.getString(6));
                lista.add(ev);//la variable lista recogera los datos anteriores
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
       int r = 0;
        //metodo agregar
        String sql = "insert into vendedor(NombreVendedor,TelefonoVendedor,EstadoVendedor,DnicVendedor,User)values(?,?,?,?,?)";//consulta que se hara en el orden de la base de datos
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);//se agregan los datos del objeto(Object)posicion 0
            ps.setObject(2, o[1]);//el arreglo ira segun el string sql
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();//EJECUTAR CONSULTA O CAMBIOS
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
         int r = 0;
        String sql = "update vendedor set NombreVendedor=?,TelefonoVendedor=?,EstadoVendedor=?,DnicVendedor=?,User=? where IdVendedor=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);//se agregan los datos del objeto(Object)posicion 0
            ps.setObject(2, o[1]);//el arreglo ira segun el string sql
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from vendedor where IdVendedor=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);//enviar el id de la fila seleccionada
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    }
    

