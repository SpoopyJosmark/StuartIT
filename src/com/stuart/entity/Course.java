package com.stuart.entity;
// Generated Oct 13, 2019 7:46:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name="course"
    ,catalog="db_stuart_it"
)
public class Course  implements java.io.Serializable {


     private String id;
     private Coursecategory coursecategory;
     private String name;
     private int sks;
     private Set<Grade> grades = new HashSet<Grade>(0);
     private Set<Attendance> attendances = new HashSet<Attendance>(0);

    public Course() {
    }

	
    public Course(String id, Coursecategory coursecategory, String name, int sks) {
        this.id = id;
        this.coursecategory = coursecategory;
        this.name = name;
        this.sks = sks;
    }
    public Course(String id, Coursecategory coursecategory, String name, int sks, Set<Grade> grades, Set<Attendance> attendances) {
       this.id = id;
       this.coursecategory = coursecategory;
       this.name = name;
       this.sks = sks;
       this.grades = grades;
       this.attendances = attendances;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false, length=5)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CourseCategory_id", nullable=false)
    public Coursecategory getCoursecategory() {
        return this.coursecategory;
    }
    
    public void setCoursecategory(Coursecategory coursecategory) {
        this.coursecategory = coursecategory;
    }

    
    @Column(name="name", nullable=false, length=30)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="sks", nullable=false)
    public int getSks() {
        return this.sks;
    }
    
    public void setSks(int sks) {
        this.sks = sks;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set<Grade> getGrades() {
        return this.grades;
    }
    
    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set<Attendance> getAttendances() {
        return this.attendances;
    }
    
    public void setAttendances(Set<Attendance> attendances) {
        this.attendances = attendances;
    }




}

