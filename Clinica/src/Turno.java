import java.util.Date;

public class Turno {
  private Date fecha;
  private String pacientes;
  private String doctores;

 public Turno(){

 }

    public Date getFecha() {
        return fecha;
    }

    public Turno(Date fecha, String pacientes, String doctores) {
        this.fecha = fecha;
        this.pacientes = pacientes;
        this.doctores = doctores;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPacientes() {
        return pacientes;
    }

    public void setPacientes(String pacientes) {
        this.pacientes = pacientes;
    }

    public String getDoctores() {
        return doctores;
    }

    public void setDoctores(String doctores) {
        this.doctores = doctores;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "fecha=" + fecha +
                ", pacientes='" + pacientes + '\'' +
                ", doctores='" + doctores + '\'' +
                '}';
    }
    public String ToString (String separador){
return fecha+pacientes+doctores;
    }
}
