public class ManajemenMahasiswa {
    public static void main(String[] args) {
        DaftarMahasiswa daftar = new DaftarMahasiswa();

        // Menambahkan mahasiswa baru (NIM 10 digit)
        daftar.tambah("2501234567", "Moreno", 85);
        daftar.tambah("2501234568", "Rahma", 90);
        daftar.tambah("2501234569", "Bima", 80);
        daftar.tampilkan("Daftar Mahasiswa:");

        // Mengupdate nilai
        System.out.println();
        daftar.updateNilai("2501234568", 95);
        daftar.tampilkan("Daftar Mahasiswa setelah update:");

        // Menghapus mahasiswa
        System.out.println();
        daftar.hapus("2501234569");
        daftar.tampilkan("Daftar Mahasiswa setelah hapus:");
    }
}
