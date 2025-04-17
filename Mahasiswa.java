public class Mahasiswa {
    String NIM;
    String nama;
    String prodi;

    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.println("NIM  : " + NIM);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
    }

    static void search(Mahasiswa[] mhs, String nim){
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].NIM.equalsIgnoreCase(nim)) {
                mhs[i].tampilMahasiswa();
                break;
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }
}

