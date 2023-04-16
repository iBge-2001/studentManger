package com.lin.domain;

public class Grade {
    private long st_id;
    private String st_name;
    private String st_academy;
    private int garde;
    private String course;

    @Override
    public String toString() {
        return "Grade{" +
                "st_id=" + st_id +
                ", st_name='" + st_name + '\'' +
                ", st_academy='" + st_academy + '\'' +
                ", garde=" + garde +
                ", course='" + course + '\'' +
                '}';
    }

    public long getSt_id() {
        return st_id;
    }

    public void setSt_id(long st_id) {
        this.st_id = st_id;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_academy() {
        return st_academy;
    }

    public void setSt_academy(String st_academy) {
        this.st_academy = st_academy;
    }

    public int getGarde() {
        return garde;
    }

    public void setGarde(int garde) {
        this.garde = garde;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Grade(long st_id, String st_name, String st_academy, int garde, String course) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.st_academy = st_academy;
        this.garde = garde;
        this.course = course;
    }
}
