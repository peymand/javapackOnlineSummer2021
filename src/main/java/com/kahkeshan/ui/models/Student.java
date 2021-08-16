package com.kahkeshan.ui.models;

import javax.persistence.*;
import java.lang.annotation.Target;

@Entity
@Table(name = "TBL_STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "col_name",length = 45)
    private String name;

    private String family;
    private String college;

    @Transient
    private String dummy;

    public Student(String name, String family, String college) {
        this.name = name;
        this.family = family;
        this.college = college;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
