/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skillsassessment.model;

/**
 *
 * @author alej0
 */
public interface QuestionBean {
    
    int getId();
    int getMaxGrade();
    int getGrade();
    String getJob();
    
    void setId(int id);
    void setMaxGrade(int maxGrade);
    void setGrade(int grade);
    void setJob(String job);
    
}
