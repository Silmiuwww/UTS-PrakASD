import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data Mahasiswa
        Mahasiswa m1 = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        Mahasiswa m2 = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        Mahasiswa m3 = new Mahasiswa("22003", "Citra Dewi", "Informatika");

        // Data Mata Kuliah
        MataKuliah mk1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Desain Web", 2);

        // Data Penilaian
        List<Penilaian> daftarNilai = new ArrayList<>();
        daftarNilai.add(new Penilaian(m1, mk1, 80, 85, 90));  // 85.5
        daftarNilai.add(new Penilaian(m1, mk2, 60, 75, 70));  // 68.5
        daftarNilai.add(new Penilaian(m2, mk1, 75, 70, 80));  // 75.5
        daftarNilai.add(new Penilaian(m3, mk2, 85, 90, 95));  // 90.5
        daftarNilai.add(new Penilaian(m3, mk3, 80, 90, 65));  // 77.0

        int menu;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine(); // Buffer clear

            switch (menu) {
                case 1:
                    System.out.println("\n=== Daftar Mahasiswa ===");
                    m1.tampilMahasiswa();
                    System.out.println();
                    m2.tampilMahasiswa();
                    System.out.println();
                    m3.tampilMahasiswa();
                    break;

                case 2:
                    System.out.println("\n=== Daftar Mata Kuliah ===");
                    mk1.tampilMatakuliah();
                    System.out.println();
                    mk2.tampilMatakuliah();
                    System.out.println();
                    mk3.tampilMatakuliah();
                    break;

                case 3:
                    System.out.println("\n=== Data Penilaian ===");
                    for (Penilaian p : daftarNilai) {
                        p.tampilNilai();
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("\n=== Data Penilaian (Diurutkan Nilai Akhir) ===");
                    daftarNilai.sort((a, b) -> Double.compare(b.nilaiAkhir, a.nilaiAkhir));
                    for (Penilaian p : daftarNilai) {
                        System.out.println(p.mahasiswa.nama + " | " + p.mataKuliah.namaMK + " | Nilai Akhir: " + p.nilaiAkhir);
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNIM = input.nextLine();
                    boolean ditemukan = false;
                    for (Penilaian p : daftarNilai) {
                        if (p.mahasiswa.NIM.equalsIgnoreCase(cariNIM)) {
                            p.tampilNilai();
                            System.out.println();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (menu != 0);
    }
}
