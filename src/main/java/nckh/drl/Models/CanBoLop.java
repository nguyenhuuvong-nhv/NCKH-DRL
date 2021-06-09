package nckh.drl.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;

@Entity
@Table(name= "canbolop")
public class CanBoLop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "masinhvien")
	private SinhVien sinhVien;
	
	@ManyToOne
	@JoinColumn(name = "malopsinhhoat")
	private LopSinhHoat lopSinhHoat;
	
	@Column(name="ngaybatdau")
	private Date ngayBatDau;
	
	@Column(name="ngayketthuc")
	private Date ngayKetThuc;
	
	@Column(name="trangthai")
	private int trangThai;
	
	public CanBoLop() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SinhVien getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}

	public LopSinhHoat getLopSinhHoat() {
		return lopSinhHoat;
	}

	public void setLopSinhHoat(LopSinhHoat lopSinhHoat) {
		this.lopSinhHoat = lopSinhHoat;
	}

	public Date getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	
	

}
