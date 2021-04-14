package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="DIEMHOCTAP")
public class Diemhoctap {
	
	@Id
	@Column(name = "MASINHVIEN")
	private String maSinhVien;
	
	@Column(name = "MAHOCKY")
	private String maHocKy;
	
	@Column(name = "DIENHOCTAP")
	private float diemHocTap;
	
	public Diemhoctap() {
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

	public float getDiemHocTap() {
		return diemHocTap;
	}

	public void setDiemHocTap(float diemHocTap) {
		this.diemHocTap = diemHocTap;
	}
	

}
