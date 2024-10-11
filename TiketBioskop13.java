import java.util.Scanner;

public class TiketBioskop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0.0;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik '0' untuk berhenti): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, masukkan ulang.");
                continue;
            }

            
            double totalHarga = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                totalHarga *= 0.85;
                System.out.println("Total diskon: 15%");
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90; 
                System.out.println("Total diskon: 10%");
            }

           
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + totalHarga);
        } while (true);

        System.out.println("Total tiket yang terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);

        sc.close();
    }
}
