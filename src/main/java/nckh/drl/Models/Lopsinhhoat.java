package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOPSINHHOAT")
public class Lopsinhhoat {
	
	@Id
	@Column(name="MALOP")
	private String maLop;
	@Column(name="MANGANH")
	private String maNganh;
	
	public Lopsinhhoat() {
		// TODO Auto-generated constructor stub
	}

	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}
	

}
