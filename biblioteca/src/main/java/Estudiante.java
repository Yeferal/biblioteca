
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
    Libro[] libros = new Libro[3];
    
    public Estudiante(int carnet, String nombre, int carrera){
        this.carnet = carnet;
        this.nombre = nombre;
        this.carrera = carrera;
        for(int i=0; i<3; i++){
            libros[i] = null;
        }
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

    public Libro[] getLibros() {
        return libros;
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

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }
     
    public String toString(){
        String mensaje = "Nombre: "+nombre+" Carnet: "+carnet+"\nCarrera: "+carrera;
        return mensaje;
    } 
}
