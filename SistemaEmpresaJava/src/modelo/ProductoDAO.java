
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements CRUD {
    
     //metodos para realizar el mantenimiento en base de datos
    int r;
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Producto pro=new Producto();
    
   public Producto listarID(int id){
        Producto p =new Producto();// se instancia el objeto c
        String sql="select * from producto where IdProducto =?";//=al dni q se recibe por parametro
        try {
            con = cn.Conectar();//conexion variable definida arriba
            ps = con.prepareStatement(sql);//seconectan para general la consulta sql
            ps.setInt(1, id);//parametro para hacer uso del int id en la base de datos en la consulta ventasform
            rs = ps.executeQuery();
            while(rs.next()){//en ves de numero se puede colocar el nombre de la columna
                p.setIdProducto(rs.getInt(1));//segun la pocision en la base de datos 
                p.setNombreProducto(rs.getString(2));//segun la pocision en la base de datos
                p.setPrecio(rs.getInt(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
                
            }
        } catch (Exception e) {
        }
        return p;
   } 
    
    //////////////////mantenimiento CRUD//////////////////////// 
    public List listar() {
        List<Producto> lista = new ArrayList<>();  //objeto que queremos listar en el caso Cliente
        String sql = "select * from producto";//consulta
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);//seconectan para general la consulta sql
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pro = new Producto();
                pro.setIdProducto(rs.getInt(1));
                pro.setNombreProducto(rs.getString(2));
                pro.setPrecio(rs.getInt(3)); //ojito con esta
                pro.setStock(rs.getInt(4));
                pro.setEstado(rs.getString(5));
                lista.add(pro);//la variable lista recogera los datos anteriores
            }
        } catch (Exception e) {
        }
        return lista;
        /////////////////////////////////////////////////////////////////////////////////
    }
     @Override
      public int add(Object[] o) {//objeto debe ser un arreglo con[]       
        int r = 0;
        //metodo agregar
        String sql = "insert into producto(NombreProducto,Precio,Stock,Estado)values(?,?,?,?)";//consulta que se hara en el orden de la base de datos
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);//se agregan los datos del objeto(Object)posicion 0
            ps.setObject(2, o[1]);//el arreglo ira segun el string sql
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();//EJECUTAR CONSULTA O CAMBIOS
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update producto set NombreProducto=?,Precio=?,Stock=?,Estado=? where IdProducto=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);//se agregan los datos del objeto(Object)posicion 0
            ps.setObject(2, o[1]);//el arreglo ira segun el string sql
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;

    }
    
    @Override
    public void eliminar(int id) {
        String sql = "delete from producto where IdProducto=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);//enviar el id de la fila seleccionada
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    
}
