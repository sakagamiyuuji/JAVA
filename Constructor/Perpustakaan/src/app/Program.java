package app;
import java.util.HashMap;
import java.util.Scanner;
import app.data.Buku;
import app.data.Member;
import app.transaction.Pinjam;

public class Program{
  public static void main(String[] args) {
    HashMap <String, Buku> lemariBuku = new HashMap<String, Buku>();
    lemariBuku.put("978-4-04-867760-8", new Buku("SAO 1 - Aincard","978-4-04-867760-8","Reki Kawahara", "ASCII Media Works", "25 Chapter",10));
    lemariBuku.put("978-4-04-867935-0", new Buku("SAO 2 - Aincard","978-4-04-867935-0","Reki Kawahara", "ASCII Media Works", "4 Chapter",10));

    HashMap <String, Member> daftarMember = new HashMap<String,Member>();
    daftarMember.put("M-001", new Member("M-001","Kirigaya Kazuto","16 Tahun", "The Swordsman Hitam"));
    daftarMember.put("M-002", new Member("M-002","Yuuki Asuna","15 Tahun", "Flash"));

    HashMap<String, Pinjam> daftarTransaksi = new HashMap<String,Pinjam>();

    //Buku buku1 = lemariBuku.get("978-4-04-867935-0");
    //System.out.println(lemariBuku.get("978-4-04-867935-0").getJudulBuku());


    System.out.println("========================= DAFTAR BUKU DI PERPUSTAKAAN KAMI ===========================");
    int no =1;
    for (String key : lemariBuku.keySet()){
      //get data buku satu per satu masukan ke variabel

      String judul = lemariBuku.get(key).getJudulBuku();
      String ISBN = lemariBuku.get(key).getISBN();
      String penulis = lemariBuku.get(key).getPenulis();
      String penerbit = lemariBuku.get(key).getPenerbit();
      String volume = lemariBuku.get(key).getVolume();
      int stok = lemariBuku.get(key).getStok();

      //print variabel
      System.out.println("No        = " +no++);
      System.out.println("Judul     = " +judul);
      System.out.println("ISBN      = " +ISBN);
      System.out.println("Penulis   = "+penulis);
      System.out.println("Penerbit  = " +penerbit);
      System.out.println("Volume    = " + volume);
      System.out.println("Stok      = " + stok);
      System.out.format("%n%n");
    }

    Scanner input = new Scanner(System.in);
    System.out.println("Masukan ID MEMBER ANDA = ");
    String who = input.nextLine();

    if(daftarMember.containsKey(who)){
      System.out.println("Selamat datang " + daftarMember.get(who).getNamaMember());
    }
    else{
      System.out.println("ANDA BUKAN MEMBER");
      System.exit(0);
    }

    Member peminjam = daftarMember.get(who);
    Pinjam transaction = new Pinjam(peminjam);
    transaction.setKodeTrans();
    //System.out.println(transaction.getKodeTrans());

    boolean runPinjam = true;
    boolean masihIngin = true;
    while(runPinjam){
      System.out.print("Masukan kode ISBN buku yang ingin anda pinjam = ");
      String isbn = input.nextLine();

      if(lemariBuku.containsKey(isbn)){
        System.out.format("%n================================================%nBUKU ADA%n");
        Buku meminjamBuku = lemariBuku.get(isbn);
        meminjamBuku.diPinjam();
        transaction.addBook(isbn, meminjamBuku);
        lemariBuku.get(isbn).jumlahPinjam();
        lemariBuku.get(isbn).diPinjam();
        masihIngin = true;
      }
      else{
        System.out.println("BUKU TIDAK ADA");
        masihIngin = true;
      }

      while (masihIngin){
      System.out.println("Apakah anda masih ingin meminjam Buku? [Y/N]");
      String answer = input.nextLine();
      if(answer.equalsIgnoreCase("n")){
        runPinjam = false;
        masihIngin = false;
      }
      else if(answer.equalsIgnoreCase("y")){
        runPinjam = true;
        masihIngin = false;
      }
      else{
        System.out.println("INPUT YANG ANDA MASUKAN SALAH");
      }
      }
    }


      System.out.format("%nBuku yang di pinjam: %n");
      int nom =1;
      if(transaction.getBorrow().size() > 0){
        for (String i : transaction.getBorrow().keySet()){
          //get data buku satu per satu masukan ke variabel

          String judul = lemariBuku.get(i).getJudulBuku();
          String ISBN = lemariBuku.get(i).getISBN();
          String penulis = lemariBuku.get(i).getPenulis();
          String penerbit = lemariBuku.get(i).getPenerbit();
          String volume = lemariBuku.get(i).getVolume();
          int jumBuku = lemariBuku.get(i).getBukuDiPinjam();
          //int stok = lemariBuku.get(key).getStok();
          //print variabel

          System.out.println("Nomor \t\t\t= " + nom++);
          System.out.println("Judul \t\t\t= " +judul);
          System.out.println("ISBN \t\t\t= " +ISBN);
          System.out.println("Penulis \t\t= "+penulis);
          System.out.println("Penerbit \t\t= " +penerbit);
          System.out.println("Volume \t\t\t= " + volume);
          System.out.println("Jumlah Buku \t\t= " + jumBuku);
          System.out.format("%n%n");
        }


        System.out.format("%nAPAKAH DATA DI ATAS SUDAH SESUAI? [Y/N]");
        String answer1 = input.nextLine();
        if(answer1.equalsIgnoreCase("Y")){
            daftarTransaksi.put(transaction.getKodeTrans(), transaction);
            System.out.println("Buku berhasil di pinjam oleh");

              String idMember = daftarMember.get(who).getIdMember();
              String namaMember = daftarMember.get(who).getNamaMember();
              String umur = daftarMember.get(who).getUmur();
              String nickname = daftarMember.get(who).getNickname();

              //print variabel
              System.out.println("ID Member   = " +idMember);
              System.out.println("Nama Member = " +namaMember);
              System.out.println("Umur        = "+ umur);
              System.out.println("Nickname    = " +nickname);
              System.out.format("%nTERIMA KASIH TELAH MENGUNJUNGI PERPUSTAKAAN KAMI%n");
              System.out.println(transaction.getKodeTrans());

        }
        else{
            System.out.println("Transaksi di batalkan");
        }
      }

  }
}
