package nckh.drl.Models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="lopsinhhoat")
public class LopSinhHoat {
	
	@Id
	@Column(name="malop")
	private String maLop;
	
	@Column(name="tenlop")
	private String tenLop;
	
	@ManyToOne
	@JoinColumn(name = "manganh")
	private Nganh nganh;
	
	
	
	public LopSinhHoat() {
		// TODO Auto-generated constructor stub
	}

	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public Nganh getNganh() {
		return nganh;
	}

	public void setNganh(Nganh nganh) {
		this.nganh = nganh;
	}

	
	

}
