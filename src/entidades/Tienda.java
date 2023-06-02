package entidades;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String nombre;
    List<Venta> ventas; 
    List<Producto> productos;

    public Tienda(String nombre, List<Venta> ventas, List<Producto> productos) {
        this.nombre = nombre;
        this.ventas = ventas;
        this.productos = productos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
   
}
