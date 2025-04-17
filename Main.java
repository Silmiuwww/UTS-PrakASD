import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Informatika")
        };

        MataKuliah[] daftarMK = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 2)
        };

        Penilaian[] daftarNilai = {
            new Penilaian(daftarMahasiswa[0], daftarMK[0], 80, 85, 90),
            new Penilaian(daftarMahasiswa[0], daftarMK[1], 60, 75, 70),
            new Penilaian(daftarMahasiswa[1], daftarMK[0], 75, 70, 80),
            new Penilaian(daftarMahasiswa[2], daftarMK[1], 85, 90, 95),
            new Penilaian(daftarMahasiswa[2], daftarMK[2], 80, 90, 65)
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
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        mhs.tampilMahasiswa();
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("\n=== Daftar Mata Kuliah ===");
                    for (MataKuliah mk : daftarMK) {
                        mk.tampilMatakuliah();
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("\n=== Data Penilaian ===");
                    for (Penilaian p : daftarNilai) {
                        p.tampilNilai();
                    }
                    break;

                case 4:
                    Penilaian.bubblesort(daftarNilai);
                    for (Penilaian penilaian : daftarNilai) {
                        penilaian.tampilNilai();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNIM = input.nextLine();
                    Mahasiswa.search(daftarMahasiswa, cariNIM);
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
