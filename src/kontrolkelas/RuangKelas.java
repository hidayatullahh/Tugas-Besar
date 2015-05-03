/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrolkelas;

/**
 *
 * @author Acer
 */
public class RuangKelas {
    //Identitas Ruang Kelas
    private String namaRuang;
    private String lokasi;
    private String fakultas;
    
    //Kondisi Ruang Kelas
    double HitungLuasRuang;
    double HitungBentukRuang;
    double HitungRasioLuas;
    private int panjang;
    private int lebar;
    private int jmlKursi;
    private int jmlPintu;
    private int jmlJendela;
    
    //Jumlah, Kondisi dan Posisi Sarana
    private int jmlStopKontak;
    private int kondStopKontak;
    private int posStopKontak;
    private int jmlproyektor;
    private int kondproyektor;
    private int posproyektor;
    private int jmlLampu;
    private int kondLampu;
    private int posLampu;
    private int jmlKipas;
    private int kondKipas;
    private int posKipas;
    private int jmlCCTV;
    private int kondCCTV;
    private int posCCTV;
    
    //Lingkungan Ruang Kelas
    private String kondLantai;
    private String kondDinding;
    private String kondAtap;
    private String kondPintu;
    private String kondJendela;
    private String Kerusakan;
    private String Kebersihan;
    

    public String getNamaRuang() {
        return namaRuang;
    }

    public void setNamaRuang(String namaRuang) {
        this.namaRuang = namaRuang;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getJmlKursi() {
        return jmlKursi;
    }

    public void setJmlKursi(int jmlKursi) {
        this.jmlKursi = jmlKursi;
    }

    public int getJmlPintu() {
        return jmlPintu;
    }

    public void setJmlPintu(int jmlPintu) {
        this.jmlPintu = jmlPintu;
    }

    public int getJmlJendela() {
        return jmlJendela;
    }

    public void setJmlJendela(int jmlJendela) {
        this.jmlJendela = jmlJendela;
    }

    public int getJmlStopKontak() {
        return jmlStopKontak;
    }

    public void setJmlStopKontak(int jmlStopKontak) {
        this.jmlStopKontak = jmlStopKontak;
    }

    public int getKondStopKontak() {
        return kondStopKontak;
    }

    public void setKondStopKontak(int kondStopKontak) {
        this.kondStopKontak = kondStopKontak;
    }

    public int getPosStopKontak() {
        return posStopKontak;
    }

    public void setPosStopKontak(int posStopKontak) {
        this.posStopKontak = posStopKontak;
    }

    public int getJmlproyektor() {
        return jmlproyektor;
    }

    public void setJmlproyektor(int jmlproyektor) {
        this.jmlproyektor = jmlproyektor;
    }

    public int getKondproyektor() {
        return kondproyektor;
    }

    public void setKondproyektor(int kondproyektor) {
        this.kondproyektor = kondproyektor;
    }

    public int getPosproyektor() {
        return posproyektor;
    }

    public void setPosproyektor(int posproyektor) {
        this.posproyektor = posproyektor;
    }

    public int getJmlLampu() {
        return jmlLampu;
    }

    public void setJmlLampu(int jmlLampu) {
        this.jmlLampu = jmlLampu;
    }

    public int getKondLampu() {
        return kondLampu;
    }

    public void setKondLampu(int kondLampu) {
        this.kondLampu = kondLampu;
    }

    public int getPosLampu() {
        return posLampu;
    }

    public void setPosLampu(int posLampu) {
        this.posLampu = posLampu;
    }

    public int getJmlKipas() {
        return jmlKipas;
    }

    public void setJmlKipas(int jmlKipas) {
        this.jmlKipas = jmlKipas;
    }

    public int getKondKipas() {
        return kondKipas;
    }

    public void setKondKipas(int kondKipas) {
        this.kondKipas = kondKipas;
    }

    public int getPosKipas() {
        return posKipas;
    }

    public void setPosKipas(int posKipas) {
        this.posKipas = posKipas;
    }

    public int getJmlCCTV() {
        return jmlCCTV;
    }

    public void setJmlCCTV(int jmlCCTV) {
        this.jmlCCTV = jmlCCTV;
    }

    public int getKondCCTV() {
        return kondCCTV;
    }

    public void setKondCCTV(int kondCCTV) {
        this.kondCCTV = kondCCTV;
    }

    public int getPosCCTV() {
        return posCCTV;
    }

    public void setPosCCTV(int posCCTV) {
        this.posCCTV = posCCTV;
    }

    public String getKondLantai() {
        return kondLantai;
    }

    public void setKondLantai(String kondLantai) {
        this.kondLantai = kondLantai;
    }

    public String getKondDinding() {
        return kondDinding;
    }

    public void setKondDinding(String kondDinding) {
        this.kondDinding = kondDinding;
    }

    public String getKondPintu() {
        return kondPintu;
    }

    public void setKondPintu(String kondPintu) {
        this.kondPintu = kondPintu;
    }

    public String getKondJendela() {
        return kondJendela;
    }

    public void setKondJendela(String kondJendela) {
        this.kondJendela = kondJendela;
    }
    public String getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    double Luas() {
        HitungLuasRuang = panjang * lebar;
        return HitungLuasRuang;
    }

    double Rasio() {
        HitungRasioLuas = HitungLuasRuang / jmlKursi;
        return HitungRasioLuas;
    }

}
