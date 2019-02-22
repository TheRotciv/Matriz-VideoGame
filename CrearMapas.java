/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;
import java.io.*;
/**
 *
 * @author victo
 */
public class CrearMapas {
    
    private File archivo;
    private FileReader fr;
    private BufferedReader br;
    private String texto;

    public CrearMapas(File archivo) {
        this.archivo = archivo;
        FileReader fr = null;
        BufferedReader br = null;
        texto="";
        
    }
    
    
    

   public void genString() throws IOException {
      

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         
         fr = new FileReader(archivo);
         br = new BufferedReader(fr);
         String aux;
         // Lectura del fichero
        
         while((aux=br.readLine())!=null){
            texto=aux+texto;
      }
      }catch(Exception e){
              System.out.println("Lectura terminada por error");
              }
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   

    @Override
    public String toString() {
        return texto;
    }
   
   
   
}




