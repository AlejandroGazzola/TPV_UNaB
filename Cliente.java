public class Cliente {
    private String usuario;
    private String contraseña;

    public Cliente(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public void ingresar() {
    // Ingresa el cliente
    }
    public void seleccionarProducto(Producto producto) {
    // Selecciona producto
    }

    public Ticket comprar() {
        Ticket ticket = new Ticket();
        return ticket;
    }
}

