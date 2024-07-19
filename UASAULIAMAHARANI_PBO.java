/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uasauliamaharani_pbo;

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class UASAULIAMAHARANI_PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kode Pembayaran");
        String kodePembayaran = scanner.nextLine();

        System.out.println("Nama Pelanggan");
        String namaPelanggan = scanner.nextLine();

        System.out.println("Jenis Pelanggan (GOLD, SILVER, UMUM)");
        String jenisPelanggan = scanner.nextLine();

        System.out.println("Tanggal");
        String tanggal = scanner.nextLine();

        System.out.println("Meter Bulan Ini");
        int meterBulanIni = scanner.nextInt();

        System.out.println("Meter Bulan Lalu");
        int meterBulanLalu = scanner.nextInt();

        int meterPakai = meterBulanLalu - meterBulanIni;

        int biayaPerMeter;

        if (jenisPelanggan.equals("GOLD")) {
            if (meterPakai >= 1 && meterPakai <= 10) {
                biayaPerMeter = 5000;
            } else if (meterPakai >= 11 && meterPakai <= 20) {
                biayaPerMeter = 10000;
            } else {
                biayaPerMeter = 20000;
            }
        } else if (jenisPelanggan.equals("SILVER")) {
            if (meterPakai >= 1 && meterPakai <= 10) {
                biayaPerMeter = 4000;
            } else if (meterPakai >= 11 && meterPakai <= 20) {
                biayaPerMeter = 8000;
            } else {
                biayaPerMeter = 10000;
            }
        } else {
            if (meterPakai >= 1 && meterPakai <= 10) {
                biayaPerMeter = 2000;
            } else if (meterPakai >= 11 && meterPakai <= 20) {
                biayaPerMeter = 3000;
            } else {
                biayaPerMeter = 5000;
            }
        }

        int totalBayar = meterPakai * biayaPerMeter;

        System.out.println("Total Bayar: " + totalBayar);
    }
}
    