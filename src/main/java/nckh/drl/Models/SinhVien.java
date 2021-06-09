package nckh.drl.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "sinhvien")
public class SinhVien {
	@Id
	@Column(name="masinhvien")
	private String maSinhVien;
	
	@Column(name="tensinhvien")
	private String tenSinhVien;
	
	
	@Column(name="ngaysinh")
	private Date ngaySinh;
	
	@Column(name="sodienthoai")
	private String soDienThoai;
	
	@Column(name="gmail")
	private String gmail;
	
	@ManyToOne
	@JoinColumn(name = "malop")
	private LopSinhHoat lopSinhHoat;
	
	@Column(name="trangthai")
	private int trangThai;
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getTenSinhVien() {
		return tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public LopSinhHoat getLopSinhHoat() {
		return lopSinhHoat;
	}

	public void setLopSinhHoat(LopSinhHoat lopSinhHoat) {
		this.lopSinhHoat = lopSinhHoat;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	
	

	
}
