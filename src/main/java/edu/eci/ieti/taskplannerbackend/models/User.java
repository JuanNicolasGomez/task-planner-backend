package edu.eci.ieti.taskplannerbackend.models;

public class User {

    private int id;
    private String name;
    private String email;

    public void User(int id, String name, String email){
        this.id =id;
        this.name = name;
        this.email =email;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String name){
        this.email = email;
    }


}
