/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Komputer
 */
public class Student implements Serializable {

    private long id_student;
    private String login;
    private String password;
    private String email;
    private long id_group;
    
   

    public Student(long id_student, String login, String password, String email, long id_group) {
        this.id_student = id_student;
        this.login = login;
        this.password = password;
        this.email = email;
        this.id_group = id_group;
    }

    public Student() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId_group() {
        return id_group;
    }

    public void setId_group(long id_group) {
        this.id_group = id_group;
    }

    public Student(long id, String login) {
        this.id_student = id;
        this.login = login;

    }

    public long getId() {
        return id_student;
    }

    public void setId(long id) {
        this.id_student = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Student{" + "id_student=" + id_student + ", login=" + login + ", password=" + password + ", email=" + email + ", id_group=" + id_group + '}';
    }

   

    public Map<String, String> toMap() {
        Map student = new HashMap();
        Set<Student> ses=new HashSet<Student>(); 
        
        student.put("id_student", id_student);
        student.put("login", login);
        student.put("password", password);
        student.put("email", email);
        student.put("id_group", id_group);
        return student;
    }
    
 

}
