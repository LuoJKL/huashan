package LuoJKL.dao;

import LuoJKL.entity.User;


public interface UserDao {

	public User getByUserName(String userName);

	public User find();

}
