
package modelo;

import java.util.List;


public interface CRUD {
    //se declaran todos los metodos a utilizar en cllientes y formularios de mantenimiento
    public List listar();
    public int add(Object[] o);//metodo agregar
    public int actualizar(Object[] o);
    public void eliminar(int id);
      
}
