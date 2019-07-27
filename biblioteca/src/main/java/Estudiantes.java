
/**
 *
 * @author César Reginaldo Tzoc Alvarado
 *         Carnet: 201430927
 */
public class Estudiantes {
    
    String nombre;
    int carnet;
    int carrera;
    String fechaNacimiento;
    
    public Estudiantes(String nombre, int carnet, int carrera, String fechaNacimiento){
    this.nombre = nombre;
    this.carnet = carnet;
    this.carrera = carrera;
    this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCarnet() {
        return carnet;
    }

    public int getCarrera() {
        return carrera;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String toString(){
        String mensaje = "Nombre: "+nombre+"Carnet: "+carnet+"\nCarrera: "+carrera+
                "Fecha de Naciemiento"+fechaNacimiento;
        return mensaje;
    } 
}
