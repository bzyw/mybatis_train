package org.bzyw.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

@Alias("femaleExamination")
public class FemaleExamination implements Serializable {
    private static final long serialVersionUID = 5007598129320216467L;
    private long id;
    private String womb;
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWomb() {
        return womb;
    }

    public void setWomb(String womb) {
        this.womb = womb;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
