package shan.mybatis.dao;

import java.util.List;
import java.util.Map;

import shan.mybatis.bean.Student;

public interface StudentMapper {
	Student getStudentById(int id);
	List<Student> getStudentWhere(Map map);
	List<Student> getStudentForeach(Map map);
	List<Map> getStudentResultmap(int id);
	void updateStudent(Map map);
}
