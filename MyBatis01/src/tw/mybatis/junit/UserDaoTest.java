package tw.mybatis.junit;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import tw.mybatis.bean.User;
import tw.mybatis.dao.UserDao;
import tw.mybatis.util.MyBatisUtil;

public class UserDaoTest {

	@Test
	public void test() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		List<User> userList = userDao.getUserList();
		for(User user: userList) {
			System.out.println(user.toString());
		}	
		
		sqlSession.close();
	}

}
