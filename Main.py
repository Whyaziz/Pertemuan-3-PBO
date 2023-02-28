public class Main {

    public static void main(String[] args) {
//        Orang aziz = new Orang();
//        aziz.nama = "Muhammad Rizky Aziz";
//        aziz.bahasa = "tagalog";
//        aziz.tinggibadan = 172;
//        aziz.beratbadan = 88;
//
//        System.out.println(aziz.suku());
//        System.out.println(aziz.noktp);
//        System.out.println(aziz.ceksehat());

        Lingkaran lingkaran = new Lingkaran();

        lingkaran.jarijari=7;
        lingkaran.sudutjuring=25;
        lingkaran.diameter = 2*lingkaran.jarijari;

        System.out.println(lingkaran.getluas());
        System.out.println(lingkaran.keliling());


    }
}
