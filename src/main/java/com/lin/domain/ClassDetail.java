package com.lin.domain;

//`academy`.`classname`  `count`,`profession_id academy instructor
public class ClassDetail {
    private String academy;
    private String classname;
    private int count;

    private String profession_id;
    private String instructor;

    @Override
    public String toString() {
        return "Class{" +
                "academy='" + academy + '\'' +
                ", classname='" + classname + '\'' +
                ", count=" + count +
                ", profession_id='" + profession_id + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getProfession_id() {
        return profession_id;
    }

    public void setProfession_id(String profession_id) {
        this.profession_id = profession_id;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public ClassDetail(String academy, String classname, int count, String profession_id, String instructor) {
        this.academy = academy;
        this.classname = classname;
        this.count = count;
        this.profession_id = profession_id;
        this.instructor = instructor;
    }
}
