package org.bzyw.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("take")
public class Take {
    private long id;
    private int credit;
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
