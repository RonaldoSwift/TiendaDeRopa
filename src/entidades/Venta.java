package entidades;


public class Venta {
    private String codigoDeVenta;
    private String cantidadDeProductos;
    private int precioTotal;

    public Venta(String codigoDeVenta, String cantidadDeProductos, int precioTotal) {
        this.codigoDeVenta = codigoDeVenta;
        this.cantidadDeProductos = cantidadDeProductos;
        this.precioTotal = precioTotal;
    }
    
    

    /**
     * @return the codigoDeVenta
     */
    public String getCodigoDeVenta() {
        return codigoDeVenta;
    }

    /**
     * @param codigoDeVenta the codigoDeVenta to set
     */
    public void setCodigoDeVenta(String codigoDeVenta) {
        this.codigoDeVenta = codigoDeVenta;
    }

    /**
     * @return the cantidadDeProductos
     */
    public String getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    /**
     * @param cantidadDeProductos the cantidadDeProductos to set
     */
    public void setCantidadDeProductos(String cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }

    /**
     * @return the precioTotal
     */
    public int getPrecioTotal() {
        return precioTotal;
    }

    /**
     * @param precioTotal the precioTotal to set
     */
    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
    
}
