 
package InputOutput;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class JO_pane {
    public static void main(String[] args) {
        // I/O versi JOption
        
        String inputNilai = JOptionPane.showInputDialog("input nilai");
        int nilai = Integer.parseInt(inputNilai);
        if (nilai >= 91 && nilai <= 100){
            System.out.println("A");
        }else if (nilai >= 86 && nilai < 91){
            System.out.println("A-");
        }else if (nilai >= 81 && nilai < 86){
            System.out.println("B+");
        }else if (nilai >= 76 && nilai < 81){
            System.out.println("B");
        }else if (nilai >= 66 && nilai < 78){
            System.out.println("B-");
        }else if (nilai >= 56 && nilai < 66){
            System.out.println("C");
        }else if (nilai >= 45 && nilai < 56){
            System.out.println("D");
        }else if (nilai >= 0 && nilai < 45){
            System.out.println("E");
        }else{
            System.out.println("Nilai Salah");
        }
        
    }
    
}
