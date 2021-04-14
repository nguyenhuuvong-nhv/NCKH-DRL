package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "GIAOVIEN")
public class Giaovien {
	
	@Id
	@Column(name="MAGIAOVIEN")
	private String maGiaoVien;
	@Column(name="TENGIAOVIEN")
	private String tenGiaoVien;
	@Column(name="NGAYSINH")
	private String ngaySinh;
	@Column(name="SODIENTHOAI")
	private String soDienThoai;
	@Column(name="GMAIL")
	private String gmail;
	@Column(name="STATUS")
	private String status;
	
	public Giaovien() {
		// TODO Auto-generated constructor stub
	}

	public String getMaGiaoVien() {
		return maGiaoVien;
	}

	public void setMaGiaoVien(String maGiaoVien) {
		this.maGiaoVien = maGiaoVien;
	}

	public String getTenGiaoVien() {
		return tenGiaoVien;
	}

	public void setTenGiaoVien(String tenGiaoVien) {
		this.tenGiaoVien = tenGiaoVien;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
