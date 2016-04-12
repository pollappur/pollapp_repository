/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Komputer
 */
public class Group {
    private long id_group;
    private String name,year,fiel_of_study;
    private Set<Student> student = new HashSet<Student>(0);

    public Group() {
    }

    public Group(long id_group, String name, String year, String fiel_of_study) {
        this.id_group = id_group;
        this.name = name;
        this.year = year;
        this.fiel_of_study = fiel_of_study;
    }
    
    

    public long getId_group() {
        return id_group;
    }

    public void setId_group(long id_group) {
        this.id_group = id_group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFiel_of_study() {
        return fiel_of_study;
    }

    public void setFiel_of_study(String fielOfStudty) {
        this.fiel_of_study = fielOfStudty;
    }
    
    
    
}
