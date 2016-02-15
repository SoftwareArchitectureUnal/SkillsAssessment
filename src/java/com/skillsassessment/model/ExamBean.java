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
public class ExamBean {
    
    private int id;
    private ArrayList<QuestionBean> questions;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
