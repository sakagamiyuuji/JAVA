package app.transaction;
import app.data.Buku;
import app.data.Member;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pinjam{
  private String kodeTrans;
  private HashMap<String, Buku> borrow = new HashMap<String, Buku>();
  private Member peminjam;
  private Date waktuPeminjaman;

  //contructor
  public Pinjam (Member peminjam){
    this.peminjam = peminjam;
    Date hariIni = new Date();
    this.waktuPeminjaman = hariIni;
  }

  public String getKodeTrans(){
    return kodeTrans;
  }

  public void setKodeTrans() {

    String modelWaktu = "dd-MM-yyyy hh:mm:ss";
    SimpleDateFormat formatTime = new SimpleDateFormat(modelWaktu);
    String waktu = formatTime.format(this.waktuPeminjaman);
    this.kodeTrans = this.peminjam.getIdMember()+ " " + waktu;
  }

  public HashMap<String,Buku> getBorrow(){
    return borrow;
  }

  public void setBorrow(HashMap<String, Buku> borrow){
    this.borrow = borrow;
  }

  //method
  public void addBook(String isbn, Buku books) {
    this.borrow.put(isbn, books);
    System.out.println("Buku " + borrow.get(isbn).getJudulBuku() + " || Berhasil di tambahkan");
    System.out.format ("%n============================================%n");
  }

  public Buku getBook(String isbn){
    return this.borrow.get(isbn);
  }
}
