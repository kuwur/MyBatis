package shan.mybatis.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import shan.mybatis.bean.Student;
import shan.mybatis.dao.StudentMapper;
import shan.mybatis.util.MybatisUtil;

public class MybatisJunit {
	
//	@Test
//	public void getStudentResultmap() {
//		SqlSession sqlSession = MybatisUtil.getSqlSession();
//		StudentMapper ms = sqlSession.getMapper(StudentMapper.class);
//		List<Map> list = ms.getStudentResultmap(1);
//		for (Map map : list) {
//			System.out.println(map.get("sid"));
//			System.out.println(map.get("sname"));
//			System.out.println(map.get("tid"));
//			System.out.println(map.get("tname"));
//		}
//		sqlSession.close();
//	}

//	@Test
//	public void getStudet() {
//		SqlSession sqlSession = MybatisUtil.getSqlSession();
//		StudentMapper SM = sqlSession.getMapper(StudentMapper.class);
//		
//		Student student =  SM.getStudentById(1);
//		System.out.println(student.toString());
//		sqlSession.close();
//	}
	
//	@Test
//	public void getStudentWhere() {
//		SqlSession sqlSession = MybatisUtil.getSqlSession();
//		StudentMapper SM = sqlSession.getMapper(StudentMapper.class);
//		Map map = new HashMap();
//		map.put("id", 2);
////		map.put("name", "Jerry");
////		map.put("department", "biological");
//		
//		List<Student> list =  SM.getStudentWhere(map);
//		for (Student student : list) {
//			System.out.println(student.toString());
//		}
//		
//		sqlSession.close();
//		
//	}
	
	@Test
	public void getStudentForeach() {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		StudentMapper SM = sqlSession.getMapper(StudentMapper.class);
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		Map map = new HashMap();
		map.put("list", list);
		
		
		List<Student> rslist =  SM.getStudentForeach(map);
		for (Student student : rslist) {
			System.out.println(student.toString());
		}
		
		sqlSession.close();
		
	}
	
//	@Test
//	public void updateStudent() {
//		
//		SqlSession sqlSession =  MybatisUtil.getSqlSession();
//		StudentMapper ms = sqlSession.getMapper(StudentMapper.class);
//		
//		Map map = new HashMap();
//		map.put("id", 1);
//		map.put("name", "Stallite");
//		map.put("department", "Architecture");
//		
//		ms.updateStudent(map);
//		
//		sqlSession.commit();
//		sqlSession.close();
//	}
	
	
	
	
	

}
