package com.odyssey.todomanagement.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author amisale
 *
 */
@Entity
@Table(name = "Task")
public class Task {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column (name = "description")
	private String task_descrption;
	
	@Column (name = "due_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate due_date;
	
	@Column(name = "created_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate created_date;
	
	@Column(name = "email")
	private String email;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "useremail", nullable = false)
    private Staff staff;
	
	

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		
		this.staff = staff;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Task() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask_descrption() {
		return task_descrption;
	}

	public void setTask_descrption(String task_descrption) {
		this.task_descrption = task_descrption;
	}

	public LocalDate getDue_date() {
		return due_date;
	}

	public void setDue_date(LocalDate due_date) {
		this.due_date = due_date;
	}

	public LocalDate getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDate created_date) {
		this.created_date = created_date;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", task_descrption=" + task_descrption + ", due_date=" + due_date + ", created_date="
				+ created_date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created_date == null) ? 0 : created_date.hashCode());
		result = prime * result + ((due_date == null) ? 0 : due_date.hashCode());
		result = prime * result + id;
		result = prime * result + ((task_descrption == null) ? 0 : task_descrption.hashCode());
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
		Task other = (Task) obj;
		if (created_date == null) {
			if (other.created_date != null)
				return false;
		} else if (!created_date.equals(other.created_date))
			return false;
		if (due_date == null) {
			if (other.due_date != null)
				return false;
		} else if (!due_date.equals(other.due_date))
			return false;
		if (id != other.id)
			return false;
		if (task_descrption == null) {
			if (other.task_descrption != null)
				return false;
		} else if (!task_descrption.equals(other.task_descrption))
			return false;
		return true;
	}
	
	

}
