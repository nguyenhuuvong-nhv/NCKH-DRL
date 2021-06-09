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
@Table(name = "nganh")
public class Nganh {
	
	@Id
	@Column(name="manganh")
	private String maNganh;
	
	@Column(name="tennganh")
	private String tenNganh;
	
	@ManyToOne
	@JoinColumn(name = "makhoa")
	private Khoa khoa;
	
	@OneToMany(mappedBy = "nganh",fetch = FetchType.LAZY)
	private Collection<LopSinhHoat> lopsinhhoats;
	
	public Nganh() {
		// TODO Auto-generated constructor stub
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	public Khoa getKhoa() {
		return khoa;
	}

	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}

	
	

}
