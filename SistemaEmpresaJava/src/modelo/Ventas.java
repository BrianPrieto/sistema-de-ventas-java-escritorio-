
package modelo;



public class Ventas {
    int id;
    int idCliente;
    int idVendedor;
    String numeroSerie;
    String FechaVentas;
    double monto;
    String estado;

    public Ventas() {
    }

    public Ventas(int id, int idCliente, int idVendedor, String numeroSerie, String FechaVentas, double monto, String estado) {
        this.id = id;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.numeroSerie = numeroSerie;
        this.FechaVentas = FechaVentas;
        this.monto = monto;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFechaVentas() {
        return FechaVentas;
    }

    public void setFechaVentas(String FechaVentas) {
        this.FechaVentas = FechaVentas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
            
            
}
