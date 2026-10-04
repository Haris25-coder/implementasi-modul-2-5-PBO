package com.mycompany.sistemsewalapangan;

public class Lapangan {

    private String namaPenyewa;
    private String tanggal;
    private int durasi;

    private static int jumlahSewa = 0;

    public Lapangan(String namaPenyewa, String tanggal, int durasi) {
        this.namaPenyewa = namaPenyewa;
        this.tanggal = tanggal;
        this.durasi = durasi;

        jumlahSewa++;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        if (!namaPenyewa.isEmpty()) {
            this.namaPenyewa = namaPenyewa;
        }
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        if (durasi > 0) {
            this.durasi = durasi;
        }
    }

    public int hitungHarga(int hargaPerJam) {
        return durasi * hargaPerJam;
    }

    public int hitungHarga(int hargaPerJam, int diskon) {
        int total = durasi * hargaPerJam;
        return total - diskon;
    }

    public void tampilkanInfo() {
        System.out.println("Penyewa : " + namaPenyewa);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Durasi  : " + durasi + " jam");
    }

    public static int getJumlahSewa() {
        return jumlahSewa;
    }
}
