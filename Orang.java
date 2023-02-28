public class Orang {

    String nama;
    String noktp;
    String gender;
    Integer umur;
    String suku;
    String bahasa;
    String pekerjaan;
    int beratbadan;
    int tinggibadan;

    void Teriak(){
        System.out.println("UUUUUWWWWWAAAAAAAAA");
    }
    int umur(){
        return umur+=1;
    }
    String suku(){
        if (bahasa == "ngapak"){
            return"Jawa";
        }
        return "melayu";
    }

    String ceksehat(){
        if (tinggibadan - 110 >= beratbadan-10 || tinggibadan-110 <= beratbadan+10) {
        return "sehat";
        }
        else if (tinggibadan-110 <= beratbadan-10){
            return "kurus";
        }
        return "gemuk";
    }

    Orang(){
        //constraktor
    }




}
