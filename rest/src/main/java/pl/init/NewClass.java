/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.init;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import pl.model.service.impl.StudentServiceImpl;

import pl.hibernate.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pl.model.Student;



/**
 *
 * @author Komputer
 */
public class NewClass {
    public static void main(String[] args) {
 

      
Student a=new Student();
a.setEmail("asd");
a.setLogin("asdasd");
a.setId(34);




List <Student> listOfStudent=new ArrayList<Student>();

listOfStudent.add(new Student(0, "Kamil", "Wiśniewski","kamwisnia@wp.pl" , 0));
listOfStudent.add(new Student(1, "Kamds", "Wiśnisdwski","kamwisadsa@wp.pl" , 0));


StudentServiceImpl aaa=new StudentServiceImpl();
aaa.addStudent(listOfStudent);

//aaa.addStudent(new Student(0, "ADS", "asd", "ads", 2));
//aaa.addStudent2(listOfStudent);
 
 
 
}
}
