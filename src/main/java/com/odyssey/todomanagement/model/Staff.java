package com.odyssey.todomanagement.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Staff")
public class Staff {

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "staff_name")
	private String staff_name;

	@Column(name = "DOB")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;

	@Column(name = "hired_Date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate hiredDate;

	@Column(name = "Department")
	private String department;
	
	@Column(name = "useremail")
	private String useremail;

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	@Column(name = "picture")
	private String picture;

	public Staff() {
		super();
	}

	public Staff(int id, String staff_name, LocalDate dob, LocalDate hiredDate, String department, String picture) {
		super();
		this.id = id;
		this.staff_name = staff_name;
		this.dob = dob;
		this.hiredDate = hiredDate;
		this.department = department;
		this.picture = picture;
	}
	
	

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(LocalDate hiredDate) {
		this.hiredDate = hiredDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", staff_name=" + staff_name + ", dob=" + dob + ", hiredDate=" + hiredDate
				+ ", department=" + department + ", picture=" + picture + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((hiredDate == null) ? 0 : hiredDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((picture == null) ? 0 : picture.hashCode());
		result = prime * result + ((staff_name == null) ? 0 : staff_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (hiredDate == null) {
			if (other.hiredDate != null)
				return false;
		} else if (!hiredDate.equals(other.hiredDate))
			return false;
		if (id != other.id)
			return false;
		if (picture == null) {
			if (other.picture != null)
				return false;
		} else if (!picture.equals(other.picture))
			return false;
		if (staff_name == null) {
			if (other.staff_name != null)
				return false;
		} else if (!staff_name.equals(other.staff_name))
			return false;
		return true;
	}

}
