import java.util.ArrayList;

public class Controlador {


    public static void main(String[] args) {
        ArrayList<Paciente> ListaPacientes = new ArrayList();
        Paciente l=new Paciente("enzo","VONKU",22,503792,"Osep");
        Paciente ñ=new Paciente("Gabriel","Gregorio",29,20382038,"Sancor");
        ListaPacientes.add(l);
        ListaPacientes.add(ñ);
        ArrayList<Doctor>ListaDoctores=new ArrayList();
        Doctor d1= new Doctor("Andres","Peña","cardologo",23321);
        Doctor d2= new Doctor("Daniel","Ramos","Neurologo",23432);
        ListaDoctores.add(d1);
        ListaDoctores.add(d2);
  int opcion=0;
  do{
      opcion=vista.menu();
      if(opcion==1){
          Paciente P1=vista.agregarPaciente();
          ListaPacientes.add(P1);
      } else if (opcion==2) {
          Doctor D1= vista.agregarDoctor();
          ListaDoctores.add(D1);
      } else if (opcion==3) {
          vista.listadepacientes(ListaPacientes);
      } else if (opcion==4) {
          vista.listadedoctores(ListaDoctores);
      }

  }while (opcion!=0);

    }

}
