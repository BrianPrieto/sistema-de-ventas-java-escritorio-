package modelo;

public class Cliente {//objetos

    int idCliente;
    String nombreCliente;
    String direccionCliente;
    String estadoCliente;
    String dnicCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombreCliente, String direccionCliente, String estadoCliente, String dnicCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.estadoCliente = estadoCliente;
        this.dnicCliente = dnicCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public String getDnicCliente() {
        return dnicCliente;
    }

    public void setDnicCliente(String dnicCliente) {
        this.dnicCliente = dnicCliente;
    }

    

}