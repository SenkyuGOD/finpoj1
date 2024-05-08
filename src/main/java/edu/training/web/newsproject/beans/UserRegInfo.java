package edu.training.web.newsproject.beans;

import java.io.Serializable;
import java.util.Objects;

public class UserRegInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userName;
    private String password;
    private String email;

    public UserRegInfo() {
    }

    public UserRegInfo(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRegInfo that = (UserRegInfo) o;
        return Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, email);
    }

    @Override
    public String toString() {
        return "UserRegInfo{" + "email='" + email + '\'' + ", userName='" + userName + '\'' + ", password='" + password + '\'' + '}';
    }
}
