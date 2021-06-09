package nckh.drl.Models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="danhmucdanhgia")
public class DanhMucDanhGia {
	
	@Id
	@Column(name="madanhmuc")
	private String maDanhMuc;
	
	@Column(name="tendanhmuc")
	private String tenDanhMuc;
	
	@OneToMany(mappedBy = "danhMucDanhGia",fetch = FetchType.LAZY)
	private Collection<NoiDungDanhGia> noiDungDanhGias;
	
	public DanhMucDanhGia() {
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
