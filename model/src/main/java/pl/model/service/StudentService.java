/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.model.service;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import pl.model.Student;

/**
 *
 * @author Komputer
 */
public interface StudentService {

   public Student findById(long id);
   public Student findByLogin(String login);
   
   public boolean addStudent(String login,String password, String email,long id_group,Session session);
   public boolean addStudent(List <Student> student);
   public boolean deleteStudentById(long id);
   
   
   
    
    
    
}
