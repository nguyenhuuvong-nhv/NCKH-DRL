package nckh.drl.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "CANBOLOP")
public class Canbolop {
	private String maSinhVien;
	private String maLopSinhHoat;
	private String startTime;
	private String endTime;
	
	public Canbolop() {
		// TODO Auto-generated constructor stub
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
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
