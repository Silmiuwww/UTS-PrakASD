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
            input.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("\n=== Daftar Mahasiswa ===");
                    daftarMahasiswa[0].tampilMahasiswa();
                    System.out.println();
                    daftarMahasiswa[1].tampilMahasiswa();
                    System.out.println();
                    daftarMahasiswa[2].tampilMahasiswa();
                    break;

                case 2:
                    System.out.println("\n=== Daftar Mata Kuliah ===");
                    daftarMK[0].tampilMatakuliah();
                    System.out.println();
                    daftarMK[1].tampilMatakuliah();
                    System.out.println();
                    daftarMK[2].tampilMatakuliah();
                    break;

                case 3:
                    System.out.println("\n=== Data Penilaian ===");
                    for (Penilaian p : daftarNilai) {
                        p.tampilNilai();
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