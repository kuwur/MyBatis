package tw.mybatis.dao;

import java.util.List;

import tw.mybatis.bean.User;

public interface UserDao {
	List<User> getUserList();
}
