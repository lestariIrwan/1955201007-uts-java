
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


        Sistem . keluar . println ( " Masukkan Nama Anda " );
        nama = br . readLine ();
        Sistem . keluar . println ( " Masukkan NIM " );
        nim = br . readLine ();
        Sistem . keluar . println ( " Masukkan Prodi Anda " );
        prodi = br . readLine ();
        Sistem . keluar . println ( " Masukkan Fakultas Anda " );
        fakultas = br . readLine ();
        Sistem . keluar . println ( " ================================== " );
        Sistem . keluar . println ( " Nama: " + nama);
        Sistem . keluar . println ( " NIM: " + nim);
        Sistem . keluar . println ( " Prodi: " + prodi);
        Sistem . keluar . println ( " Fakultas: " + fakultas);

    }
} 
