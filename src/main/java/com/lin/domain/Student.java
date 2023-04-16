package com.lin.domain;

public class Student {
    private long st_id;
    private String st_name;
    private String st_profession;
    private String st_address;
    private String st_academy;
    private String st_class;
    private long st_phnum;
    private long profession_Id;

    @Override
    public String toString() {
        return "Student{" +
                "st_id=" + st_id +
                ", st_name='" + st_name + '\'' +
                ", st_profession='" + st_profession + '\'' +
                ", st_address='" + st_address + '\'' +
                ", st_academy='" + st_academy + '\'' +
                ", st_class='" + st_class + '\'' +
                ", st_phnum=" + st_phnum +
                ", profession_Id=" + profession_Id +
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

    public String getSt_address() {
        return st_address;
    }

    public void setSt_address(String st_address) {
        this.st_address = st_address;
    }

    public String getSt_academy() {
        return st_academy;
    }

    public void setSt_academy(String st_academy) {
        this.st_academy = st_academy;
    }

    public String getSt_class() {
        return st_class;
    }

    public void setSt_class(String st_class) {
        this.st_class = st_class;
    }

    public long getSt_phnum() {
        return st_phnum;
    }

    public void setSt_phnum(long st_phnum) {
        this.st_phnum = st_phnum;
    }

    public long getProfession_Id() {
        return profession_Id;
    }

    public void setProfession_Id(long profession_Id) {
        this.profession_Id = profession_Id;
    }

    public Student() {
    }

    public Student(long st_id, String st_name, String st_profession, String st_address, String st_academy, String st_class, long st_phnum, long profession_Id) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.st_profession = st_profession;
        this.st_address = st_address;
        this.st_academy = st_academy;
        this.st_class = st_class;
        this.st_phnum = st_phnum;
        this.profession_Id = profession_Id;
    }
}
