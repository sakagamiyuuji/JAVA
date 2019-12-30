public class oop{
  public static void main(String[] args) {
    // Membuat objek (instansiasi/ instance)
    //namaClass namaObject = new Constractor();

    mobil mobilBMW = new mobil(); //we had an object name MOBIL mobilBMW
    mobilBMW.merk = "BMW";
    mobilBMW.warna = "Biru";
    mobilBMW.plat_nomor = "B 3499 EXP";

    System.out.println(mobilBMW.merk);
    
    mobilBMW.nyalakanMesin();
    mobilBMW.maju();
    mobilBMW.mundur();
    }
  }



class mobil{
  //atribut
  String merk;
  String warna;
  String plat_nomor;
  int jumlah_roda;
  int jumlah_pintu;
  boolean nyalakanMesin = false;

  void nyalakanMesin(){
    //code untuk mesin menyala
    System.out.println("Mobil menyala");
    nyalakanMesin = true;
  }

  void maju(){
    //code untuk mobil mobil maju
    if (nyalakanMesin == true){
      System.out.println("Mobil Maju");
    }
    else{
      System.out.println("NYALAKAN");
    }
  }

  void mundur(){
    //code untuk mobil mundur
    if (nyalakanMesin == true){
      System.out.println("Mobil MUNDUR");
    }
    else{
      System.out.println("NYALAKAN");
    }
  }

}
