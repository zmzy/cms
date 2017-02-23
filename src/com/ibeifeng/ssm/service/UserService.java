package com.ibeifeng.ssm.service;

import com.ibeifeng.ssm.dao.IUserDao;
import com.ibeifeng.ssm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zmzy on 2017/2/23.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User load(int id) {
        return userDao.load(id);
    }
}
