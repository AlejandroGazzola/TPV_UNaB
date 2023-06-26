import java.util.ArrayList;
import java.util.List;

public class Factura {
    // La lista puede ser privada, así siempre se muestra con el método mostrarListaProductos
    private List<Producto> productos = new ArrayList<>();
public Factura() {
    // No era necesario hacer un new ArrayList acá, ya que se estaba haciendo arriba también
}
    //Agrega productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    //Muestra los productos en lista (Esto podría ser estático)
    public void mostrarListaProductos() {
        for (Producto producto : productos) {
            System.out.println("* " + producto.getNombre() + "--------- $ " + producto.getPrecio());
        }
    }

    //Calcula el total de la compra (También podría ser estático)
    public double getTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
