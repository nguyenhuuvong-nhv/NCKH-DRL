package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tinhtrangbhyt")
public class TinhTrangBHYT {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "masinhvien")
	private SinhVien sinhVien;
	
	
	@ManyToOne
	@JoinColumn(name = "dotchamdiem")
	private DotChamDiem dotChamDiem;
	
	@Column(name="trangthai")
	private int trangthai;
	
	

	public TinhTrangBHYT() {
		
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

	public int getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
	
	
}
