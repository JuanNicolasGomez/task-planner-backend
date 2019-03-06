package edu.eci.ieti.taskplannerbackend.models;

import java.util.Date;

public class Task {

    private String description;
    private String responsible;
    private String state;
    private Date date;

    public void Task(String description, String responsible, String state, Date date){
        this.description = description;
        this.responsible = responsible;
        this.state = state;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public String getResponsible() {
        return responsible;
    }

    public String getState() {
        return state;
    }

    public Date getDate() {
        return date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
