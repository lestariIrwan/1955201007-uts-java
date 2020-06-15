
paket  InputOutput ;

import  java.io.BufferedReader ;
impor  java.io.IOException ;
import  java.io.InputStreamReader ;
/ **
 *
* @author HP
 * /
 Buffer_Reader kelas  publik {

    public class Buffer_Reader{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nama, nim, prodi, fakultas;
        
        
        System.out.println("Masukkan Nama Anda");
        nama = br.readLine();
        System.out.println("Masukkan NIM ");
        nim = br.readLine();
        System.out.println("Masukkan Prodi Anda");
        prodi = br.readLine();
        System.out.println("Masukkan Fakultas Anda");
        fakultas = br.readLine();
        System.out.println("====================================");
        System.out.println("Nama        : "+nama);
        System.out.println("NIM         : "+nim);
        System.out.println("Prodi       : "+prodi);
        System.out.println("Fakultas    : "+fakultas);
        
    }
}
