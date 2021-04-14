package nckh.drl.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;


@Table(name= "CANBOLOP")
public class Canbolop {
	
	@Id
	@Column(name="MASINHVIEN")
	private String maSinhVien;
	
	@Column(name ="MALOPSINHHOAT")
	private String maLopSinhHoat;
	
	@Column(name="STARTTIME")
	private String startTime;
	
	@Column(name="ENDTIME")
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
