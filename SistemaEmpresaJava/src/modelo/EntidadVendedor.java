
package modelo;


public class EntidadVendedor {
    int idVendedor;
    String nombreVendedor;
    String telefonoVendedor;
    String estadoVendedor;
    String dnicVendedor;
    String user;

    public EntidadVendedor() {
    }

    public EntidadVendedor(int idVendedor, String nombreVendedor, String telefonoVendedor, String estadoVendedor, String dnicVendedor, String user) {
        this.idVendedor = idVendedor;
        this.nombreVendedor = nombreVendedor;
        this.telefonoVendedor = telefonoVendedor;
        this.estadoVendedor = estadoVendedor;
        this.dnicVendedor = dnicVendedor;
        this.user = user;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getTelefonoVendedor() {
        return telefonoVendedor;
    }

    public void setTelefonoVendedor(String telefonoVendedor) {
        this.telefonoVendedor = telefonoVendedor;
    }

    public String getEstadoVendedor() {
        return estadoVendedor;
    }

    public void setEstadoVendedor(String estadoVendedor) {
        this.estadoVendedor = estadoVendedor;
    }

    public String getDnicVendedor() {
        return dnicVendedor;
    }

    public void setDnicVendedor(String dnicVendedor) {
        this.dnicVendedor = dnicVendedor;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

   
    
    
}
