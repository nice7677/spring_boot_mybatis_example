package com.spring.summer.mybatis.repository;

import com.spring.summer.mybatis.model.UserDomain;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {

    @Select("select * from \"user\" where id = #{id}")
    UserDomain findOneById(String id);

    @Select("SELECT * FROM \"user\"")
    List<UserDomain> findAll();

    @Insert("insert into \"user\" (id, password, name) values (#{id}, #{password}, #{name})")
    void save(UserDomain userDomain);

    @Update("update \"user\" set password = #{password}, name = #{name} where id =#{id}")
    void update(UserDomain userDomain);

    @Delete("delete from \"user\" where id = #{id}")
    void delete(String id);

}
