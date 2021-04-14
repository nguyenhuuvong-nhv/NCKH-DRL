package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DSNOPHOCPHI")
public class DSNophocphi {

	@Id
	@Column(name="MASINHVIEN")
	private String maSinhVien;
	@Column(name="MAHOCKY")
	private String maHocKy;
	@Column(name="STATUS")
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
