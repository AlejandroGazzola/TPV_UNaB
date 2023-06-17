import java.util.Scanner;

public class Vendedor extends Usuario {

    public Vendedor(String nombre, String contrasena) {
        super(nombre, contrasena);
    }


    @Override
    public boolean ingresar(String nombre,String contrasena) {
        return DB.ingresarAlSistema(new Vendedor(nombre, contrasena));
    }

}

