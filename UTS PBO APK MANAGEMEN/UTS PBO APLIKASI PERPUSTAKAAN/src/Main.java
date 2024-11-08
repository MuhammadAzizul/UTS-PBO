import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PERPUSTAKAAN ===");
        System.out.println("Nama: Muhammad Azizul Mustofa");
        System.out.println("NIM : 32602000043");
        
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Lihat Daftar Buku Tersedia");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            
            int pilihan = input.nextInt();
            input.nextLine(); // Bersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan Pengarang Buku: ");
                    String pengarang = input.nextLine();
                    System.out.print("Masukkan Tahun Terbit: ");
                    int tahunTerbit = input.nextInt();
                    input.nextLine(); // Bersihkan newline
                    System.out.print("Masukkan ISBN: ");
                    String isbn = input.nextLine();
                    
                    Buku bukuBaru = new Buku(judul, pengarang, tahunTerbit, isbn);
                    perpustakaan.tambahkanBuku(bukuBaru);
                    break;
                    
                case 2:
                    System.out.print("Masukkan Nama Anggota: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Nomor Anggota: ");
                    String nomorAnggota = input.nextLine();
                    System.out.print("Masukkan Alamat Anggota: ");
                    String alamat = input.nextLine();
                    
                    Anggota anggotaBaru = new Anggota(nama, nomorAnggota, alamat);
                    perpustakaan.tambahkanAnggota(anggotaBaru);
                    break;

                case 3:
                    System.out.print("Masukkan Nomor Anggota: ");
                    String nomorPinjam = input.nextLine();
                    System.out.print("Masukkan ISBN Buku: ");
                    String isbnPinjam = input.nextLine();
                    perpustakaan.prosesPinjamBuku(nomorPinjam, isbnPinjam);
                    break;

                case 4:
                    System.out.print("Masukkan Nomor Anggota: ");
                    String nomorKembali = input.nextLine();
                    System.out.print("Masukkan ISBN Buku: ");
                    String isbnKembali = input.nextLine();
                    perpustakaan.prosesPengembalianBuku(nomorKembali, isbnKembali);
                    break;

                case 5:
                    perpustakaan.daftarBukuTersedia();
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}