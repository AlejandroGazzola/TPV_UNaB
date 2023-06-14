public class Main {
    public static void main(String[] args) {
        //Crear cliente
        Cliente usuario = new Cliente("Alejandro", "1234");

        //Crear producto
        Producto producto1 = new Producto("Xiaomi", 150000);
        Producto producto2 = new Producto("Samsung", 200000);

        //Ingresa cliente
        usuario.ingresar();

        //Selecciona producto
        usuario.seleccionarProducto(producto1);
        usuario.seleccionarProducto(producto2);

        //El cliente compra y obtiene ticket
        Ticket ticket = usuario.comprar();

        //Generar ticket
        ticket.generarTicket();

        //Calcula total
        float total = ticket.calcularTotal();

        //Imprimir el total
        System.out.println("El total es: " + total);
    }
}
