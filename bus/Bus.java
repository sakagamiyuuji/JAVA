import java.util.Scanner;

public class Bus{
  public static void main(String[] args) {

    int harga =0;
    String jurusan = "";

for (int i=0; i<2; i++){
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    System.out.println("SELAMAT DATANG");
    System.out.print("Masukan nama anda = ");
    String nama = input.nextLine();

    System.out.format("Masukan rute yang anda inginkan = %n1. Jakarta - Bandung %n2. Bandung - Jakarta %n3. Jakarta - Tasikmalaya%n");
    System.out.print("INPUT = ");
    int rute = input.nextInt();

    System.out.print("Masukan kelas yang anda inginkan [AC / NA (Non-AC)] = ");
    String kelas = input2.nextLine();


    switch(rute){
      case 1:
      jurusan= "Jakarta - Bandung";

      if (kelas.equalsIgnoreCase("AC")){
        harga = 90000;
      }
      else if (kelas.equalsIgnoreCase("NA")){
        harga = 130000;
      }
      else{
        System.out.println("INPUT SALAH");
        System.exit(0);
      }
      break;

      case 2:
      jurusan= "Bandung - Jakarta";

      if (kelas.equalsIgnoreCase("AC")){
        harga = 70000;
      }
      else if (kelas.equalsIgnoreCase("NA")){
        harga = 150000;
      }
      else{
        System.out.println("INPUT SALAH");
        System.exit(0);
      }
      break;

      case 3:
      jurusan= "Jakarta - Tasikmalaya";

      if (kelas.equalsIgnoreCase("AC")){
        harga = 50000;
      }
      else if (kelas.equalsIgnoreCase("NA")){
        harga = 70000;
      }
      else{
        System.out.println("INPUT SALAH");
        System.exit(0);
      }
    }

    System.out.println("Masukan jumlah kursi yang anda inginkan = ");
    int kursi = input.nextInt();

    int total = harga*kursi;
    //OUTPUT
    System.out.format("%nTerima kasih telah memesan tikt bis dengan rincian sebagai berikut %n%n");
    System.out.println("NAMA          = " +nama);
    System.out.println("RUTE          = " +rute);
    System.out.println("Kelas         = " +kelas);
    System.out.println("Harga satuan  = " +harga);
    System.out.println("Jumlah kursi  = " +kursi);
    System.out.println("Total Bayar   = Rp. " + total + " ,-");
    System.out.format("%nSILAHKAN MEMBAYAR DI ALFAMART TERDEKAT%n");
  }
  }
}
