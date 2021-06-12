package modelo;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO implements CRUD {

    //metodos para realizar el mantenimiento en base de datos
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Cliente co=new Cliente();
    
    //inplementar el metodo buscar cliente
    public Cliente listarID(String dni){//se define el parametro a recibir osea dni
        Cliente c =new Cliente ();// se instancia el objeto c
        String sql="select * from cliente where DnicCliente =?";//=al dni q se recibe por parametro
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);//seconectan para general la consulta sql
            ps.setString(1, dni);
            rs = ps.executeQuery();
            while(rs.next()){
                c.setIdCliente(rs.getInt(1));//segun la pocision en la base de datos
                c.setNombreCliente(rs.getString(2));//segun la pocision en la base de datos
                c.setDireccionCliente(rs.getString(3));
                c.setEstadoCliente(rs.getString(4));
                c.setDnicCliente(rs.getString(5));
                
            }
        } catch (Exception e) {
        }
        return c;
    }
    
    
    //creamos nuestro metodo
    //pero para no estar repitiendo el hp codigo creamos una interfaz :) LLAMADA "CRUD" EN MODELO
    //y se implemenan los metodos 
    @Override
    public List listar() {
        List<Cliente> lista = new ArrayList<>();  //objeto que queremos listar en el caso Cliente
        String sql = "select * from cliente";//consulta
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);//seconectan para general la consulta sql
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt(1));
                c.setNombreCliente(rs.getString(2));
                c.setDireccionCliente(rs.getString(3)); 
                c.setEstadoCliente(rs.getString(4));
                c.setDnicCliente(rs.getString(5));
                lista.add(c);//la variable lista recogera los datos anteriores
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {//objeto debe ser un arreglo con[]       
        int r = 0;
        //metodo agregar
        String sql = "insert into cliente(NombreCliente,DireccionCliente,EstadoCliente,DnicCliente)values(?,?,?,?)";//consulta que se hara en el orden de la base de datos
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
        String sql = "update cliente set NombreCliente=?,DireccionCliente=?,EstadoCliente=?,DnicCliente=? where IdCliente=?";
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
    public void eliminar(int id) {//el parametro id recibe todo el objeto
        String sql = "delete from cliente where IdCliente=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);//enviar el id de la fila seleccionada
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

}
