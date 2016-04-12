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
public class Answer {
long id_answer;
String answer;

    public Answer(long id_answer, String answer) {
        this.id_answer = id_answer;
        this.answer = answer;
    }



    public long getId_answer() {
        return id_answer;
    }

    public void setId_answer(long id_answer) {
        this.id_answer = id_answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" + "id_answer=" + id_answer + ", answer=" + answer + '}';
    }



    
}
