import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private List<Producto> productos;
    private int total;

    public Ticket() {
        productos = new ArrayList<>();
        total = 0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public float calcularTotal() {
        total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void generarTicket() {
        System.out.println("Ticket");
        for (Producto producto: productos) {
            System.out.println(producto.getNombre() + " - Precio: $" + producto.getPrecio());
        }
        System.out.println("Total: $" + calcularTotal());
    }
}
