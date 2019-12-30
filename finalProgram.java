import java.util.Scanner;

/* Buat program untuk menentukan hasil kali luas dan voulme menggunakan scanner:
    Pilihan:
    1. Luas hitungLuasSegitiga
    2. Volume Balok
    3. Volume Prisma
    4. Volume Kerucut
    5. Exit

      --> Option setelah Pilihan
          1. Back to Home
          2. Exit
*/

public class finalProgram{

  public static void main(String[] args){
      boolean belajar = true;
      while(belajar==true){
          menu();
      }

  }
  public static void menu(){

    int input;

    System.out.println(" =========== Final Program ===========");
    System.out.println();
    System.out.println("1. Hitung Luas Segitiga");
    System.out.println("2. Hitung Volume Balok");
    System.out.println("3. Volume Prisma Segitga");
    System.out.println("4. Volume Kerucut");
    System.out.println("5. Exit");

    Scanner read = new Scanner (System.in);
    System.out.println("Silahkan pilih menu yang anda inginkan");
    input =read.nextInt();


    Scanner look = new Scanner (System.in);
    switch(input){
      case 1:
        System.out.print("Alas = ");
        double alas = look.nextDouble();
        System.out.print("Tinggi = ");
        double tinggi = look.nextDouble();
        System.out.print( "Luas segitiga nya adalah ");
        count.hitungLuasSegitiga(alas, tinggi);
        System.out.println();
        System.out.println("Tekan 1 jika ingin mencoba lagi?");
        int jawab = look.nextInt();
        if ((jawab > 1)){
            System.out.println ("ANDA KELUAR");
            System.exit(0);
          }
        break;
      case 2:
        System.out.print("Panjang = ");
        double p = look.nextDouble();
        System.out.print("Lebar = ");
        double l = look.nextDouble();
        System.out.print("Tinggi = ");
        double t = look.nextDouble();
        System.out.print( "Luas volume balok nya adalah ");
        count.hitungVolumeBalok(p,l,t);
        System.out.println();
        System.out.println("Tekan 1 jika ingin mencoba lagi?");
        int jawab2 = look.nextInt();
        if ((jawab2 > 1)){
            System.out.println ("ANDA KELUAR");
            System.exit(0);
          }
        break;
      case 3:
        System.out.print("Tinggi Alas  = ");
        double t_alas= look.nextDouble();
        System.out.print("Panjang Alas = ");
        double p_alas= look.nextDouble();
        System.out.print("Tinggi Prisma = ");
        double t_prisma = look.nextDouble();
        count.hitungVolPrisma(t_alas,p_alas,t_prisma );
        System.out.print( "Luas volume Prisma Segitga nya adalah ");
        System.out.println();
        System.out.println("Tekan 1 jika ingin mencoba lagi?");
        int jawab1 = look.nextInt();
        if ((jawab1 > 1)){
            System.out.println ("ANDA KELUAR");
            System.exit(0);
          }
        break;
        case 4:
        System.out.print("Jari-jari Kerucut = ");
        double r= look.nextDouble();
        System.out.print("Tinggi Kerucut = ");
        double t_kerucut= look.nextDouble();
        count.hitungVolKerucut(r, t_kerucut);
        System.out.print( "Luas volume Kerucut nya adalah ");
        System.out.println();
        System.out.println("Tekan 1 jika ingin mencoba lagi?");
        int jawab3 = look.nextInt();
        if ((jawab3 > 1)){
            System.out.println ("ANDA KELUAR");
            System.exit(0);
          }
        default:
        System.exit(0);
      }

    }
  }



class count{
  public static void hitungLuasSegitiga(double alas, double tinggi){
    double luas= (alas * tinggi)/2;
    System.out.println(luas);
}
  public static void hitungVolumeBalok(double p, double l, double t){
    double volume = p*l*t;
    System.out.println(volume);
  }

  public static void hitungVolPrisma(double t_alas, double p_alas, double t_prisma){
      double volume = (p_alas*t_alas*t_prisma)/2;
      System.out.println(volume);
  }
  public static void hitungVolKerucut(double r, double t_kerucut){
      double pi = 3.1415926;
      double volume = (pi*r*r*t_kerucut)/3;
      System.out.println(volume);
  }

}
