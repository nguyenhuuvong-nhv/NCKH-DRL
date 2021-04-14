package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HOCKY")
public class Hocky {
	
	@Id
	@Column(name="MAHOCKY")
	private String maHocKy;
	@Column(name="STARTTIME")
	private String startTime;
	@Column(name="ENDTIME")
	private String endTime;
	
	public Hocky() {
		// TODO Auto-generated constructor stub
	}
	public String getMaHocKy() {
		return maHocKy;
	}
	public void setMaHocKy(String maHocKy) {
		this.maHocKy = maHocKy;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	

}
