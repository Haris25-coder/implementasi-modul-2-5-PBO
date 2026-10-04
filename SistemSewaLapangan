
package com.mycompany.sistemsewalapangan;

import java.util.Scanner;

public class SIstemSewaLapangan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Lapangan[] daftarSewa = new Lapangan[10];

        int jumlahData = 0;
        int pilihan;

        do {

            System.out.println();
            System.out.println("========================================");
            System.out.println("       SISTEM SEWA LAPANGAN");
            System.out.println("========================================");
            System.out.println("1. Tambah Penyewaan");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Cari Penyewaan");
            System.out.println("4. Keluar");
            System.out.println("========================================");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    if (jumlahData >= daftarSewa.length) {
                        System.out.println("Data sudah penuh!");
                        break;
                    }

                    System.out.println();
                    System.out.println("===== TAMBAH PENYEWAAN =====");

                    System.out.print("Nama penyewa : ");
                    String nama = input.nextLine();

                    System.out.print("Tanggal sewa : ");
                    String tanggal = input.nextLine();

                    System.out.print("Durasi sewa (jam) : ");
                    int durasi = input.nextInt();
                    input.nextLine();

                    if (durasi <= 0) {
                        System.out.println("Durasi harus lebih dari 0!");
                        break;
                    }

                    System.out.println();
                    System.out.println("Jenis Lapangan:");
                    System.out.println("1. Futsal");
                    System.out.println("2. Badminton");
                    System.out.print("Pilih jenis : ");

                    int jenis = input.nextInt();
                    input.nextLine();

                    if (jenis == 1) {

                        System.out.print("Ukuran lapangan : ");
                        String ukuran = input.nextLine();

                        daftarSewa[jumlahData] =
                                new Futsal(
                                        nama,
                                        tanggal,
                                        durasi,
                                        ukuran
                                );

                        jumlahData++;

                        System.out.println("Data futsal berhasil ditambahkan.");

                    } else if (jenis == 2) {

                        System.out.print("Tipe lapangan : ");
                        String tipe = input.nextLine();

                        daftarSewa[jumlahData] =
                                new Badminton(
                                        nama,
                                        tanggal,
                                        durasi,
                                        tipe
                                );

                        jumlahData++;

                        System.out.println("Data badminton berhasil ditambahkan.");

                    } else {

                        System.out.println("Jenis lapangan tidak tersedia.");
                    }

                    break;

                case 2:

                    System.out.println();
                    System.out.println("===== DATA PENYEWAAN =====");

                    if (jumlahData == 0) {

                        System.out.println("Belum ada data penyewaan.");

                    } else {

                        for (int i = 0; i < jumlahData; i++) {

                            System.out.println();
                            System.out.println("Data ke-" + (i + 1));
                            System.out.println("----------------------------");

                            daftarSewa[i].tampilkanInfo();
                        }

                        System.out.println();
                        System.out.println("Total penyewaan: "
                                + Lapangan.getJumlahSewa());
                    }

                    break;

                case 3:

                    System.out.println();
                    System.out.println(
                            "Fitur pencarian akan dibuat pada tahap berikutnya."
                    );

                    break;

                case 4:

                    System.out.println();
                    System.out.println("Terima kasih telah menggunakan");
                    System.out.println("Sistem Sewa Lapangan.");

                    break;

                default:

                    System.out.println();
                    System.out.println("Pilihan menu tidak tersedia.");
            }

        } while (pilihan != 4);

        input.close();
    }
}
