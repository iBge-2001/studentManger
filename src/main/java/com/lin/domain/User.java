package com.lin.domain;


public class User {
    private long id;
    private String user;
    private String password;
    private int type;
    private String newPassword;
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public User(long id, String user, String password, int type, String newPassword) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.type = type;
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id + '\''+
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }
}
