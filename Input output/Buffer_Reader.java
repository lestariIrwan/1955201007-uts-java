
paket  InputOutput ;

import  java.io.BufferedReader ;
impor  java.io.IOException ;
import  java.io.InputStreamReader ;
/ **
 *
* @author HP
 * /
 Buffer_Reader kelas  publik {

    public  static  void  main ( String [] args ) melempar  IOException {

        BufferedReader br =  baru  BufferedReader ( baru  InputStreamReader ( Sistem . Di));

        String nama, nim, prodi, fakultas;


        Sistem . out . println ( " Masukkan Nama Anda " );
        nama = br . readLine ();
        Sistem . out . println ( " Masukkan NIM " );
        nim = br . readLine ();
        Sistem . out . println ( " Masukkan Prodi Anda " );
        prodi = br . readLine ();
        Sistem . out . println ( " Masukkan Fakultas Anda " );
        fakultas = br . readLine ();
        Sistem . out . println ( " ================================== " );
        Sistem . out . println ( " Nama: " + nama);
        Sistem . out . println ( " NIM: " + nim);
        Sistem . out . println ( " Prodi: " + prodi);
        Sistem . out . println ( " Fakultas: " + fakultas);

    }
} 
