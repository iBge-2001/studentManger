package com.lin.domain;

public class Grade {
    private long st_id;
    private String st_name;
    private String st_profession;
    private int garde;
    private String course;
    private String 物联网概论;
    private String java高级开发;
    private  String 总分;
    private  String 平均分;

    @Override
    public String toString() {
        return "Grade{" +
                "st_id=" + st_id +
                ", st_name='" + st_name + '\'' +
                ", st_profession='" + st_profession + '\'' +
                ", garde=" + garde +
                ", course='" + course + '\'' +
                ", 物联网概论='" + 物联网概论 + '\'' +
                ", java高级开发='" + java高级开发 + '\'' +
                ", 总分='" + 总分 + '\'' +
                ", 平均分='" + 平均分 + '\'' +
                '}';
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

    public String get总分() {
        return 总分;
    }

    public void set总分(String 总分) {
        this.总分 = 总分;
    }

    public String get平均分() {
        return 平均分;
    }

    public void set平均分(String 平均分) {
        this.平均分 = 平均分;
    }

    public Grade(long st_id, String st_name, String st_profession, String 物联网概论, String java高级开发, String 总分, String 平均分) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.st_profession = st_profession;
        this.物联网概论 = 物联网概论;
        this.java高级开发 = java高级开发;
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

    public Grade(long st_id, String st_name, String st_profession, int garde, String course) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.st_profession = st_profession;
        this.garde = garde;
        this.course = course;
    }
}
