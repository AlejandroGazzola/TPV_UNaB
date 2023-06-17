import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Crear cliente
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        String inputUsuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String inputContraseña = scanner.nextLine();

        Vendedor vendedor = new Vendedor(inputUsuario, inputContraseña);

        Producto prod1 = new Producto("Xiaomi1", 150000);
        Producto prod2 = new Producto("Samsung", 200000);
        Producto prod3 = new Producto("IPhone", 800000);
        Producto prod4 = new Producto("Motorola", 180000);

        boolean login = vendedor.ingresar(vendedor.getNombre(), vendedor.getContrasena());

        if (login) {
            System.out.println("Seleccione producto: ");
            System.out.println("1. " + prod1.getNombre() + " - Precio: " + prod1.getPrecio());
            System.out.println("2. " + prod2.getNombre() + " - Precio: " + prod2.getPrecio());
            System.out.println("3. " + prod3.getNombre() + " - Precio: " + prod3.getPrecio());
            System.out.println("4. " + prod4.getNombre() + " - Precio: " + prod4.getPrecio());
            System.out.println("0. Finalizar selección");

            List<Producto> carrito = new ArrayList<>();
            int opcion;
            do {
                System.out.print("Ingrese el número de producto (0 para finalizar): ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea

                switch (opcion) {
                    case 1:
                        carrito.add(prod1);
                        break;
                    case 2:
                        carrito.add(prod2);
                        break;
                    case 3:
                        carrito.add(prod3);
                        break;
                    case 4:
                        carrito.add(prod4);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                        break;
                }
            } while (opcion != 0);

            // Generar ticket
            Ticket ticket = new Ticket();
            for (Producto producto : carrito) {
                ticket.agregarProducto(producto);
            }

            // Mostrar ticket
            System.out.println("Ticket:");
            ticket.mostrarListaProductos();
            System.out.println("Total de la compra: " + ticket.getTotal());

            scanner.close();

        }

    }
}
