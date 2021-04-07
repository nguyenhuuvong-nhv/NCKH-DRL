package nckh.drl.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="DANHMUCDANHGIA")
public class Danhmucdanhgia {
	
	private String maDanhMuc;
	private String tenDanhMuc;
	
	public Danhmucdanhgia() {
		// TODO Auto-generated constructor stub
	}

	public String getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(String maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	public String getTenDanhMuc() {
		return tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	

}
