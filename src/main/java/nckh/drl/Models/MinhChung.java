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
@Table(name="minhchung")
public class MinhChung {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "machitietcham")
	private ChiTietPhieuChamDiem chiTietPhieuChamDiem;
	
	@Column(name="fileminhchung")
	private String fileMinhChung;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ChiTietPhieuChamDiem getChiTietPhieuChamDiem() {
		return chiTietPhieuChamDiem;
	}

	public void setChiTietPhieuChamDiem(ChiTietPhieuChamDiem chiTietPhieuChamDiem) {
		this.chiTietPhieuChamDiem = chiTietPhieuChamDiem;
	}

	public String getFileMinhChung() {
		return fileMinhChung;
	}

	public void setFileMinhChung(String fileMinhChung) {
		this.fileMinhChung = fileMinhChung;
	}
	
	
}
