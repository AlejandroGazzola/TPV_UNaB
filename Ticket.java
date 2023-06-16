import java.util.ArrayList;
import java.util.List;

public class Ticket extends Producto{
    public List<Producto> productos;
    public float total;

    public Ticket(String nombre, float precio) {
        super(nombre, precio);

        // Constructor de la clase Ticket
        productos = new ArrayList<>();
        total = 0;
    }

    public void agregarProductoLista(Producto producto) {
        // Agrega un producto al ticket
        productos.add(producto);
    }

    public float calcularTotal() {
        // Calcula el total de la compra sumando los precios de los productos
        total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void generarTicket() {
        // Genera un ticket de compra mostrando los productos y el total
        for (Producto producto: productos) {
            System.out.println(producto.getNombre() + " - Precio: $" + producto.getPrecio());
        }
        System.out.println("Total: $" + calcularTotal());
    }
    public void imprimirTicket() {
        Ticket ticket = new Ticket(nombre, precio);
        System.out.println(ticket);
    }
}
