package org.bzyw.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("address")
public class Address implements Serializable {
    private static final long serialVersionUID = -7672325097466410997L;
    private long id;
    private String country;
    private String detail;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
