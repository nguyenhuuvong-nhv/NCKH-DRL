package nckh.drl.Models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name= "chitietphieuchamdiem")
public class ChiTietPhieuChamDiem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "maphieucham")
	private PhieuChamDiem phieuChamDiem;
	
	@ManyToOne
	@JoinColumn(name = "manoidung")
	private NoiDungDanhGia noiDungDanhGia;
	
	@Column(name = "diemtucham")
	private int diemTuCham;
	
	@Column(name = "diemcuacbl")
	private int diemCuaCBL;
	
	@Column(name = "diemcuagvcn")
	private int diemCuaGVCN;

	@OneToMany(mappedBy = "chiTietPhieuChamDiem",fetch = FetchType.LAZY)
	private Collection<MinhChung> minhChungs;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PhieuChamDiem getPhieuChamDiem() {
		return phieuChamDiem;
	}

	public void setPhieuChamDiem(PhieuChamDiem phieuChamDiem) {
		this.phieuChamDiem = phieuChamDiem;
	}

	public NoiDungDanhGia getNoiDungDanhGia() {
		return noiDungDanhGia;
	}

	public void setNoiDungDanhGia(NoiDungDanhGia noiDungDanhGia) {
		this.noiDungDanhGia = noiDungDanhGia;
	}

	public int getDiemTuCham() {
		return diemTuCham;
	}

	public void setDiemTuCham(int diemTuCham) {
		this.diemTuCham = diemTuCham;
	}

	public int getDiemCuaCBL() {
		return diemCuaCBL;
	}

	public void setDiemCuaCBL(int diemCuaCBL) {
		this.diemCuaCBL = diemCuaCBL;
	}

	public int getDiemCuaGVCN() {
		return diemCuaGVCN;
	}

	public void setDiemCuaGVCN(int diemCuaGVCN) {
		this.diemCuaGVCN = diemCuaGVCN;
	}
	
	
}
