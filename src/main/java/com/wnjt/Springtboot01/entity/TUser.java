package com.wnjt.Springtboot01.entity;

public class TUser {
    private Integer id;
    private String username;
    private String password;
    private String address;
    private String love;

    public TUser(Integer id, String username, String password, String address, String love) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.love = love;
    }

    public TUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    @Override
    public String toString() {
        return "Tuser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", love='" + love + '\'' +
                '}';
    }
}
