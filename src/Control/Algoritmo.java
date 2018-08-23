
package Control;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;



public class Algoritmo {
    
    ArrayList<Integer> ar1 = new ArrayList();
    ArrayList<Integer> ar2 = new ArrayList();
    int [][]mp; // Matriz Principal
    int [][]mt; // Matriz Score 
    
   
   
    public int[][] crearMatrizPrincipal() {
        int[][] mp = {{0, 1, 2, 3, 4}, {1, 10, -1, -3, -4}, {2, -1, 7, -5, -3}, {3, -3, -5, 9, 0}, {4, -4, -3, 0, 8}};
        return mp;
    }
    
    public ArrayList cambiarSecuencia(String sec) {
        ArrayList<Integer> ar = new ArrayList();
        for (int i = 0; i < sec.length(); i++) {
            switch (sec.charAt(i)) {
                case 'A':
                    ar.add(1);
                    break;
                case 'G':
                    ar.add(2);
                    break;
                case 'C':
                    ar.add(3);
                    break;
                case 'T':
                    ar.add(4);
                    break;
                default:
                    break;
            }
        }
        return ar;
    }
    
        public  ArrayList convertirLetra(String letra){
        ArrayList<String> conv= new ArrayList();
        for (int i = letra.length()-1; i > 0; i--) {
            
            switch(letra.charAt(i)){
                 case '0':
                    conv.add(" - ");
                    break;
                case '1':
                    conv.add(" A ");
                    break;
                case '2':
                    conv.add(" G ");
                    break;
                case '3':
                    conv.add(" C ");
                    break;
                case '4':
                    conv.add(" T ");
                    break;
                default:
                    break;
            }
            
        }
        return conv;
    }
     
        
    public void mostrarMatrizValores(int mp[][], JTable tablaValores) {

        DefaultTableModel modelo = (DefaultTableModel) tablaValores.getModel();
        modelo.setRowCount(5);
        modelo.setColumnCount(5);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                tablaValores.setValueAt(mp[i][j], i, j);

            }

        }

    }
    
    
}
