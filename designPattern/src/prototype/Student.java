package com.divya.design.pattern.prototype;

import java.util.Date;

public class Student implements Prototype<Student>{
    private String id;
    private String name;
    private String batchName;
    private Date joinYear;
    private Date completionYear;
    private String moduleName;
    private int psp;

    private String track;
    private String instructorName;
    private String paymentPartner;

    private float batchPSP;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batchName = batch;
    }

    public void setJoinYear(Date joinYear) {
        this.joinYear = joinYear;
    }

    public void setCompletionYear(Date completionYear) {
        this.completionYear = completionYear;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setBatchPSP(float batchPSP) {
        this.batchPSP = batchPSP;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setPaymentPartner(String paymentPartner) {
        this.paymentPartner = paymentPartner;
    }

    @Override
    public Student clone() {
        Student s = new Student();
        s.setId(this.id);
        s.setName(this.name);
        s.setPsp(this.psp);
        s.setBatchName(this.batchName);
        s.setModuleName(this.moduleName);
        s.setTrack(this.track);
        s.setJoinYear(this.joinYear);
        s.setInstructorName(this.instructorName);
        s.setCompletionYear(this.completionYear);
        s.paymentPartner = this.paymentPartner;
        s.setBatchPSP(this.batchPSP);
        return s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", track='" + track + '\'' +
                ", joinYear=" + joinYear +
                ", instructorName='" + instructorName + '\'' +
                ", completionYear=" + completionYear +
                ", paymentPartner='" + paymentPartner + '\'' +
                ", batchPSP=" + batchPSP +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && psp == student.psp && joinYear == student.joinYear && completionYear == student.completionYear
                && batchPSP == student.batchPSP && this.name.equals(student.name) && this.batchName.equals(student.batchName)
                && this.moduleName.equals(student.moduleName) && this.track.equals( student.track)
                && this.instructorName.equals( student.instructorName) && this.paymentPartner.equals(student.paymentPartner);
    }
}

