public class DaftarMahasiswa {
    private Node head;
    private Node tail;

    public Node cari(String nim) {
        Node cur = head;
        while (cur != null) {
            if (cur.nim.equals(nim)) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    public void tambah(String nim, String nama, int nilai) {
        if (cari(nim) != null) {
            System.out.println("NIM " + nim + " sudah terdaftar.");
            return;
        }
        Node baru = new Node(nim, nama, nilai);
        if (head == null) {
            head = tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
    }

    public void hapus(String nim) {
        Node node = cari(nim);
        if (node == null) {
            System.out.println("NIM " + nim + " tidak ditemukan.");
            return;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
        System.out.println("Menghapus mahasiswa (" + node.nama + ")");
    }

    public void updateNilai(String nim, int nilaiBaru) {
        Node node = cari(nim);
        if (node == null) {
            System.out.println("NIM " + nim + " tidak ditemukan.");
            return;
        }
        System.out.println("Mengupdate nilai mahasiswa (" + node.nama + " -> " + nilaiBaru + ")");
        node.nilai = nilaiBaru;
    }

    public void tampilkan(String judul) {
        System.out.println(judul);
        if (head == null) {
            System.out.println("(kosong)");
            return;
        }
        Node cur = head;
        int i = 1;
        while (cur != null) {
            System.out.println(i + ". NIM: " + cur.nim + ", Nama: " + cur.nama + ", Nilai: " + cur.nilai);
            cur = cur.next;
            i++;
        }
    }
}
