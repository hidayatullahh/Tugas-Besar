
package kontrolkelas;
import java.util.Scanner;
public class TesRuangKelas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        KontrolKelas Laptop = new KontrolKelas();

        //Identitas Ruang Kelas
        String nama, lokasi;
        System.out.println(" - Identias Ruang Kelas -\n");
        System.out.println("Nama Ruang : ");
        nama = in.nextLine();
        System.out.println("Lokasi Ruang : ");
        lokasi = in.nextLine();
        System.out.println("Nama Fakultas : ");
        lokasi = in.nextLine();

        //Kondisi Ruang Kelas
        Laptop.hitungLuasRuang();
        Laptop.hitungBentukRuang();
        Laptop.hitungRasioLuas();
        Laptop.analisisPintuDanJendela();

        //Jumlah, Kondisi dan Posisi Sarana
        Laptop.analisisproyektor();
        Laptop.analisisLampu();
        Laptop.analisisKipasAngin();
        Laptop.analisisCCTV();

       //Lingkungan Ruang Kelas
        Laptop.analisisKebersihan();
        
        //Kenyamanan Ruang Kelas
         Laptop.analisisKerusakan();
       
    }
}