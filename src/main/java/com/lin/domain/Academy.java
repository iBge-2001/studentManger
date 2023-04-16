package com.lin.domain;

public class Academy {
   private String profession_name;
  private long  profession_id;

    @Override
    public String toString() {
        return "Academy{" +
                "profession_name='" + profession_name + '\'' +
                ", profession_id=" + profession_id +
                '}';
    }

    public String getProfession_name() {
        return profession_name;
    }

    public void setProfession_name(String profession_name) {
        this.profession_name = profession_name;
    }

    public long getProfession_id() {
        return profession_id;
    }

    public void setProfession_id(long profession_id) {
        this.profession_id = profession_id;
    }

    public Academy() {

    }

    public Academy(String profession_name, long profession_id) {
        this.profession_name = profession_name;
        this.profession_id = profession_id;
    }
}
