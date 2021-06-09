package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "noidungdanhgia")
public class NoiDungDanhGia {
	@Id
	@Column(name="manoidung")
	private String maNoiDung;
	@ManyToOne
	@JoinColumn(name = "madanhmucdanhgia")
	private DanhMucDanhGia danhMucDanhGia;
	@Column(name="tennoidung")
	private String tenNoiDung;
	@Column(name="diemtoida")
	private int diemToiDa;
	
	public NoiDungDanhGia() {
		// TODO Auto-generated constructor stub
	}

	public String getMaNoiDung() {
		return maNoiDung;
	}

	public void setMaNoiDung(String maNoiDung) {
		this.maNoiDung = maNoiDung;
	}

	public DanhMucDanhGia getDanhMucDanhGia() {
		return danhMucDanhGia;
	}

	public void setDanhMucDanhGia(DanhMucDanhGia danhMucDanhGia) {
		this.danhMucDanhGia = danhMucDanhGia;
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
