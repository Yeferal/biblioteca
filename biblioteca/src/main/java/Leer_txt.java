

import java.io.*;
/**
 *
 * @author yefer
 */
public class Leer_txt {
    
    String ruta= "practica1.txt";
    public Leer_txt(){
        leer();
        
    }
    public void leer(){
        
        try {
            FileReader tx = new FileReader(ruta);
            BufferedReader br = new BufferedReader(tx);
            
            for (int i = 0; i < 60; i++) {
                
                //System.out.println(br.readLine());
                //tipo(br.readLine());
                        switch (br.readLine()) {
            case "LIBRO":
                libro();
                datoslibro(br.readLine(),br.readLine(),br.readLine(),br.readLine());
                             
                break;
            case "ESTUDIANTE":
                estudiante();
                datosEstudiante(br.readLine(),br.readLine(),br.readLine());
                
                break;
            case "PRESTAMO":
                prestamo();
                datosPrestamo(br.readLine(),br.readLine(),br.readLine());
                break;
        //System.out.println("no es nada");
            default:
                break;
        }
                
            }
            
            
            br.close();
            
        } catch (Exception e) {
            
        }
        
    }
    public void tipo(String palabra){
        switch (palabra) {
            case "LIBRO":
                libro();
                break;
            case "ESTUDIANTE":
                estudiante();
                break;
            case "PRESTAMO":
                prestamo();
                break;
        //System.out.println("no es nada");
            default:
                break;
        }
    }
    
    public void libro(){
        System.out.println("es Libro");
    }
    public void estudiante(){
        System.out.println("es estudiante");
    }
    public void prestamo(){
        System.out.println("es prestamo");
    }
    
    public void datoslibro(String title, String autor, String codigo, String candidad){
        System.out.println("titulo: "+title.substring(6));
        System.out.println("autor: "+autor.substring(5));
        System.out.println("codigo: "+codigo.substring(6));
        System.out.println("cantidad: "+candidad.substring(8));
    }
    public void datosEstudiante(String carnet, String nombre, String carrera){
        System.out.println("carne: "+carnet.substring(6));
        System.out.println("nombre: "+nombre.substring(6));
        System.out.println("carrera: "+carrera.substring(7));
    }
    public void datosPrestamo(String codigo, String carnet, String fecha){
        System.out.println("codigolibro: "+codigo.substring(11));
        System.out.println("carnet "+carnet.substring(6));
        System.out.println("Fecha: "+fecha.substring(5));
    }
    
}
