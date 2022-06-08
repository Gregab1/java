import java.util.Scanner;

public class Punto_7 {
    public static void main(String orgs[]) {
        Scanner Leer = new Scanner(System.in);

        int contraseña;


        String nombre;
        boolean bandera=true;



        while(bandera==true){
            System.out.println("ingrese el nombre de usuario");
            nombre=Leer.next();
            System.out.println("password");
            contraseña= Leer.nextInt();

            if("Enzo".equals(nombre) && contraseña==1234 ){
                System.out.println("bienvendo enzo");
                bandera=false;
                break;
            }
            if(!"Enzo".equals(nombre)){
                System.out.println("usuario no existe");
                bandera=true;

            }
            if(contraseña!=1234){
                System.out.println("contraseña incorrecta");
                bandera=true;

            }
            System.out.println("intentenlo nuevamente");
        }
    }
}
