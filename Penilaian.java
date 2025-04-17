<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 5d376ea3bcdf76dcc009330215aed23d2e127301
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
<<<<<<< HEAD
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;

=======
>>>>>>> 5d376ea3bcdf76dcc009330215aed23d2e127301
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
<<<<<<< HEAD
}
=======
}
>>>>>>> 5d376ea3bcdf76dcc009330215aed23d2e127301
