package kontrolkelas;
import java.util.Scanner;
public class KontrolKelas {

    RuangKelas Laptop = new RuangKelas();
    Scanner in = new Scanner(System.in);

    //Kondisi Ruang Kelas
    void hitungLuasRuang() {
        System.out.println("\n - Kondisi Ruang Kelas - \n");
        System.out.println("Panjang Ruang : ");
        Laptop.setPanjang(in.nextInt());
        System.out.println("Lebar Ruang : ");
        Laptop.setLebar(in.nextInt());
        System.out.println("Luas Ruang Kelas    : " +Laptop.Luas());
    }

    String hitungBentukRuang() {
        if (Laptop.getPanjang() != Laptop.getLebar()) {
            System.out.println("Sesuai");
            return "Sesuai";
        } else {
            System.out.println("Tidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String hitungRasioLuas() {
        System.out.println("\nJumlah Kursi : ");
        Laptop.setJmlKursi(in.nextInt());
        System.out.println("Rasio Luas = " + Laptop.Rasio());

        if (Laptop.Rasio() >= 0.5) {
            System.out.println("Sesuai");
            return "Sesuai";
        } else {
            System.out.println("Sesuai");
            return "Sesuia";
        }

    }

    String analisisPintuDanJendela() {
        System.out.println("\nJumlah Pintu        1. 1    2. 2    3. 4");
        System.out.println("Jumlah Jendela      1. 0    2. 1    3. 4");
        System.out.println("\nJumlah Pintu : ");
        Laptop.setJmlPintu(in.nextInt());
        System.out.println("Jumlah Jendela : ");
        Laptop.setJmlJendela(in.nextInt());
        if (Laptop.getJmlPintu() ==  2 && Laptop.getJmlJendela() == 2 || Laptop.getJmlJendela() == 3) {
            System.out.println("Sesuai");
            return "Sesuai";
        } else {
            System.out.println("Tidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    //Jumlah, Kondisi dan Posisi Sarana
    String analisisKelistrikan() {
        System.out.println("\n - Jumlah, Kondisi dan Posisi Sarana -");
        System.out.println("\nJumlah Stop Kontak      1. 2                        :  2. 4             :  3. 8");
        System.out.println("Kondisi Stop Kontak     1. Baik                     :  2. Kurang Baik   :  3. Rusak");
        System.out.println("Posisi Stop Kontak      1. Di Pojok dan Dekat Dosen :  2. Di Tengah     :  3. Di Bawah");
        System.out.println("\nJumlah Stop Kontak : ");
        Laptop.setJmlStopKontak(in.nextInt());
        System.out.println("Kondisi Stop Kontak : ");
        Laptop.setKondStopKontak(in.nextInt());
        System.out.println("Posisi Stop Kontak : ");
        Laptop.setPosStopKontak(in.nextInt());
        if (Laptop.getJmlStopKontak() == 2 || Laptop.getJmlStopKontak() == 3 && Laptop.getKondStopKontak() == 1 && Laptop.getPosStopKontak() == 1) {
            System.out.println("Sesuai");
            return "Sesuai";
        } else {
            System.out.println("Tidak Sesuai");
            return "Tidak Sesuai";
        }

    }

    String analisisproyektor() {
        System.out.println("\nJumlah proyektor        1. 0           :   2. 1");
        System.out.println("Kondisi proyektor       1. Berfungsi   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi proyektor        1. Dekat Dosen :   2. Dekat Pintu   :   3. Dekat Lampu");
        System.out.println("\nJumlah proyektor : ");
        Laptop.setJmlproyektor(in.nextInt());
        System.out.println("Kondisi proyektor : ");
        Laptop.setKondproyektor(in.nextInt());
        System.out.println("Posisi proyektor : ");
        Laptop.setPosproyektor(in.nextInt());
        if (Laptop.getJmlproyektor() == 2 && Laptop.getKondproyektor() == 1 && Laptop.getPosproyektor() == 1) {
            System.out.println("Sesuai");
            return "Sesuai";
        } else {
            System.out.println("Tidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String analisisLampu() {
        System.out.println("\nJumlah Lampu    1. 4      :   2. 10            :   3. 18");
        System.out.println("Kondisi Lampu   1. Baik   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi Lampu    1. Atap   :   2. Bawah         :   3. Samping");
        System.out.println("\nJumlah Lampu : ");
        Laptop.setJmlLampu(in.nextInt());
        System.out.println("Kondisi Lampu : ");
        Laptop.setKondLampu(in.nextInt());
        System.out.println("Posisi Lampu : ");
        Laptop.setPosLampu(in.nextInt());
        if (Laptop.getJmlLampu() == 2 || Laptop.getJmlLampu() == 3 && Laptop.getKondLampu() == 1 && Laptop.getPosLampu() == 1) {
            System.out.println("Sesuai");
            return "Sesuai";
        } else {
            System.out.println("Tidak Sesuai");
            return "Tidak Sesuai";
        }
    }

    String analisisKipasAngin() {
        System.out.println("\nJumlah Kipas Angin      1. 1      :   2. 2             :   3. 4");
        System.out.println("Kondisi Kipas Angin     1. Baik   :   2. Kurang Baik   :   3. Rusak");
        System.out.println("Posisi Kipas Angin      1. Atap   :   2. Bawah         :   3. Samping");
        System.out.println("\nJumlah Kipas Angin : ");
        Laptop.setJmlKipas(in.nextInt());
        System.out.println("Kondisi Kipas Angin : ");
        Laptop.setKondKipas(in.nextInt());
        System.out.println("Posisi Kipas Angin : ");
        Laptop.setPosKipas(in.nextInt());
        if (Laptop.getJmlKipas() == 2 || Laptop.getJmlKipas() == 3 && Laptop.getKondKipas() == 1 && Laptop.getPosKipas() == 1) {
            System.out.println("Sesuai");
            return "Sesuai";
        } else {
            System.out.println("Tidak Sesuai");
            return "Tidak Sesuai";
        }
    }
        String analisisCCTV() {
        System.out.println("\nJumlah CCTV     1. 0       :   2. 1   :   3. 2");
        System.out.println("Kondisi CCTV    1. Baik    :   2. Kurang Baik    :    3. Rusak");
        System.out.println("Posisi CCTV     1. Depan   :   2. Samping        :    3. Belakang");
        System.out.println("\nJumlah CCTV : ");
        Laptop.setJmlCCTV(in.nextInt());
        System.out.println("Kondisi CCTV : ");
        Laptop.setKondCCTV(in.nextInt());
        System.out.println("Posisi CCTV : ");
        Laptop.setPosCCTV(in.nextInt());
        if (Laptop.getJmlCCTV() == 3 && Laptop.getKondCCTV() == 1 && Laptop.getPosCCTV() == 1 || Laptop.getPosCCTV() == 3){
            System.out.println("Sesuai");
            return "Sesuai";    
        }else {
            System.out.println("Tidak Sesuai");
            return "Tidak Sesuai";
        }
    }
        //Lingkungan Ruang Kelas
    String analisisKebersihan() {
        System.out.println("\n - Lingkungan Ruang Kelas -");
        System.out.println("\nKondisi Lantai : ");
        Laptop.setKondLantai(in.next());
        System.out.println("Kondisi Dinding : ");
        Laptop.setKondDinding(in.next());
        System.out.println("Kondisi Pintu : ");
        Laptop.setKondPintu(in.next());
        System.out.println("Kondisi Jendela : ");
        Laptop.setKondJendela(in.next());
        if (Laptop.getKondLantai().equals("bersih") && Laptop.getKondDinding().equals("bersih")
                && Laptop.getKondPintu().equals("bersih") && Laptop.getKondJendela().equals("bersih")){
            System.out.println("Sesuai");
            return "Sesuai";
        }else {
            System.out.println("Tidak Sesuai");
            return "Tidak Sesuai";
        }
    }
        String analisisKerusakan() {
        System.out.println("\nKerusakan : ");
        Laptop.setKerusakan(in.next());
        if (Laptop.getKerusakan().equals("tidak rusak") ){
            System.out.println("Sesuai");
            return "Sesuai";
        }else {
            System.out.println("Tidak Sesuai");
            return "Tidak Sesuai";
        }
    
}
}
