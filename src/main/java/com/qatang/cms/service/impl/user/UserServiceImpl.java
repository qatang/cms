package com.qatang.cms.service.impl.user;

import com.qatang.cms.dao.user.UserDao;
import com.qatang.cms.entity.user.User;
import com.qatang.cms.form.user.UserForm;
import com.qatang.cms.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by qatang on 14-6-12.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User get(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User update(User user) {
        return userDao.save(user);
    }

    @Override
    public User getByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User getByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public Page<User> getAll(UserForm userForm) {
        return userDao.findAll(userForm);
    }

}
