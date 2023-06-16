public class Producto {
    public String nombre;
    public float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //Producto producto2 = new Producto("Samsung", 200000);
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio;
    }

    public float getPrecio() {

        return precio;
    }

    public String getNombre() {
        return nombre;
    }

//     Sirve cambiar nombre y precio del producto
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void setPrecio(float precio) {
//        this.precio = precio;
//    }


//    public static void seleccionarProducto(String nombreProducto1) {
//
//        if (nombreProducto1.equals(this.nombre)) {
//            System.out.println(getNombre() + precio);
//        }
//    }

}
