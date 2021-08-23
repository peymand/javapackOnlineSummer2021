package com.kahkeshan.data.entities;



import javax.persistence.*;

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

    private String passCode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_fk")
    private Profile profile;

    public Student(String name, String family, String college, Profile profile) {
        this.name = name;
        this.family = family;
        this.college = college;
        this.profile = profile;
    }

    public Student() {
    }

    @PrePersist
    public void generatePassCode(){
        this.passCode = "12345";
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

    public String getPassCode() {
        return passCode;
    }

    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
