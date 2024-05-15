package com.odyssey.todomanagement.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class EmployeeToDo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "empname")
	private String emp_name;
	
	@Column(name = "empposition")
	private String emp_position;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "CustomerTodos", joinColumns = 
	@JoinColumn(name = "EmployeeId", referencedColumnName = "id"),
	inverseJoinColumns = 
	@JoinColumn(name = "ToDoId", referencedColumnName = "id"))
	private List<ToDo> todoslist ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_position() {
		return emp_position;
	}

	public void setEmp_position(String emp_position) {
		this.emp_position = emp_position;
	}

	public List<ToDo> getTodoslist() {
		return todoslist;
	}

	public void setTodoslist(List<ToDo> todoslist) {
		this.todoslist = todoslist;
	}

	@Override
	public String toString() {
		return "EmployeeToDo [id=" + id + ", emp_name=" + emp_name + ", emp_position=" + emp_position + "]";
	} 	
}
