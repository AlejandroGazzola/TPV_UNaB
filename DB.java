import java.util.Arrays;
import java.util.List;

public class DB {
    private static List<Vendedor> usuariosRegistrados = Arrays.asList(
            new Vendedor("Alejandro", "1234"),
            new Vendedor("Lucas", "1234"),
            new Vendedor("Silvina", "1234"),
            new Vendedor("Ricardo", "1234")
    );

    public static boolean ingresarAlSistema(Vendedor usuario) {
        for (Vendedor vendedor: usuariosRegistrados) {
            if (vendedor.getNombre().equals(usuario.getNombre())) {
                System.out.println("Bienvenido " + usuario.getNombre());
                return true;
            }
        }
        System.out.println("El usuario no está registrado");
        return false;
    }
}
