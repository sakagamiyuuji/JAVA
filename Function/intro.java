public class intro{

    public static void main(String[] args) {
      int a=5;
      int b=2;
      hitungLuasSegitiga(a,b);
      hitungLuasSegitiga(15,2);
      double luasLingkaran1 = hitungLuasLingkaran(7);
      System.out.println(luasLingkaran1);
      hitungVolumeTabung(7,2);

    }

    public static void hitungLuasSegitiga(int alas, int tinggi){
    double luas= (alas * tinggi)/2;
    System.out.println(luas);
    }

    public static double hitungLuasLingkaran(double r){
      final double pi =3.14;
      double luas= r*r*pi;
      return luas;
    }

    public static void hitungVolumeTabung (double r, double t){
      double luasLingkaran= hitungLuasLingkaran(r);
      double volume = luasLingkaran*t;
      System.out.println(volume);
    }
}
