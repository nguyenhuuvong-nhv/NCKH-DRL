package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIEMRENLUYEN")
public class Diemrenluyen {
	
	@Id
	@Column(name = "MANOIDUNG")
	private String maNoiDung;
	
	@Column(name = "MASINHVIEN")
	private String maSinhVien;	
	
	@Column(name="MAHOCKY")
	private String maHocKy;
	
	@Column(name = "DIEMCHAMLAN1")
	private int diemChamLan1;
	
	@Column(name = "DIEMCHAMLAN2")
	private int diemChamLan2;
	
	@Column(name = "DIEMCHAMLAN3")
	private int diemChamLan3;
	
	public Diemrenluyen() {
		// TODO Auto-generated constructor stub
	}

	public String getMaNoiDung() {
		return maNoiDung;
	}

	public void setMaNoiDung(String maNoiDung) {
		this.maNoiDung = maNoiDung;
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

	public int getDiemChamLan1() {
		return diemChamLan1;
	}

	public void setDiemChamLan1(int diemChamLan1) {
		this.diemChamLan1 = diemChamLan1;
	}

	public int getDiemChamLan2() {
		return diemChamLan2;
	}

	public void setDiemChamLan2(int diemChamLan2) {
		this.diemChamLan2 = diemChamLan2;
	}

	public int getDiemChamLan3() {
		return diemChamLan3;
	}

	public void setDiemChamLan3(int diemChamLan3) {
		this.diemChamLan3 = diemChamLan3;
	}
	

}
