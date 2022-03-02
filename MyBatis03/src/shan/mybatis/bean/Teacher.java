package shan.mybatis.bean;

import java.util.List;

import lombok.Data;

@Data
public class Teacher {
	
	private int id;
	private String name;
	private String password;
	private List<Student> student;
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", password=" + password + ", student=" + student + "]";
	}
	
	
}
