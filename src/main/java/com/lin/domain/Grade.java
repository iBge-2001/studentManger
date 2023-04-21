package com.lin.domain;

import java.util.List;

public class Grade {
    private long st_id;
    private String st_name;
    private String st_profession;
    private String course;

//    private String 物联网概论;
//    private String java高级开发;
//    private String 数据库;
//    private String java基础;
    private int grade;
    List<Course> listCourse;
    private  Double 总分;
    private  Double 平均分;

    public List<Course> getListCourse() {
        return listCourse;
    }

    public Grade(long st_id, String st_profession, int grade, List<Course> listCourse) {
        this.st_id = st_id;
        this.st_profession = st_profession;
        this.grade = grade;
        this.listCourse = listCourse;
    }

    public void setListCourse(List<Course> listCourse) {
        this.listCourse = listCourse;
    }

    public Grade(long st_id, String st_name, String st_profession, List<Course> listCourse, Double 总分, Double 平均分) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.st_profession = st_profession;
        this.listCourse = listCourse;
        this.总分 = 总分;
        this.平均分 = 平均分;
    }

    public Grade(long st_id, String st_name, String st_profession, String course, List<Course> listCourse, Double 总分, Double 平均分) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.st_profession = st_profession;
        this.course = course;
        this.listCourse = listCourse;
        this.总分 = 总分;
        this.平均分 = 平均分;
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

    public String getSt_profession() {
        return st_profession;
    }

    public void setSt_profession(String st_profession) {
        this.st_profession = st_profession;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }



    public Double get总分() {
        return 总分;
    }

    public void set总分(Double 总分) {
        this.总分 = 总分;
    }

    public Double get平均分() {
        return 平均分;
    }

    public void set平均分(Double 平均分) {
        this.平均分 = 平均分;
    }

    public Grade() {
    }


}
