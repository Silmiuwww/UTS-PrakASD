<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 5d376ea3bcdf76dcc009330215aed23d2e127301
public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilMatakuliah() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + namaMK);
        System.out.println("SKS     : " + sks);
    }
}
}
