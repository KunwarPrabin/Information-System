/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.oop.entity;

/**
 *
 * @author OWNER
 */
public class Courses {
    
    private int id;
    private String courseName;
    private int creditHours;
    private boolean status;

    public Courses()
    {
        
    }
    
    public Courses(int id, String courseName, int creditHours, boolean status) {
        this.id = id;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.status = status;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
