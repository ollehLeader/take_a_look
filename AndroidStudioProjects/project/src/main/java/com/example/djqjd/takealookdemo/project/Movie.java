package com.example.djqjd.takealookdemo.project;

/**
 * Created by ansan on 2017-11-01.
 */

public class Movie {
    String name = "";
    String person ="";

    Movie(String name, String person){
        this.name = name;
        this.person = person;
    }
    //alt+Insert를 눌러서 getter and setter 를 넣는다
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}


