package com.ibeifeng.ssm.service;

import com.ibeifeng.ssm.model.User;

/**
 * Created by zmzy on 2017/2/23.
 */
public interface IUserService {
    public void add(User user);
    public User load(int id);
}
