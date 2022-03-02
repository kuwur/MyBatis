package shian.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import shian.mybatis.bean.User;

public interface UserDao {
	List<User> getUserList();
//	@Select(value = "select * from [user] where name = #{name}")
	User getUserById(int id);
	List<User> getUserLike(String name);
	int addUser(User user);
	int addUser2(Map<String,Object> map);
	int updateUser(User user);
	int deleteUser(int id);
}
