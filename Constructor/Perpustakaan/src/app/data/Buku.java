package app.data;

public class Buku{
  private String judulBuku;
  private String ISBN;
  private String penulis;
  private String penerbit;
  private String halamanBuku;



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

	public String getHalamanBuku() {
		return halamanBuku;
	}

	public void setHalamanBuku(String halamanBuku) {
		this.halamanBuku = halamanBuku;
	}

	/**
	* Default empty Buku constructor
	*/
	public Buku() {
		super();
	}

	/**
	* Default Buku constructor
	*/
	public Buku(String judulBuku, String ISBN, String penulis, String penerbit, String halamanBuku) {
		this.judulBuku = judulBuku;
		this.ISBN = ISBN;
		this.penulis = penulis;
		this.penerbit = penerbit;
		this.halamanBuku = halamanBuku;
	}
}
