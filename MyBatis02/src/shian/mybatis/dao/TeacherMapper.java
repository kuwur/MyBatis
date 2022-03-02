package shian.mybatis.dao;

import java.util.List;

import shian.mybatis.bean.Teacher;

public interface TeacherMapper {
	List<Teacher> getTeacher();
	List<Teacher> getTeacherWithStudent();
}
