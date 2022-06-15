package activitwo;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        String User[] = {"Daiana","Facundo","Osvaldo","Melina"};
        int pass[] = {1234,4321,1122,3344};
        Scanner Leer = new Scanner(System.in);
        Scanner LeerNumero=new Scanner(System.in);
        System.out.println("Bienvenido A continuacion Ingrese sus Datos");

        boolean bandera=true;

        while (bandera==true){
            System.out.println("Ingrese su Nombre");
            String Nombre = Leer.nextLine();
            System.out.println("Ingrese su Contraseña");
            int contraseña = LeerNumero.nextInt();
            for (int i = 0; i < User.length; i++) {

            if(User[i].equals(Nombre)){
                if (Nombre.equals(User[i]) && contraseña == pass[i]) {
                    System.out.println("Bienvenido; " + Nombre);
                    System.out.println("Desea cambiar de contraseña");


                           System.out.println("opcion- 1 si");
                           System.out.println("Opcion-2 Salir");
                           int cambiar = Leer.nextInt();
                           int logo;

                           if (cambiar == 1) {
                               do{
                               System.out.println("ingrese su nueva contraseña");
                               int NuevaContraseña = Leer.nextInt();
                               System.out.println("Su cotraseña ha sido cabiada correctamente");
                                   System.out.println("prsione 2 para salir");
                               logo=Leer.nextInt();
                               }while (logo!=2);
                               System.out.println("usted a cerrado cesion sorectamente");
                           }



                    if (cambiar == 2) {
                        System.out.println("usted a cerrado su cuenta correctamente");
                    }

                    bandera=false;
                    break;
                } else if(!Nombre.equals(User[i])) {
                    System.out.println("El usuario no corresponde");
                    bandera = true;


                }else if (contraseña != pass[i]) {
                    System.out.println("la contraseña ingresada no es correcta");
                    bandera = true;


                }
            }

        }








        }


    }
}

