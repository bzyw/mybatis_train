package org.bzyw.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("maleExamination")
public class MaleExamination {
    private int id;
    private Date date;
    private String prostate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }
}
