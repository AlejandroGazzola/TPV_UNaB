import java.util.ArrayList;
import java.util.List;

public class Ticket {
    List<Producto> productos = new ArrayList<>();
public Ticket() {
    this.productos = new ArrayList<>();
}

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarListaProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - Precio: " + producto.getPrecio());
        }
    }

    public double getTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
