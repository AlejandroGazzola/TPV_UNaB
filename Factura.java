import java.util.ArrayList;
import java.util.List;

public class Factura {
    List<Producto> productos = new ArrayList<>();
public Factura() {
    this.productos = new ArrayList<>();
}
    //Agrega productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    //Muestra los productos en lista
    public void mostrarListaProductos() {
        for (Producto producto : productos) {
            System.out.println("* " + producto.getNombre() + "--------- $ " + producto.getPrecio());
        }
    }

    //Calcula el total de la compra
    public double getTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
