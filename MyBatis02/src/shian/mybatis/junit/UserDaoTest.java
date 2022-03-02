package shian.mybatis.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import shian.mybatis.bean.Student;
import shian.mybatis.bean.Teacher;
import shian.mybatis.bean.User;
import shian.mybatis.dao.StudentMapper;
import shian.mybatis.dao.TeacherMapper;
import shian.mybatis.dao.UserDao;
import shian.mybatis.util.MyBatisUtil;

public class UserDaoTest {
	
//	@Test
//	public void testGetStudentForeach() {
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		StudentMapper SM = sqlSession.getMapper(StudentMapper.class);
//		HashMap map = new HashMap();
//		ArrayList list = new ArrayList();
//		list.add(2);
//		list.add(3);
//		map.put("ids", list);
//		List<Student> list2 = SM.getStudentForeach(map);
//		for (Student student : list2) {
//			System.out.println(student.toString());
//		}
//		sqlSession.close();
//	}
	
	
//	@Test
//	public void testSetStudent() {
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		StudentMapper SM = sqlSession.getMapper(StudentMapper.class);
//		HashMap map = new HashMap();
//		map.put("id", 1);
//		map.put("name", "Kevin");
//		
//		SM.setStudent(map);
//		sqlSession.commit();
//		sqlSession.close();
//		
//	}
//	
//	
	@Test
	public void testGetStudentIf() {
		SqlSession SqlSession = MyBatisUtil.getSqlSession();
		StudentMapper SM = SqlSession.getMapper(StudentMapper.class);
		HashMap map = new HashMap();
		map.put("id", 5);
		map.put("name", "Elly");
		
		
		List<Student> list = SM.getStudentIf(map);
		for (Student student : list) {
			System.out.println(student.toString());
		}
		SqlSession.close();
	}
	
	
//	@Test
//	public void testGetUserList() {
//		
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		TeacherMapper tm = sqlSession.getMapper(TeacherMapper.class);
//		List<Teacher> list = tm.getTeacherWithStudent();
//		for (Teacher teacher : list) {
//			for(Student s: teacher.getStudents()) {
//				System.out.println(s);
//			}
//		}
//		sqlSession.close();
//	}

//	@Test
//	public void testGetUserList() {
//		
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		TeacherMapper tm = sqlSession.getMapper(TeacherMapper.class);
//		List<Teacher> list= tm.getTeacher();
//		for (Teacher t :list) {
//			System.out.println(t);
//		}
//		sqlSession.close();
//	}
	
	
//	@Test
//	public void testGetUserList() {
//		
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		StudentMapper SM = sqlSession.getMapper(StudentMapper.class);
//		List<Student> list = SM.getStudent();
//		for(Student s : list) {
//			System.out.println(s);
//		}
//		
//		sqlSession.close();
//	}
	
//	@Test
//	public void testGetUserList() {
//		
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		UserDao userDao = sqlSession.getMapper(UserDao.class);
//		List<User> list = userDao.getUserList();
//		
//		for (User user : list) {
//			System.out.println(user.getName());
//		}
//		sqlSession.close();
//	}
	
//	@Test
//	public void testGetUserById() {
//		
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		UserDao userDao = sqlSession.getMapper(UserDao.class);
//		User user = userDao.getUserById(2);
//		System.out.println(user.getId());
//		sqlSession.close();
//	}
	
//	@Test
//	public void testGetUserLike() {
//		
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		UserDao userDao = sqlSession.getMapper(UserDao.class);
//		List<User> users = userDao.getUserLike("0");
//		for(User user: users) {
//			System.out.println(user.getName());
//		}
//		sqlSession.close();
//	}
	
//	@Test
//	public void testAddUser() {
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		UserDao userDao = sqlSession.getMapper(UserDao.class);
//		int ana = userDao.addUser(new User("number06","1234"));
//		sqlSession.commit();
//		sqlSession.close();
//		System.out.println(ana);
//		
//	}
	
//	@Test
//	public void testAddUser2() {
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		UserDao userDao = sqlSession.getMapper(UserDao.class);
//		Map<String, Object> map = new HashMap<>();
//		map.put("name", "member09");
//		map.put("pwd", "2134");
//		int ana = userDao.addUser2(map);
//		sqlSession.commit();
//		sqlSession.close();
//		System.out.println(ana);
//		
//	}
	
//	@Test
//	public void testUpdateUser() {
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		UserDao userDao = sqlSession.getMapper(UserDao.class);
//		int ana = userDao.updateUser(new User(9,"member06","1234"));
//		sqlSession.commit();
//		sqlSession.close();
//		System.out.println(ana);	
//	}
	
//	@Test
//	public void testDeleteUser() {
//		SqlSession sqlSession = MyBatisUtil.getSqlSession();
//		UserDao userDao = sqlSession.getMapper(UserDao.class);
//		int ana = userDao.deleteUser(9);
//		sqlSession.commit();
//		sqlSession.close();
//		System.out.println(ana);	
//	}
	
	

}
