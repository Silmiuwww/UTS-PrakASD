public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;

        hitungNilaiAkhir();
    }

    public void hitungNilaiAkhir() {
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public void tampilNilai() {
        System.out.println("Nama Mahasiswa : " + mahasiswa.nama);
        System.out.println("Mata Kuliah    : " + mataKuliah.namaMK);
        System.out.println("Nilai Akhir    : " + nilaiAkhir);
    }

    static void bubblesort(Penilaian[] nilai){
        for (int i = 0; i < nilai.length-1; i++) {
            for (int j = 1; j < nilai.length-i; j++) {
                Penilaian temp;
                if (nilai[j].nilaiAkhir > nilai[j-1].nilaiAkhir ) {
                    temp = nilai[j];
                    nilai[j] = nilai[j-1];
                    nilai[j-1] = temp;
                }
            }
        }
    }
}
