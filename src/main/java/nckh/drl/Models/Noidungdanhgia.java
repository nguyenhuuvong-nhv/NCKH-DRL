package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "NOIDUNGDANHGIA")
public class Noidungdanhgia {
	@Id
	@Column(name="MANOIDUNG")
	private String maNoiDung;
	@Column(name="MADANHMUC")
	private String maDanhMuc;
	@Column(name="TENNOIDUNG")
	private String tenNoiDung;
	@Column(name="DIEMTOIDA")
	private int diemToiDa;
	
	public Noidungdanhgia() {
		// TODO Auto-generated constructor stub
	}

	public String getMaNoiDung() {
		return maNoiDung;
	}

	public void setMaNoiDung(String maNoiDung) {
		this.maNoiDung = maNoiDung;
	}

	public String getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(String maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	public String getTenNoiDung() {
		return tenNoiDung;
	}

	public void setTenNoiDung(String tenNoiDung) {
		this.tenNoiDung = tenNoiDung;
	}

	public int getDiemToiDa() {
		return diemToiDa;
	}

	public void setDiemToiDa(int diemToiDa) {
		this.diemToiDa = diemToiDa;
	}
	

}
