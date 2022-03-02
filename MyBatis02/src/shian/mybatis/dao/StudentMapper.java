package shian.mybatis.dao;

import java.util.List;
import java.util.Map;

import shian.mybatis.bean.Student;

public interface StudentMapper {
	List<Student> getStudent();
	List<Student> getStudentBy(Map map);
	List<Student> getStudentIf(Map map);
	List<Student> getStudentForeach(Map map);
	void setStudent(Map map);
	
}
