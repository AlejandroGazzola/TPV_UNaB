import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    private String usuario;
    private String contraseña;

    public Cliente(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public void ingresar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        String inputUsuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String inputContraseña = scanner.nextLine();

        if (inputUsuario.equals(usuario) && inputContraseña.equals(contraseña)) {
            System.out.println("Bienvenido, " + usuario + ".");
        } else {
            System.out.println("Usuario y/o contraseña incorrectos.");
        }
    }



}

