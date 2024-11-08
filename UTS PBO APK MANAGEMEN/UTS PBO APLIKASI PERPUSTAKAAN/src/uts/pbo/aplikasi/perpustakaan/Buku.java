public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private String isbn;
    private boolean tersedia;

    public Buku(String judul, String pengarang, int tahunTerbit, String isbn) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.isbn = isbn;
        this.tersedia = true;
    }

    public void infoBuku() {
        System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + 
                           ", Tahun Terbit: " + tahunTerbit + ", ISBN: " + isbn + 
                           ", Status: " + (tersedia ? "Tersedia" : "Dipinjam"));
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void ubahStatus(boolean status) {
        this.tersedia = status;
    }

    public String getIsbn() {
        return isbn;
    }
}