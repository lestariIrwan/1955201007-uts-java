
package InputOutput;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ScanNer {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String name, nim, prodi, fak;
        
        System.out.println("Nama        : " );
        name = input.nextLine();
        System.out.println("NIM         : " );
        nim = input.nextLine();
        System.out.println("Prodi       : " );
        prodi = input.nextLine();
        System.out.println("Fakultas    : " );
        fak = input.nextLine();
    }
    
}
