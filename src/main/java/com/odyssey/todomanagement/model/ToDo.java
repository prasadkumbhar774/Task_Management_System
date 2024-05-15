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

import org.springframework.context.annotation.Scope;

@Entity
@Scope("session")
public class ToDo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String todo;

	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "CustomerTodos", joinColumns =
	@JoinColumn(name = "EmployeeId", referencedColumnName = "id"),
	inverseJoinColumns =
	@JoinColumn(name = "ToDoId", referencedColumnName = "id"))
	private List<EmployeeToDo> employeeToDo;
	
	
	public List<EmployeeToDo> getEmployeeToDo() {
		return employeeToDo;
	}

	public void setEmployeeToDo(List<EmployeeToDo> employeeToDo) {
		this.employeeToDo = employeeToDo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", toDo=" + todo + "]";
	}

}
