package semana3_4;

public class Ciudadano extends Persona  {
    private String provincia;
    private long DNI;

    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

}
