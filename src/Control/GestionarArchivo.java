
package Control;
import java.io.*;
import javax.swing.JOptionPane;

public class GestionarArchivo {
    
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public GestionarArchivo(){
        
    }
    
    public String AbrirTexto(File archivo){
        
        String contenido="";
        try {
            entrada = new FileInputStream(archivo);
            int leer;
            while((leer = entrada.read())!=-1 ){
                char caracter =(char) leer;
                contenido += caracter;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error al cargar archivo ", " Error ", JOptionPane.ERROR_MESSAGE);
        }
        
        return contenido;   
    }
    
    public String GuardarTexto(File archivo, String contenido){
        
        String respuesta = null;
        try {
           salida = new FileOutputStream(archivo);
           byte[] bytestxt = contenido.getBytes();
           salida.write(bytestxt);
           respuesta = "El archivo ha sido guardado con éxito";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error al guardar archivo ", " Error ", JOptionPane.ERROR_MESSAGE);
        }
        
        return respuesta;
        
    }
   

    
    
    
}
