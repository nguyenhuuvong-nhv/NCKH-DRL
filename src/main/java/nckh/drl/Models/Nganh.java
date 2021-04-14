package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NGANH")
public class Nganh {
	
	@Id
	@Column(name="MANGANH")
	private String maNganh;
	@Column(name="TENNGANH")
	private String tenNganh;
	@Column(name="MAKHOA")
	private String maKhoa;
	
	public Nganh() {
		// TODO Auto-generated constructor stub
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	public String getMaKhoa() {
		return maKhoa;
	}

	public void setMaKhoa(String maKhoa) {
		this.maKhoa = maKhoa;
	}
	

}
