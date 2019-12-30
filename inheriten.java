public class inheriten{

  public static void main(String[] args) {
    System.out.println(" ==== PERSEGI ==== ");
    Persegi persegi = new Persegi();
    persegi.setSisi(3);
    persegi.hitungLuas();
    persegi.hitungKeliling();
    System.out.println();

    System.out.println(" ==== LINGKARAN ==== ");
    Lingkaran lingkaran = new Lingkaran();
    lingkaran.setR(7);
    lingkaran.hitungLuas();
    lingkaran.hitungKeliling();
    System.out.println();

    System.out.println(" ==== PERSEGI PANJANG ==== ");
    PersegiPanjang perpan = new PersegiPanjang();
    perpan.setP(10);
    perpan.setL(5);
    perpan.hitungLuas();
    perpan.hitungKeliling();
    System.out.println();

    System.out.println(" ==== SEGITIGA ==== ");
    Segitiga segitiga = new Segitiga();
    segitiga.setA(10);
    segitiga.setT(8);
    segitiga.hitungLuas();
    segitiga.hitungKeliling();
    System.out.println();
  }
}


class BangunDatar{
  double luas;
  double keliling;

  void hitungLuas(){
    System.out.println("Luasnya adalah ....");
  }

  void hitungKeliling(){
    System.out.println("Kelilingnya adalah ... ");
  }
}

class Persegi extends BangunDatar {
  double sisi;

  void setSisi(double sisi){
    this.sisi = sisi;
  }
  double getSisi(){
    return this.sisi;
  }

  @Override
  void hitungLuas(){
    this.luas = this.sisi * this.sisi;
    System.out.println("Luas Persegi adalah : " + this.luas);
  }

  @Override
  void hitungKeliling(){
    this.keliling = this.sisi * 4;
    System.out.println("Keliling Persegi adalah : " +this.keliling);
  }
}

class Lingkaran extends BangunDatar {
  double r;
  final double pi = 3.14;

  void setR(double r){
    this.r = r;
  }

  double getR(){
    return this.r;
  }

  @Override
  void hitungLuas(){
    this.luas = pi * this.r * this.r;
    System.out.println("Luas Lingkaran adalah = " + this.luas);
  }

  @Override
  void hitungKeliling(){
    this.keliling = 2 * pi * this.r;
    System.out.println("Keliling Lingkaran adalah = " + this.keliling);

  }
}

class PersegiPanjang extends BangunDatar{
  double p,l;


  void setP (double p){
    this.p = p;
  }

  double getP(){
    return this.p;
  }

  void setL (double l){
    this.l = l;
  }

  double getL(){
    return this.l;
  }

  @Override
  void hitungLuas(){
    this.luas = this.p * this.l;
    System.out.println("Luas Persegi Panjang adalah = " + this.luas);
  }

  @Override
  void hitungKeliling(){
    this.keliling = (2*this.p) + (2*this.l);
    System.out.println("Luas Persegi Panjang adalah = " + this.keliling);
  }
}


class Segitiga extends BangunDatar{
  double a,t;

  void setA (double a){
    this.a = a;
  }

  double getA(){
    return this.a;
  }

  void setT (double t){
    this.t = t;
  }

  double getT(){
    return this.t;
  }

  @Override
  void hitungLuas(){
    this.luas = (this.a * this.t)/2;
    System.out.println("Ini adalah Luas Segitiga = " + this.luas);
  }
  void hitungKeliling(){
    this.keliling = (this.a * 3);
    System.out.println("Ini adalah Keliling Segitga = " + this.keliling);

  }
}
