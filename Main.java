import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        String inputUsuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String inputContrasena = scanner.nextLine();

        Vendedor vendedor = new Vendedor(inputUsuario, inputContrasena);

        Producto prod1 = new Producto("Xiaomi ", 150000);
        Producto prod2 = new Producto("Samsung ", 200000);
        Producto prod3 = new Producto("IPhone  ", 800000);
        Producto prod4 = new Producto("Motorola", 180000);

        boolean login = vendedor.ingresar(vendedor.getNombre(), vendedor.getContrasena());

        if (login) {
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
            do {
                System.out.print("Ingrese el número de producto (0 para finalizar e imprimir factura): ");
                opcion = scanner.nextInt();

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

            Factura factura = new Factura();
            for (Producto producto : carrito) {
                factura.agregarProducto(producto);
            }

            System.out.println(" ----------- Factura -----------");
            factura.mostrarListaProductos();
            System.out.println("Total de la compra: $ " + factura.getTotal());

            scanner.close();

        }
    }
}
