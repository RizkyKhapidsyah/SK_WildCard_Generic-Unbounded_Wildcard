import com.rizkykhapidsyah.GenericSaya;

public class MainProgram {
    public static void main(String[] args) {
        GenericSaya<Integer> AngkaAngka = new GenericSaya<Integer>();

        AngkaAngka.Dorong(34);
        AngkaAngka.Dorong(14);
        AngkaAngka.Dorong(18);

        //System.out.println("Nomor Maks  = " + Maks(AngkaAngka)); // Bagian ini akan Error

        tampilkanData(AngkaAngka);
    }

    public static double Maks(GenericSaya<?> Daftar) {
        double Maks = (Double) Daftar.pop();

        while (!Daftar.apakahKosong()) {
            double nilai = (Double) Daftar.pop();

            if (nilai > Maks) {
                Maks = nilai;
            }
        }

        return Maks;
    }

/*
    public static double Maks(GenericSaya<Number> Daftar) {
        double Maks = Daftar.pop().doubleValue();

        while (!Daftar.apakahKosong()) {
            double nilai = Daftar.pop().doubleValue();

            if (nilai > Maks) {
                Maks = nilai;
            }
        }

        return Maks;
    }
*/

    public static void tampilkanData(GenericSaya<?> Daftar) {
        while (!Daftar.apakahKosong()) {
            System.out.println(Daftar.pop());
        }
    }

}
