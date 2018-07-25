package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserDao userDao;
    @Transactional
    @Override
    public List<User> findAllUserList() {
        return userDao.findAllUser();
    }

    @Override
    public User findUserByGid(String author) {
        return userDao.findUserByGid(author);
    }
}
