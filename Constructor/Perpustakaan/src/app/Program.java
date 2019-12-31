package app;
import java.util.HashMap;
import app.data.Buku;
import app.data.Member;

public class Program{
  public static void main(String[] args) {
    HashMap <String, Buku> lemariBuku = new HashMap<String, Buku>();
    lemariBuku.put("978-4-04-867760-8", new Buku("SAO 1 - Aincard","978-4-04-867760-8","Reki Kawahara", "ASCII Media Works", "25 Chapter"));
    lemariBuku.put("978-4-04-867935-0", new Buku("SAO 2 - Aincard","978-4-04-867935-0","Reki Kawahara", "ASCII Media Works", "4 Chapter"));

    //Buku buku1 = lemariBuku.get("978-4-04-867935-0");
    //System.out.println(lemariBuku.get("978-4-04-867935-0").getJudulBuku());

    int no =1;
    for (String key : lemariBuku.keySet()){
      //get data buku satu per satu masukan ke variabel

      String judul = lemariBuku.get(key).getJudulBuku();
      String isbn = lemariBuku.get(key).getISBN();
      String penulis = lemariBuku.get(key).getPenulis();
      String penerbit = lemariBuku.get(key).getPenerbit();
      String halamanBuku = lemariBuku.get(key).getHalamanBuku();

      //print variabel
      System.out.println("No        = " +no++);
      System.out.println("Judul     = " +judul);
      System.out.println("ISBN      = " +isbn);
      System.out.println("Penulis   = "+penulis);
      System.out.println("Penerbit  = " +penerbit);
      System.out.println("Volume    = " + halamanBuku);
      System.out.format("%n%n");
    }

    HashMap <String, Member> daftarMember = new HashMap<String,Member>();
    daftarMember.put("M-001", new Member("M-001","Kirigaya Kazuto","16 Tahun", "The Swordsman Hitam"));
    daftarMember.put("M-002", new Member("M-002","Yuuki Asuna","15 Tahun", "Flash"));

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
}
