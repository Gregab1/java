package casting;

import java.util.Objects;

public class Escuela {
    String Nombre;
    String Nivel;
 public  Escuela(){

 }


    public Escuela(String nombre, String nivel) {
        Nombre = nombre;
        Nivel = nivel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String nivel) {
        this.Nivel = nivel;
    }

    @Override
    public String toString() {
        return "Escuela{" +
                "Nombre='" + Nombre + '\'' +
                ", Nivel='" + Nivel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Escuela)) return false;
        Escuela escuela = (Escuela) o;
        return Objects.equals(Nombre, escuela.Nombre) && Objects.equals(Nivel, escuela.Nivel);
    }


}
