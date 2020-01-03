package app;
import java.util.HashMap;
import java.util.Scanner;
import app.data.Buku;
import app.data.Member;
import app.transaction.Pinjam;

public class Program{
  private static HashMap <String, Buku> lemariBuku = new HashMap<String, Buku>();

  public static void main(String[] args) {
    lemariBuku.put("978-4-04-867760-8", new Buku("SAO 1 - Aincard","978-4-04-867760-8","Reki Kawahara", "ASCII Media Works", "25 Chapter",10));
    lemariBuku.put("978-4-04-867935-0", new Buku("SAO 2 - Aincard","978-4-04-867935-0","Reki Kawahara", "ASCII Media Works", "4 Chapter",10));


    HashMap <String, Member> daftarMember = new HashMap<String,Member>();
    daftarMember.put("M-001", new Member("M-001","Kirigaya Kazuto","16 Tahun", "The Swordsman Hitam"));
    daftarMember.put("M-002", new Member("M-002","Yuuki Asuna","15 Tahun", "Flash"));

    HashMap <String, Pinjam> daftarTransaksi = new HashMap <String, Pinjam>();


    //Buku buku1 = lemariBuku.get("978-4-04-867935-0");
    //System.out.println(lemariBuku.get("978-4-04-867935-0").getJudulBuku());

    getLemariBuku();


    for (String key : daftarMember.keySet()){
      //get data buku satu per satu masukan ke variabel

      String idMember = daftarMember.get(key).getIdMember();
      String namaMember = daftarMember.get(key).getNamaMember();
      String umur = daftarMember.get(key).getUmur();
      String nickname = daftarMember.get(key).getNickname();

      //print variabel
      System.out.println("ID Member   = " +idMember);
      System.out.println("Nama Member = " +namaMember);
      System.out.println("Umur        = "+ umur);
      System.out.println("Nickname    = " +nickname);
      System.out.format("%n%n");
    }
  }

  public static HashMap<String, Buku> getLemariBuku(){
    return lemariBuku;
  }

  public void setLemariBuku(HashMap <String,Buku> lemariBuku){
    this.lemariBuku= lemariBuku;
    int no =1;
    for (String key : lemariBuku.keySet()){
      //get data buku satu per satu masukan ke variabel

      String judul = lemariBuku.get(key).getJudulBuku();
      String isbn = lemariBuku.get(key).getISBN();
      String penulis = lemariBuku.get(key).getPenulis();
      String penerbit = lemariBuku.get(key).getPenerbit();
      String volume = lemariBuku.get(key).getVolume();

      //print variabel
      System.out.println("No        = " +no++);
      System.out.println("Judul     = " +judul);
      System.out.println("ISBN      = " +isbn);
      System.out.println("Penulis   = "+penulis);
      System.out.println("Penerbit  = " +penerbit);
      System.out.println("Volume    = " + volume);
      System.out.format("%n%n");
    }
  }
}
