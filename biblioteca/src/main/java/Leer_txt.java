

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
                tipo(br.readLine());
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
    
    
    
}
