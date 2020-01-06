import java.util.Scanner;

public class Parkiran{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

for (int i=0; i<2; i++){
    System.out.format("%nSELAMAT DATANG %n");
    System.out.print("Masukan Plat Nomer kendaraan anda : ");
    String platNomer = input.nextLine();

    System.out.format("Masukan Jenis Kendaraan Anda. %n1.Mobil %n2.Motor %nINPUT = ");
    int jenisKendaraan = input.nextInt();

    String type ="";
    if(jenisKendaraan == 1){
      type = "MOBIL";
    }
    else if (jenisKendaraan == 2){
      type = "MOTOR";
    }
    else{
      System.out.println("INPUT SALAH");
      System.exit(0);
    }


    System.out.print("Masuk jam (24 Jam): ");
    int masuk = input.nextInt();

    System.out.print("Keluar jam (24 Jam) :");
    int keluar = input.nextInt();

    int totalBayar=0;
    int lamaParkir = 0;

    if (masuk > keluar){
      lamaParkir = (keluar - masuk) +24;
    }
    else{
      lamaParkir = keluar - masuk;
    }


    //System.out.println("Lama Parkir = "+lamaParkir);

switch(jenisKendaraan){
    case 1:
    if (lamaParkir <= 1){
      totalBayar = 5000;
    }

      else if(lamaParkir >= 1 && lamaParkir <=24){
        lamaParkir = (lamaParkir - 1);
        totalBayar = 5000 + (lamaParkir*3000);

      }

    break;

    case 2 :
      if( lamaParkir <= 1){
        totalBayar = 3000;
      }

      else if (lamaParkir >= 1 && lamaParkir <=24){
        lamaParkir = (lamaParkir - 1);
        totalBayar = 3000 + (lamaParkir*1500);
      }
      break;

      default:
      System.out.println("INPUT YANG ANDA MASUKAN SALAH");
}
  System.out.format("%n============= TERIMA KASIH TELAH MELAKUKAN TRANSAKSI DENGAN RINCIAN BERIKUT ============= %n%n");
  System.out.println("Plat Nomer = "+platNomer);
  System.out.println("Lama Parkiran = " + lamaParkir + " Jam");
  System.out.println("Jenis Kendaraan = " + type);
  System.out.println("Total Bayar = Rp. "+ totalBayar + " ,-");
  System.out.format("%nSEMOGA PELAYANAN KAMI MEMUASKAN%n%n==============================================================================%n");

  }
}
}
