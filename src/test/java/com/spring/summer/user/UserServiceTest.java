package com.spring.summer.user;

import com.spring.summer.mybatis.model.UserDomain;
import com.spring.summer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void getAllUser() {
        List<?> users = userService.findAll();
        log.info("user : {}", users);
    }

    @Test
    public void getUser() {
        UserDomain user = userService.findOneById("test");
        log.info("user : {}", user);
    }

    @Test
    public void update() {
        UserDomain user = userService.findOneById("test");
        user.setName("changename");
        userService.update(user);
        log.info("user : {}", userService.findOneById("test"));
    }

    @Test
    public void insert() {
        UserDomain user = new UserDomain();
        user.setId("test4");
        user.setName("testman4");
        user.setPassword("!23123");
        userService.insert(user);
        log.info("user : {}", userService.findOneById("test4"));
    }

    @Test
    public void delete() {
        userService.delete("test");
        log.info("user : {}", userService.findOneById("test"));
    }

}
