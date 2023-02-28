public class Lingkaran {

    double jarijari;
    double diameter;
    double phi = 22.0/7;
    double sudutjuring;

    double getluas(){
        double luas = phi*jarijari*jarijari;
        return luas;
    }
    double keliling(){
        double keliling = phi*diameter;
        return keliling;
    }
    double luasjuring(){
        double luasjuring = sudutjuring * getluas();
        return luasjuring;
    }
}
