package app.data;

public class Buku{
  private String judulBuku;
  private String ISBN;
  private String penulis;
  private String penerbit;
  private String volume;
  private int stok;



	public String getJudulBuku() {
		return judulBuku;
	}

	public void setJudulBuku(String judulBuku) {
		this.judulBuku = judulBuku;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getPenulis() {
		return penulis;
	}

	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}

	public String getPenerbit() {
		return penerbit;
	}

	public void setPenerbit(String penerbit) {
		this.penerbit = penerbit;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

  public int getStok() {
    return stok;
  }

  public void setStok(int stok) {
    this.stok = stok;
  }

  public void diPinjam() {
    this.stok--;
  }

	public Buku(String judulBuku, String ISBN, String penulis, String penerbit, String volume, int stok) {
		this.judulBuku = judulBuku;
		this.ISBN = ISBN;
		this.penulis = penulis;
		this.penerbit = penerbit;
		this.volume = volume;
    this.stok = stok;
	}
}
