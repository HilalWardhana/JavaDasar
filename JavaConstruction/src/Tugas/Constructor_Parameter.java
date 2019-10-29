
package Tugas;
public class Constructor_Parameter {
    long Nim ;
    String jurusan, nama , alamat ;
    int angkatan; 
    public Constructor_Parameter (long NIM, String Nama, String Alamat, String Jurusan, int Angkatan ){
        Nim=NIM;
        nama=Nama;
        alamat=Alamat;
        jurusan=Jurusan;
        angkatan=Angkatan;  
    }
    public static void main (String [] args) {
     Constructor_Parameter data=new Constructor_Parameter (201869040010L,"HILAL ACHMAD WARDHANA","Malang","T.Informatika",2018);
    System.out.print(
    "nim : "+data.Nim+
    "Nama :"+data.nama+
    "Alamat :"+data.alamat+ 
    "Jurusan :"+data.jurusan+
    "Angkatan :"+data.angkatan+"");
    }
}
