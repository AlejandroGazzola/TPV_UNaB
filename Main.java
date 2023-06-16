import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args) {
        //Crear cliente
        Cliente usuario = new Cliente("1", "1234");

        Scanner scanner = new Scanner(System.in);
        //Crear lista de productos
        List<Producto> listaProductos = new ArrayList<>();

        // Agregar productos a la lista
        listaProductos.add(new Producto("Xiaomi", 150000));
        listaProductos.add(new Producto("Samsung", 200000));
        listaProductos.add(new Producto("Iphone", 800000));
        listaProductos.add(new Producto("Motorola", 180000));
        //Ingresa cliente
        usuario.ingresar();

        // Acceder a los productos de la lista
        for (Producto producto : listaProductos) {
            System.out.println(producto);

        }


//        //Selecciona producto
//        System.out.print("Ingrese productos");
//        String nombreProducto = scanner.nextLine();
//
//        Producto.seleccionarProducto(nombreProducto);

//        //El cliente compra y obtiene ticket
//        //Ticket ticket = Ticket.imprimirTicket();
//
//        //Generar ticket
//        Ticket compra1 = new Ticket();
//        ticket.generarTicket();

//        //Calcula total
//        float total = ticket.calcularTotal();

    }
}
