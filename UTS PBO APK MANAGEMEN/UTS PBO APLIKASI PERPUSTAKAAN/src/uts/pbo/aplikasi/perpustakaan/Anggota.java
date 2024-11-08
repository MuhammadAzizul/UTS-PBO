import java.util.ArrayList;

public class Anggota {
    private String nama;
    private String nomorAnggota;
    private String alamat;
    private ArrayList<Buku> bukuPinjaman;

    public Anggota(String nama, String nomorAnggota, String alamat) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
        this.bukuPinjaman = new ArrayList<>();
    }

    public void infoAnggota() {
        System.out.println("Nama: " + nama + ", Nomor Anggota: " + nomorAnggota + 
                           ", Alamat: " + alamat);
        System.out.println("Buku yang Dipinjam:");
        for (Buku buku : bukuPinjaman) {
            buku.infoBuku();
        }
    }

    public void tambahPinjaman(Buku buku) {
        bukuPinjaman.add(buku);
    }

    public void hapusPinjaman(Buku buku) {
        bukuPinjaman.remove(buku);
    }

    public String getNomorAnggota() {
        return nomorAnggota;
    }
}