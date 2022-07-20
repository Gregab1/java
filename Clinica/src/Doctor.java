public class Doctor {
    private String nombre;
    private String apellido;


    private String profesion;
    private int matricula;

    public Doctor() {
    }

    public Doctor(String nombre, String apellido, String profesion, int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;


        this.profesion = profesion;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", profesion='" + profesion + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
