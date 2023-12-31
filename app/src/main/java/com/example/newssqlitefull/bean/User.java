package com.example.newssqlitefull.bean;

import org.litepal.crud.DataSupport;

import java.io.Serializable;

/**
 * 用户
 */
public class User extends DataSupport implements Serializable {
    private Integer id;
    private String account;//账号
    private String password;//密码
    private String nickName;//昵称
    private Integer age;//年龄
    private String email;//邮箱
    private Integer userType;//用户类型

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public User(Integer id, String account, String password, String nickName, Integer age, String email, Integer userType) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.nickName = nickName;
        this.age = age;
        this.email = email;
        this.userType = userType;
    }
}
