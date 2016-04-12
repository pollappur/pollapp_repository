/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.model;

/**
 *
 * @author Kamil
 */
public class Question {
    long id_question;
    String question;

    
    
    public Question(long id_question, String question) {
        this.id_question = id_question;
        this.question = question;
    }
    

    public long getId_question() {
        return id_question;
    }

    public void setId_question(long id_question) {
        this.id_question = id_question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" + "id_question=" + id_question + ", question=" + question + '}';
    }
    
    
    
}
