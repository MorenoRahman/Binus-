Manajemen Data Mahasiswa dengan Doubly Linked List

Program Java untuk mengelola daftar nilai mahasiswa menggunakan Doubly Linked List.

Fitur
Menambahkan mahasiswa baru
Menghapus mahasiswa dari daftar
Mengupdate nilai mahasiswa
Menampilkan daftar mahasiswa
Struktur File
File	Fungsi
Node.java	Kelas node: menyimpan NIM, nama, nilai, serta penunjuk prev dan next
DaftarMahasiswa.java	Logika linked list: tambah, hapus, updateNilai, tampilkan, cari
ManajemenMahasiswa.java	Kelas utama berisi main() untuk demo semua fitur
Langkah Menjalankan
Pastikan Java (JDK) sudah terpasang. Cek dengan:
   javac -version
Simpan ketiga file .java dalam satu folder yang sama.
Buka terminal di folder tersebut, lalu compile:
   javac *.java

Langkah ini menghasilkan file .class (bytecode). File ini boleh dihapus dan akan dibuat ulang saat compile. 4. Jalankan program:

   java ManajemenMahasiswa
Contoh Output
Daftar Mahasiswa:
1. NIM: 2501234567, Nama: Moreno, Nilai: 85
2. NIM: 2501234568, Nama: Rahma, Nilai: 90
3. NIM: 2501234569, Nama: Bima, Nilai: 80

Mengupdate nilai mahasiswa (Rahma -> 95)
Daftar Mahasiswa setelah update:
1. NIM: 2501234567, Nama: Moreno, Nilai: 85
2. NIM: 2501234568, Nama: Rahma, Nilai: 95
3. NIM: 2501234569, Nama: Bima, Nilai: 80

Menghapus mahasiswa (Bima)
Daftar Mahasiswa setelah hapus:
1. NIM: 2501234567, Nama: Moreno, Nilai: 85
2. NIM: 2501234568, Nama: Rahma, Nilai: 95
Penjelasan Program
Doubly Linked List

Setiap data mahasiswa disimpan dalam satu Node. Node saling terhubung dua arah:

null <- [Moreno] <-> [Rahma] <-> [Bima] -> null
         head                     tail
next menunjuk ke node berikutnya.
prev menunjuk ke node sebelumnya.
head adalah node pertama, tail adalah node terakhir.

Dengan prev dan next, penghapusan node di posisi mana pun bisa dilakukan tanpa menelusuri ulang dari awal.

Penjelasan Method

cari(nim) Menelusuri list dari head sampai ketemu node dengan NIM yang sama. Mengembalikan node tersebut, atau null jika tidak ada.

tambah(nim, nama, nilai)

Jika NIM sudah ada, data ditolak (NIM harus unik).
Jika list kosong, node baru menjadi head sekaligus tail.
Jika tidak kosong, node baru dipasang di belakang tail, lalu menjadi tail yang baru.

hapus(nim) Mencari node berdasarkan NIM, lalu memutus tautannya:

Jika node punya prev, maka prev.next diarahkan ke node.next. Jika tidak, node itu adalah head, sehingga head pindah ke node.next.
Jika node punya next, maka next.prev diarahkan ke node.prev. Jika tidak, node itu adalah tail, sehingga tail pindah ke node.prev.

updateNilai(nim, nilaiBaru) Mencari node berdasarkan NIM, lalu mengganti nilainya dengan nilaiBaru.

tampilkan(judul) Mencetak judul, lalu menelusuri list dari head ke tail dan mencetak setiap node dengan nomor urut.

Catatan
NIM disimpan sebagai String (10 digit angka) agar angka nol di depan tidak hilang dan tidak melebihi batas tipe int.
Data NIM pada contoh hanya data contoh dan bisa diganti.
