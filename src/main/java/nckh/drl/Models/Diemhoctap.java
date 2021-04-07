package nckh.drl.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="DIEMHOCTAP")
public class Diemhoctap {
	
	private String maSinhVien;
	private String maHocKy;
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
