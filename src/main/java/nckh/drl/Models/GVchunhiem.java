package nckh.drl.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "GVCHUNHIEM")
public class GVchunhiem {
	private String maGiaoVien;
	private String maLopSinhHoat;
	private String startTime;
	private String endTime;
	
	public GVchunhiem() {
		// TODO Auto-generated constructor stub
	}

	public String getMaGiaoVien() {
		return maGiaoVien;
	}

	public void setMaGiaoVien(String maGiaoVien) {
		this.maGiaoVien = maGiaoVien;
	}

	public String getMaLopSinhHoat() {
		return maLopSinhHoat;
	}

	public void setMaLopSinhHoat(String maLopSinhHoat) {
		this.maLopSinhHoat = maLopSinhHoat;
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
