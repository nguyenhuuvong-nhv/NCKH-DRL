package nckh.drl.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dotchamdiem")
public class DotChamDiem {
	
	@Id
	@Column(name="madotchamdiem")
	private String maDotChamDiem;
	
	@Column(name="ngaytao")
	private Date ngayTao;
	
	@ManyToOne
	@JoinColumn(name = "nguoitao")
	private Admin admin;
	
	@Column(name="ngaybatdau")
	private Date ngayBatDau;
	
	@Column(name="ngayKetThuc")
	private Date ngayKetThuc;
	
	@Column(name="trangthai")
	private int trangthai;
	
	public DotChamDiem() {
		// TODO Auto-generated constructor stub
	}

	public String getMaDotChamDiem() {
		return maDotChamDiem;
	}

	public void setMaDotChamDiem(String maDotChamDiem) {
		this.maDotChamDiem = maDotChamDiem;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
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

	public int getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
	
	
	

}
