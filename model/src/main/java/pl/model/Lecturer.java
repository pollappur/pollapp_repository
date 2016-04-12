/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Komputer
 */
@Entity
@Table(name="LECTURER")
public class Lecturer {
    
    
    
    @Id
    @GeneratedValue
    private long id_lecturer;
    
    @Column
    private String name,surname,title,email;

    public Lecturer() {
    }

    public Lecturer(long id_lecturer, String name, String surname, String title, String email) {
        this.id_lecturer = id_lecturer;
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.email = email;
    }

    public long getId_lecturer() {
        return id_lecturer;
    }

    public void setId_lecturer(long id_lecturer) {
        this.id_lecturer = id_lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Lecturer{" + "id_lecturer=" + id_lecturer + ", name=" + name + ", surname=" + surname + ", title=" + title + ", email=" + email + '}';
    }
    
    
    
}
