


import java.util.ArrayList;
import java.util.Scanner;

public class vista {

public static int  menu() {
    Scanner Leer = new Scanner(System.in);
    int opcion;
    System.out.println("Clinica SOLUTION S.A.");
    System.out.println("A continuacion selecione la opcion que desea; ");
    System.out.println("[1] Agregar Paceinte");
    System.out.println("[2] Agregar Doctor");
    System.out.println("[3] Listar Pacientes");
    System.out.println("[4] Listar Doctores");
    System.out.println("[5] Asignar Turno");

    opcion= Leer.nextInt();
    return opcion;
}

public static Paciente agregarPaciente( ){
    Paciente p=new Paciente();
       Scanner Leer=new Scanner(System.in);
       Scanner numero=new Scanner(System.in);
    System.out.println("Nombre del paciente");
     String  nom=Leer.nextLine();
     p.setNombre(nom);
    System.out.println("Apwllido del paciente");
    String ape= Leer.nextLine();
    p.setApellido(ape);
    System.out.println("Edad del paciente");
    int ed=numero.nextInt();
    p.setEdad(ed);
    System.out.println("DNI del paciente");
    int iden=numero.nextInt();
    p.setDNI(iden);
    System.out.println("Obra Social del Paciente");
    String ayuda=Leer.nextLine();
    p.setObraSocial(ayuda);

    return p ;
}
public static Doctor agregarDoctor( ){
    Doctor d=new Doctor();
    Scanner Leer=new Scanner(System.in);
    Scanner numero=new Scanner(System.in);
    System.out.println("Nombre del Doctor");
    String  nom=Leer.nextLine();
   d.setNombre(nom);
    System.out.println("Apwllido del Doctor");
    String ape= Leer.nextLine();
    d.setApellido(ape);

    System.out.println("matricula");
    int matricula=numero.nextInt();
    d.setMatricula(matricula);

    System.out.println("Profesion");
    String profesion=Leer.nextLine();
    d.setProfesion(profesion);

    return d;

}
    public static void listadepacientes(ArrayList<Paciente>ListaPacientes){

        for (int i=0;i<ListaPacientes.size();i++){
            System.out.println("["+i+"]-"+ListaPacientes.get(i));
        }

    }
public static void listadedoctores(ArrayList<Doctor>ListaDoctores){

    for (int i=0;i<ListaDoctores.size();i++){
        System.out.println("["+i+"]-"+ListaDoctores.get(i));
    }
}
}
