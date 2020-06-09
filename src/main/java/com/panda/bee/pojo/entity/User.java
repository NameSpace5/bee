package com.panda.bee.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author
 */
public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 电话/手机
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 最后一次登陆时间
     */
    private Date lastLoginTime;

    /**
     * 最后一次登录IP
     */
    private String lastLoginIp;

    /**
     * 用户类型：小程序：wx-mini_program/网站注册： web-user

     */
    private Integer userType;

    /**
     * 性别 男-1 女-2 保密-0
     */
    private Integer gender;

    /**
     * 语言：微信注册产生此字段
     */
    private String language;

    /**
     * 用户所在地市
     */
    private String city;

    /**
     * 用户所在省份
     */
    private String province;

    /**
     * 用户所在国籍
     */
    private String country;

    /**
     * 用户头像地址
     */
    private String avatarUrl;

    /**
     * 微信登录用得到
     */
    private String openid;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}