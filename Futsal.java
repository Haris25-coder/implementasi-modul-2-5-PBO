package com.mycompany.sistemsewalapangan;

public class Futsal extends Lapangan {

    private String ukuranLapangan;

    public Futsal(String namaPenyewa, String tanggal, int durasi, String ukuranLapangan) {
        super(namaPenyewa, tanggal, durasi);
        this.ukuranLapangan = ukuranLapangan;
    }

    public String getUkuranLapangan() {
        return ukuranLapangan;
    }

    public void setUkuranLapangan(String ukuranLapangan) {
        this.ukuranLapangan = ukuranLapangan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis   : Futsal");
        System.out.println("Ukuran  : " + ukuranLapangan);
        System.out.println("Harga   : Rp" + hitungHarga());
    }

    public int hitungHarga() {
        return getDurasi() * 100000;
    }
}
