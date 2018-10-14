package rest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {


    @Id

    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String sex;
    private String email;
    private String dateofbirth;

    public User() {

    }


    public User(String username, String password, String firstname, String lastname, String sex, String email, String dateofbirth) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
        this.email = email;
        this.dateofbirth = dateofbirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", dateOfBirth='" + dateofbirth + '\'' +
                '}';
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
}