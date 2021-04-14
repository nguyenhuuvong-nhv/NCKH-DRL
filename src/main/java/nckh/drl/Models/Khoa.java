package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KHOA")
public class Khoa {

	@Id
	@Column(name="MAKHOA")
	private String maKhoa;
	@Column(name="TENKHOA")
	private String tenKhoa;
	
	public Khoa() {
		// TODO Auto-generated constructor stub
	}

	public String getMaKhoa() {
		return maKhoa;
	}

	public void setMaKhoa(String maKhoa) {
		this.maKhoa = maKhoa;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}
	
}
