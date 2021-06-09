package nckh.drl.Models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "khoa")
public class Khoa {

	@Id
	@Column(name="makhoa")
	private String maKhoa;
	
	@Column(name="tenkhoa")
	private String tenKhoa;
	
	@OneToMany(mappedBy = "khoa",fetch = FetchType.LAZY)
	private Collection<Nganh> nganhs;
	
	public Khoa() {
		// TODO Auto-generated constructor stub
	}

	public String getMaKhoa() {
		return maKhoa;
	}

	public void setMaKhoa(String maKhoa) {
		this.maKhoa = maKhoa;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public Collection<Nganh> getNganhs() {
		return nganhs;
	}

	public void setNganhs(Collection<Nganh> nganhs) {
		this.nganhs = nganhs;
	}
	
	
}
