package casting;

import java.util.Objects;

public class Grado extends Escuela{
    String Nom;
    int CatidadAlumnos;


    public Grado(String nombre, String nivel, String nom, int catidadAlumnos) {
        super(nombre, nivel);
        Nom = nom;
        CatidadAlumnos = catidadAlumnos;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        this.Nom = nom;
    }

    public int getCatidadAlumnos() {
        return CatidadAlumnos;
    }

    public void setCatidadAlumnos(int catidadAlumnos) {
        this.CatidadAlumnos = catidadAlumnos;
    }
    public void setNombre(String nombre) {

        super.setNombre(nombre);
    }



    public void setNivel(String nivel) {
        super.setNivel(nivel);
    }

    @Override
    public String toString() {
        return "Grado{" +
                "Nombre del curso='" + Nom + '\'' +
                ", CatidadAlumnos=" + CatidadAlumnos +
                ", Nombre escuela='" + Nombre + '\'' +
                ", Nivel='" + Nivel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grado)) return false;
        if (!super.equals(o)) return false;
        Grado grado = (Grado) o;
        return CatidadAlumnos == grado.CatidadAlumnos && Objects.equals(Nom, grado.Nom);
    }


}
