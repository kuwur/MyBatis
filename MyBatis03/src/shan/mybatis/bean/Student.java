package shan.mybatis.bean;

import lombok.Data;

@Data
public class Student {
	
	private int id;
	private String name;
	private String password;
	private String department;
	private Teacher teacher;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", department=" + department
				+ ", teacher=" + teacher + "]";
	}
	
	
	
}
