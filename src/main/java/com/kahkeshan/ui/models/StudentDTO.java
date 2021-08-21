package com.kahkeshan.ui.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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


    public StudentDTO(String name, String family, String college) {
        this.name = name;
        this.family = family;
        this.college = college;
    }

    public StudentDTO(int id, String name, String family, String college) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.college = college;
    }

    public StudentDTO() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
