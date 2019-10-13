package com.stuart.entity;
// Generated Oct 13, 2019 7:46:42 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Schedule generated by hbm2java
 */
@Entity
@Table(name="schedule"
    ,catalog="db_stuart_it"
)
public class Schedule  implements java.io.Serializable {


     private ScheduleId id;
     private Student student;
     private Date period;
     private String ipk;
     private Set<Attendance> attendances = new HashSet<Attendance>(0);

    public Schedule() {
    }

	
    public Schedule(ScheduleId id, Student student, Date period) {
        this.id = id;
        this.student = student;
        this.period = period;
    }
    public Schedule(ScheduleId id, Student student, Date period, String ipk, Set<Attendance> attendances) {
       this.id = id;
       this.student = student;
       this.period = period;
       this.ipk = ipk;
       this.attendances = attendances;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="semester", column=@Column(name="semester", nullable=false) ), 
        @AttributeOverride(name="studentNrp", column=@Column(name="Student_nrp", nullable=false, length=7) ) } )
    public ScheduleId getId() {
        return this.id;
    }
    
    public void setId(ScheduleId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Student_nrp", nullable=false, insertable=false, updatable=false)
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="period", nullable=false, length=0)
    public Date getPeriod() {
        return this.period;
    }
    
    public void setPeriod(Date period) {
        this.period = period;
    }

    
    @Column(name="ipk", length=45)
    public String getIpk() {
        return this.ipk;
    }
    
    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="schedule")
    public Set<Attendance> getAttendances() {
        return this.attendances;
    }
    
    public void setAttendances(Set<Attendance> attendances) {
        this.attendances = attendances;
    }




}


