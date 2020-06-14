/ *
 * Untuk mengubah header lisensi ini, pilih Header Lisensi di Project Properties.
* Untuk mengubah file templat ini, pilih Alat | Templat
 * dan buka templat di editor.
 * /
paket  InputOutput ;

import  javax.swing.JOptionPane ;

/ **
 *
* @author HP
 * /
 kelas  publik JO_pane {
    public  static  kekosongan  main ( String [] args ) {
        // I / O versi JOption

        String inputNilai =  JOptionPane . showInputDialog ( " input nilai " );
        int nilai =  Integer . parseInt (inputNilai);
        if (nilai > =  91  && nilai <=  100 ) {
            Sistem . keluar . println ( " A " );
        } lain  jika (nilai > =  86  && nilai <  91 ) {
            Sistem . keluar . println ( " A- " );
        } lain  jika (nilai > =  81  && nilai <  86 ) {
            Sistem . keluar . println ( " B + " );
        } lain  jika (nilai > =  76  && nilai <  81 ) {
            Sistem . keluar . println ( " B " );
        } lain  jika (nilai > =  66  && nilai <  78 ) {
            Sistem . keluar . println ( " B- " );
        } lain  jika (nilai > =  56  && nilai <  66 ) {
            Sistem . keluar . println ( " C " );
        } lain  jika (nilai > =  45  && nilai <  56 ) {
            Sistem . keluar . println ( " D " );
        } lain  jika (nilai > =  0  && nilai <  45 ) {
            Sistem . keluar . println ( " E " );
        } lain {
            Sistem . keluar . println ( " Nilai Salah " );
        }

    }

}
