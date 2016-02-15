/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skillsassessment.model;

import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author alej0
 */
@Stateless
public class QuestionCheckBean implements QuestionBean {

    private int id;
    private int maxGrade;
    private int grade;
    private String job;
    private ArrayList<QuestionItemBean> questionItems;

    public ArrayList<QuestionItemBean> getQuestionItems() {
        return questionItems;
    }

    public void setQuestionItems(ArrayList<QuestionItemBean> questionItems) {
        this.questionItems = questionItems;
    }
    
    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public int getMaxGrade() {
        return this.maxGrade;
    }

    @Override
    public int getGrade() {
        return this.grade;
    }

    @Override
    public String getJob() {
        return this.job;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setMaxGrade(int maxGrade) {
        this.maxGrade = maxGrade;
    }

    @Override
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
