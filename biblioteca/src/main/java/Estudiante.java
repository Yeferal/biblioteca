
/**
 *
 * @author César Reginaldo Tzoc Alvarado
 *         Carnet: 201430927
 */
public class Estudiante {
    
    String nombre;
    int carnet;
    int carrera;
    String fechaNacimiento;
    
    public Estudiante(int carnet, String nombre, int carrera){
        this.carnet = carnet;
        this.nombre = nombre;
        this.carrera = carrera;
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
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
     
    public String toString(){
        String mensaje = "Nombre: "+nombre+" Carnet: "+carnet+"\nCarrera: "+carrera;
        return mensaje;
    } 
}
