//Buat satu program menampilkan data diri masing-masing yang di simpan dalam variable!
//Data nama, tempat tanggal lahir, ttl detail, umur (double). variable tempat, tanggal, bulan, tahun
//namafile: biodata

public class biodata{
    public static void main(String[] args) {
      String nama = "Hans Kristian Varian Kashira";
      String tempat = "Jakarta";
      int tanggal = 23;
      int bulan = 8;
      int tahun = 1997;
      double umur = 22.33;
      String alamat = "Graha Gading Serpong";

      System.out.println();
      System.out.println("==============================================");
      System.out.println("Nama   :" + nama);
      System.out.println("TTL    :" + tempat + "," + tanggal + "-"+bulan +"-"+ tahun);
      System.out.println("Umur   :" + umur);
      System.out.println("Alamat :" + alamat);
      System.out.println("==============================================");
    }
}
