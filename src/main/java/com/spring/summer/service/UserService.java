package com.spring.summer.service;

import com.spring.summer.mybatis.model.UserDomain;
import com.spring.summer.mybatis.repository.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserDomain findOneById(String id) {
        return userMapper.findOneById(id);
    }

    public List<?> findAll() {
        return userMapper.findAll();
    }

    public void update(UserDomain userDomain) {
        userMapper.update(userDomain);
    }

    public void delete(String id) {
        userMapper.delete(id);
    }

    public void insert(UserDomain userDomain) {
        userMapper.save(userDomain);
    }

}
