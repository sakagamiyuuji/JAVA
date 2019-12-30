public class  learn1{

  public static void main(String[] args) {
    Musisi roby = new Musisi();
    roby.nama = "Roby";
    roby.menyanyi();
    Pianis steve = new Pianis();
    steve.nama = "Steve";
    steve.bacaNada();
    steve.mainPiano();
    //steve.menyanyi();
  }
}

class Musisi{
  String nama;

  void menyanyi(){
    System.out.println(this.nama + " nyanyi ... ");
  }

  //seter
  void diberiNama(String nama){
    this.nama = nama;
  }
  //getter
  String getNama(){
    return this.nama;
  }

  void speak(String words){
    System.out.println(words);
  }

  void bacaNada(){
    System.out.println(this.nama + " baca nada ...");
  }
  void manggung(){
    this.menyanyi();
  }
}

class Pianis extends Musisi{
  void mainPiano(){
    System.out.println(this.nama + " main piano");
  }
}
