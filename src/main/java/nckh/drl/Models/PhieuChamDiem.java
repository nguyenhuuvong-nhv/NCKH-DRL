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

@Entity
@Table(name = "phieuchamdiem")
public class PhieuChamDiem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name = "masinhvien")
	private SinhVien sinhVien;
	
	
	@ManyToOne
	@JoinColumn(name = "madotchamdiem")
	private DotChamDiem dotChamDiem;
	
	@Column(name = "ngaycham")
	private Date ngayCham;
	
	@Column(name = "ngaycapnhat")
	private Date ngayCapNhat;
	
	@Column(name = "nguoicapnhat")
	private String nguoiCapNhat;
	
	@Column(name = "tongDiem")
	private int tongDiem;
	
	public PhieuChamDiem() {
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

	public DotChamDiem getDotChamDiem() {
		return dotChamDiem;
	}

	public void setDotChamDiem(DotChamDiem dotChamDiem) {
		this.dotChamDiem = dotChamDiem;
	}

	public Date getNgayCham() {
		return ngayCham;
	}

	public void setNgayCham(Date ngayCham) {
		this.ngayCham = ngayCham;
	}

	public Date getNgayCapNhat() {
		return ngayCapNhat;
	}

	public void setNgayCapNhat(Date ngayCapNhat) {
		this.ngayCapNhat = ngayCapNhat;
	}

	public String getNguoiCapNhat() {
		return nguoiCapNhat;
	}

	public void setNguoiCapNhat(String nguoiCapNhat) {
		this.nguoiCapNhat = nguoiCapNhat;
	}

	public int getTongDiem() {
		return tongDiem;
	}

	public void setTongDiem(int tongDiem) {
		this.tongDiem = tongDiem;
	}

	
	

}
