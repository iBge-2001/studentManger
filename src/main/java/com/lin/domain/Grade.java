package com.lin.domain;

public class Grade {
    private long st_id;
    private String st_name;
    private String st_profession;
    private String course;
    private String 物联网概论;
    private String java高级开发;
    private String 数据库;
    private String java基础;
    private  Double 总分;
    private  Double 平均分;

    @Override
    public String toString() {
        return "Grade{" +
                "st_id=" + st_id +
                ", st_name='" + st_name + '\'' +
                ", st_profession='" + st_profession + '\'' +
                ", course='" + course + '\'' +
                ", 物联网概论='" + 物联网概论 + '\'' +
                ", java高级开发='" + java高级开发 + '\'' +
                ", 数据库='" + 数据库 + '\'' +
                ", java基础='" + java基础 + '\'' +
                ", 总分=" + 总分 +
                ", 平均分=" + 平均分 +
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

    public String get物联网概论() {
        return 物联网概论;
    }

    public void set物联网概论(String 物联网概论) {
        this.物联网概论 = 物联网概论;
    }

    public String getJava高级开发() {
        return java高级开发;
    }

    public void setJava高级开发(String java高级开发) {
        this.java高级开发 = java高级开发;
    }

    public String get数据库() {
        return 数据库;
    }

    public void set数据库(String 数据库) {
        this.数据库 = 数据库;
    }

    public String getJava基础() {
        return java基础;
    }

    public void setJava基础(String java基础) {
        this.java基础 = java基础;
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

    public Grade(long st_id, String st_name, String st_profession, String course, String 物联网概论, String java高级开发, String 数据库, String java基础, Double 总分, Double 平均分) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.st_profession = st_profession;
        this.course = course;
        this.物联网概论 = 物联网概论;
        this.java高级开发 = java高级开发;
        this.数据库 = 数据库;
        this.java基础 = java基础;
        this.总分 = 总分;
        this.平均分 = 平均分;
    }
}
