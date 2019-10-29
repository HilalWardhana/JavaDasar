package Tugas;
public class Constructor {
    long nim;
    String jurusan, nama, alamat;
    int angkatan;
    public Constructor (){
        nim=201869040010L;
        nama="Hilal Achmad Wardhana";
        alamat="Malang";
        jurusan="T.Informatika";
        angkatan=2018;
    }
    public static void main (String[] args){
    Constructor data=new Constructor();
    System.out.print ("NIM ;" +data.nim+"Nama :"+data.nama+"Alamat :"+data.alamat+"Jurusan "+data.jurusan+"angkatan :"+data.angkatan+"");
    
    
    }
}
