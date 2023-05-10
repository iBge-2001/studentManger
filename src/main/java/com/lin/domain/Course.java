package com.lin.domain;

public class Course {
    private long st_id;
    String course;
    int grade;


    @Override
    public String toString() {
        return "Course{" + course+
                ",grade=" + grade +
                '}';
    }

    public Course(long st_id, String course, int grade) {
        this.st_id = st_id;
        this.course = course;
        this.grade = grade;
    }

    public long getSt_id() {
        return st_id;
    }

    public void setSt_id(long st_id) {
        this.st_id = st_id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Course(int grade) {
        this.grade = grade;
    }

    public Course() {
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
