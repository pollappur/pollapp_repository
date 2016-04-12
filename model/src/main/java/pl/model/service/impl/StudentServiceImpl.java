/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.model.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import pl.hibernate.HibernateUtil;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.EntityMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.tuple.entity.PojoEntityTuplizer;
import org.springframework.beans.factory.annotation.Autowired;
import pl.model.Student;
import pl.model.service.StudentService;


/**
 *
 * @author Komputer Implementacja StudentService polaczona z hibernete i
 * wykonujaca operacje na bazie danych
 */
public class StudentServiceImpl implements StudentService {

    SessionFactory sessionfactory;
    //zmienna przechowujaca aktualny stan sesji
    Session session = null;
        // zmienna przechowujaca biezaca transakcje
    Transaction tx = null;

    @Override
    public Student findById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student findByLogin(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public boolean deleteStudentById(long id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Object o = session.load(Student.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(o);
        tx.commit();
        HibernateUtil.shutdown();

        return false;
    }

    @Override
    public boolean addStudent(String login, String password, String email, long id_group, Session session) {
        Student student = new Student();
        student.setLogin(login);
        student.setPassword(password);
        student.setEmail(email);
        student.setPassword(password);
        session.save(student);
        return false;
    }

    @Override
    public boolean addStudent(List<Student> student) {
        //utworzenie sesji na podstawie obiektu klasy HibernetaUtil
        sessionfactory = HibernateUtil.getSessionFactory();
        session = sessionfactory.openSession(); // open a new Session
        //rozpoczecie tranzakcji na bazie danych
        tx = session.getTransaction();
        session.beginTransaction();
        //zapisanie obiektu student
 
        for (Student student1 : student) {
            
              session.save("pl.model.Student",student1.toMap());
        }
        

        //zatwierdzenie transakcji
        tx.commit();
        //zamkniecie sesji
        HibernateUtil.shutdown();

        return false;
    }

}
