package LuoJKL.service.service.impl;

import LuoJKL.dao.UserDao;
import LuoJKL.entity.User;
import LuoJKL.service.UserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

@Service("userService")
public class UserServiceimpl implements UserService {

    @Resource
    private UserDao userDao;

    public User getByUserName(String userName) {
        return userDao.getByUserName(userName);
    }
    public User find() {
        return userDao.find();
    }


}