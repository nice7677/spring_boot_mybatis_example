package com.spring.summer.mybatis.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("user")
public class UserDomain implements Serializable {

    private String id;
    private String password;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public UserDomain() {
    }

    public UserDomain(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
