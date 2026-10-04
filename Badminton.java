package com.mycompany.sistemsewalapangan;

public class Badminton extends Lapangan {

    private String jenisLapangan;

    public Badminton(String namaPenyewa, String tanggal, int durasi, String jenisLapangan) {
        super(namaPenyewa, tanggal, durasi);
        this.jenisLapangan = jenisLapangan;
    }

    public String getJenisLapangan() {
        return jenisLapangan;
    }

    public void setJenisLapangan(String jenisLapangan) {
        this.jenisLapangan = jenisLapangan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis   : Badminton");
        System.out.println("Tipe    : " + jenisLapangan);
        System.out.println("Harga   : Rp" + hitungHarga());
    }

    public int hitungHarga() {
        return getDurasi() * 50000;
    }
}
