package com.kahkeshan.ui.models;

import com.kahkeshan.data.entities.Profile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentDTO {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }


    private int id;
    private String name;
    private String family;
    private String college;
    private Profile profile;


    public StudentDTO(String name, String family, String college, Profile profile) {
        this.name = name;
        this.family = family;
        this.college = college;
        this.profile = profile;
    }

    public StudentDTO(int id, String name, String family, String college) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.college = college;
    }


    public StudentDTO() {
    }

    public void doSomething(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return String.format("[ %d %s %s %s ]",id,name,family,college);
    }
}
