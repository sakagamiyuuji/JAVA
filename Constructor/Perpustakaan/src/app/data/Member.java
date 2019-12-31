package app.data;

public class Member{
  private String idMember;
  private String namaMember;
  private String umur;
  private String nickname;

	public Member(String idMember, String namaMember, String umur, String nickname) {
		this.idMember = idMember;
		this.namaMember = namaMember;
		this.umur = umur;
		this.nickname = nickname;
	}

	public String getIdMember() {
		return idMember;
	}

	public void setIdMember(String idMember) {
		this.idMember = idMember;
	}

	public String getNamaMember() {
		return namaMember;
	}

	public void setNamaMember(String namaMember) {
		this.namaMember = namaMember;
	}

	public String getUmur() {
		return umur;
	}

	public void setUmur(String umur) {
		this.umur = umur;
	}

	public String getNickname() {
		return nickname;
	}

  public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
