import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Crear cliente
        Scanner scanner = new Scanner(System.in);

        //Ingresa usuario
        System.out.print("Ingrese su usuario: ");
        String inputUsuario = scanner.nextLine();

        //Ingresa contraseña
        System.out.print("Ingrese su contraseña: ");
        String inputContraseña = scanner.nextLine();

        Vendedor vendedor = new Vendedor(inputUsuario, inputContraseña);

        //Lista de productos
        Producto prod1 = new Producto("Xiaomi ", 150000);
        Producto prod2 = new Producto("Samsung ", 200000);
        Producto prod3 = new Producto("IPhone  ", 800000);
        Producto prod4 = new Producto("Motorola", 180000);

        //Booleano (Es verdadero si el inicio de sesion se hizo correctamente
        boolean login = vendedor.ingresar(vendedor.getNombre(), vendedor.getContrasena());
        //Si booleano == true muestra la lista de productos y corre el programa
        if (login) {
            //Mensaje de bienvenida y listado de productos
            System.out.println("   BIENVENIDO A");
            System.out.println("   *SELL-PHONIA*  " );
            System.out.println("Por favor seleccione los productos a comprar: ");
            System.out.println("1. " + prod1.getNombre() + " -  $" + prod1.getPrecio());
            System.out.println("2. " + prod2.getNombre() + " -  $" + prod2.getPrecio());
            System.out.println("3. " + prod3.getNombre() + " -  $" + prod3.getPrecio());
            System.out.println("4. " + prod4.getNombre() + " -  $" + prod4.getPrecio());
            System.out.println("0. Finalizar selección");

            List<Producto> carrito = new ArrayList<>();
            int opcion;
            //Opcion para elegir productos
            do {
                System.out.print("Ingrese el número de producto (0 para finalizar e imprimir factura): ");
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

            // Genera la factura
            Factura factura = new Factura();
            for (Producto producto : carrito) {
                factura.agregarProducto(producto);
            }

            // Muestra factura
            System.out.println(" ----------- Factura -----------");
            factura.mostrarListaProductos();
            System.out.println("Total de la compra: $ " + factura.getTotal());

            scanner.close();

        }

    }
}
