package semana3_4;

import java.util.Scanner;

public class Vista {
    public static  Persona EntregarPersona(){
        Scanner Leer=new Scanner(System.in);
        String nom,apellido;

        System.out.println("ingrese su nombre");
        nom=Leer.nextLine();
        Persona persona =new Persona ();
        persona.setNombre(nom);
        System.out.println("ingrese su apellido");
        apellido=Leer.nextLine();
        persona.setApellido(apellido);
        return persona;

    }

    public static String MostarPersona(Persona per1){



        return "los dato ingresados son;"+
                "\n"+"Nombre; "+per1.getNombre()+
                "\n"+"Apelido; "+per1.getApellido();

    }

}
