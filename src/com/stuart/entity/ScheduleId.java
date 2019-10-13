package com.stuart.entity;
// Generated Oct 13, 2019 7:46:42 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ScheduleId generated by hbm2java
 */
@Embeddable
public class ScheduleId  implements java.io.Serializable {


     private int semester;
     private String studentNrp;

    public ScheduleId() {
    }

    public ScheduleId(int semester, String studentNrp) {
       this.semester = semester;
       this.studentNrp = studentNrp;
    }
   


    @Column(name="semester", nullable=false)
    public int getSemester() {
        return this.semester;
    }
    
    public void setSemester(int semester) {
        this.semester = semester;
    }


    @Column(name="Student_nrp", nullable=false, length=7)
    public String getStudentNrp() {
        return this.studentNrp;
    }
    
    public void setStudentNrp(String studentNrp) {
        this.studentNrp = studentNrp;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ScheduleId) ) return false;
		 ScheduleId castOther = ( ScheduleId ) other; 
         
		 return (this.getSemester()==castOther.getSemester())
 && ( (this.getStudentNrp()==castOther.getStudentNrp()) || ( this.getStudentNrp()!=null && castOther.getStudentNrp()!=null && this.getStudentNrp().equals(castOther.getStudentNrp()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSemester();
         result = 37 * result + ( getStudentNrp() == null ? 0 : this.getStudentNrp().hashCode() );
         return result;
   }   


}

