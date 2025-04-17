<<<<<<< HEAD
import java.util.Scanner;
public class Main {
    public static void bubbleSortNilai(Penilaian[] data, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j].nilaiAkhir < data[j + 1].nilaiAkhir) {
                    Penilaian temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void cariMahasiswaByNIM(Penilaian[] data, int n, String nim) {
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (data[i].mahasiswa.getNim().equals(nim)) {
                System.out.print("Mahasiswa ditemukan: "); 
                data[i].tampilNilai();
                System.out.println("------------------------");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Informatika"),
        };

        MataKuliah[] daftarMK = {
            new MataKuliah("MK001", "Struktur Data", 3), 
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 2),
        };

        Penilaian[] daftarNilai = {
            new Penilaian(daftarMahasiswa[0], daftarMK[0], 80, 85, 90),  
            new Penilaian(daftarMahasiswa[0], daftarMK[1], 60, 75, 70), 
            new Penilaian(daftarMahasiswa[1], daftarMK[0], 75, 70, 80), 
            new Penilaian(daftarMahasiswa[2], daftarMK[1], 85, 90, 95),  
            new Penilaian(daftarMahasiswa[2], daftarMK[2], 80, 90, 65), 
        };
         
 
=======
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
>>>>>>> 5d376ea3bcdf76dcc009330215aed23d2e127301

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
<<<<<<< HEAD
            input.nextLine(); 
=======
            input.nextLine(); // Buffer clear
>>>>>>> 5d376ea3bcdf76dcc009330215aed23d2e127301

            switch (menu) {
                case 1:
                    System.out.println("\n=== Daftar Mahasiswa ===");
<<<<<<< HEAD
                    daftarMahasiswa[0].tampilMahasiswa();
                    System.out.println();
                    daftarMahasiswa[1].tampilMahasiswa();
                    System.out.println();
                    daftarMahasiswa[2].tampilMahasiswa();
=======
                    m1.tampilMahasiswa();
                    System.out.println();
                    m2.tampilMahasiswa();
                    System.out.println();
                    m3.tampilMahasiswa();
>>>>>>> 5d376ea3bcdf76dcc009330215aed23d2e127301
                    break;

                case 2:
                    System.out.println("\n=== Daftar Mata Kuliah ===");
<<<<<<< HEAD
                    daftarMK[0].tampilMatakuliah();
                    System.out.println();
                    daftarMK[1].tampilMatakuliah();
                    System.out.println();
                    daftarMK[2].tampilMatakuliah();
=======
                    mk1.tampilMatakuliah();
                    System.out.println();
                    mk2.tampilMatakuliah();
                    System.out.println();
                    mk3.tampilMatakuliah();
>>>>>>> 5d376ea3bcdf76dcc009330215aed23d2e127301
                    break;

                case 3:
                    System.out.println("\n=== Data Penilaian ===");
                    for (Penilaian p : daftarNilai) {
                        p.tampilNilai();
<<<<<<< HEAD
                    }
                    break;

                    case 4:
                    System.out.println("\n=== Data Penilaian (Diurutkan Nilai Akhir) ===");
                    bubbleSortNilai(daftarNilai, 3); // <- jumlahData = panjang array, misal 5
                    for (int i = 0; i < 3; i++) {
                        System.out.println(daftarNilai[i].mahasiswa.nama + " | " + 
                                           daftarNilai[i].mataKuliah.namaMK + 
                                           " | Nilai Akhir: " + daftarNilai[i].nilaiAkhir);
                    }
                    break;
                
=======
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
>>>>>>> 5d376ea3bcdf76dcc009330215aed23d2e127301

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
<<<<<<< HEAD
}
=======
}
>>>>>>> 5d376ea3bcdf76dcc009330215aed23d2e127301
