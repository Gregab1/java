import java.util.ArrayList;

public class ListaTurno {
  private  ArrayList<Turno>ListaDeTurnos= new ArrayList<>();

  public ListaTurno(){

  }

    public ArrayList<Turno> getListaDeTurnos() {
        return ListaDeTurnos;
    }

    public void setListaDeTurnos(ArrayList<Turno> listaDeTurnos) {
        ListaDeTurnos = listaDeTurnos;
    }
}
