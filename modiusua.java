
import java.util.Scanner;

public class modiusua {

    public static void main(String orgs[]) {
        Scanner Leer = new Scanner(System.in);

        int contraseña;

        String nombre, nueva;
        boolean bandera;

        while (bandera = true) {
            System.out.println("ingrese el nombre de usuario");
            nombre = Leer.next();
            System.out.println("password");
            contraseña = Leer.nextInt();

            if ("Enzo".equals(nombre) && contraseña == 1234) {
                System.out.println("bienvendo enzo");
                bandera = true;
                break;
            }
            if (!"Enzo".equals(nombre)) {
                System.out.println("usuario no existe");
                bandera = true;
            }
            if (contraseña != 1234) {
                System.out.println("contraseña incorrecta");
                bandera = true;
            }
            System.out.println("intentenlo nuevamente");
        }
        System.out.println("desea modidicar su contraseña? SI/NO");
nueva=Leer.next();
if(nueva.equals(nueva)){
    System.out.println("escriba su contraseña actual");
    contraseña=Leer.nextInt();
    System.out.println("ingrese su nueva contraseña");
    contraseña=Leer.nextInt();
    System.out.println("su contraseña ha sido cambiada con exito");
            
}
    }

}


