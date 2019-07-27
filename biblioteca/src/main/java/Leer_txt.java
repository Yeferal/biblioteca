

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
            for (int i = 1; i < 20; i++) {
                
                //System.out.println(br.readLine());
                tipo(br.readLine());
            }
            
            
            
            
        } catch (Exception e) {
        }
        
    }
    public void tipo(String palabra){
        if(palabra.equalsIgnoreCase("LIBRO")){
            libro();
        }else if(palabra.equalsIgnoreCase("ESTUDIANTE")){
            estudiante();
        }else if(palabra.equalsIgnoreCase("PRESTAMO")){
            
        }else{
            //System.out.println("no es nada");
        }
    }
    
    public void libro(){
        System.out.println("es Libro");
    }
    public void estudiante(){
        System.out.println("es Libro");
    }
    public void prestamo(){
        System.out.println("es Libro");
    }
    
    
    
}
