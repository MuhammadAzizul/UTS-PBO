import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksiBuku;
    private ArrayList<Anggota> daftarAnggota;

    public Perpustakaan() {
        this.koleksiBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
    }

    public void tambahkanBuku(Buku buku) {
        koleksiBuku.add(buku);
        System.out.println("Buku baru telah ditambahkan.");
    }

    public void tambahkanAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
        System.out.println("Anggota baru telah ditambahkan.");
    }

    public void daftarBukuTersedia() {
        System.out.println("Daftar Buku Tersedia:");
        for (Buku buku : koleksiBuku) {
            if (buku.isTersedia()) {
                buku.infoBuku();
            }
        }
    }

    public void prosesPinjamBuku(String nomorAnggota, String isbn) {
        Buku buku = cariBuku(isbn);
        Anggota anggota = cariAnggota(nomorAnggota);

        if (buku != null && anggota != null && buku.isTersedia()) {
            buku.ubahStatus(false);
            anggota.tambahPinjaman(buku);
            System.out.println("Buku berhasil dipinjam oleh " + anggota.getNomorAnggota());
        } else {
            System.out.println("Gagal meminjam. Periksa kembali ISBN atau nomor anggota.");
        }
    }

    public void prosesPengembalianBuku(String nomorAnggota, String isbn) {
        Buku buku = cariBuku(isbn);
        Anggota anggota = cariAnggota(nomorAnggota);

        if (buku != null && anggota != null && !buku.isTersedia()) {
            buku.ubahStatus(true);
            anggota.hapusPinjaman(buku);
            System.out.println("Buku berhasil dikembalikan oleh " + anggota.getNomorAnggota());
        } else {
            System.out.println("Gagal mengembalikan. Periksa kembali ISBN atau nomor anggota.");
        }
    }

    private Buku cariBuku(String isbn) {
        for (Buku buku : koleksiBuku) {
            if (buku.getIsbn().equals(isbn)) {
                return buku;
            }
        }
        return null;
    }

    private Anggota cariAnggota(String nomorAnggota) {
        for (Anggota anggota : daftarAnggota) {
            if (anggota.getNomorAnggota().equals(nomorAnggota)) {
                return anggota;
            }
        }
        return null;
    }
}