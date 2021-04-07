package nckh.drl.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DSNOPHOCPHI")
public class DSNophocphi {

	private String maSinhVien;
	private String maHocKy;
	private String status;
	
	public DSNophocphi() {
		// TODO Auto-generated constructor stub
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getMaHocKy() {
		return maHocKy;
	}

	public void setMaHocKy(String maHocKy) {
		this.maHocKy = maHocKy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
