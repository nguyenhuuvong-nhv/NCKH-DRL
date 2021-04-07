package nckh.drl.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LOPSINHHOAT")
public class Lopsinhhoat {
	
	private String maLop;
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
