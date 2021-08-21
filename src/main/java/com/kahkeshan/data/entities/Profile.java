package com.kahkeshan.data.entities;

import com.kahkeshan.ui.controllers.StudentDeleteController;

import javax.persistence.*;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    @Column(name = "hobby",length = 45)
    private String hobby;

    private String yChannel;


    private String email;

    @OneToOne(mappedBy = "profile")
    private Student student;

    public Profile(int id, String hobby, String yChannel, String email) {
        this.id = id;
        this.hobby = hobby;
        this.yChannel = yChannel;
        this.email = email;
    }

    public Profile(String hobby, String yChannel, String email) {
        this.hobby = hobby;
        this.yChannel = yChannel;
        this.email = email;
    }

    public Profile() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getyChannel() {
        return yChannel;
    }

    public void setyChannel(String yChannel) {
        this.yChannel = yChannel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
