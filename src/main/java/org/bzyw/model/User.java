package org.bzyw.model;

import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * Created by bzyw on 2018/7/14.
 */
@Alias("user")
public class User {
    private long id;
    private String name;
    private int age;
    private String gender;
    private Address address;
    private List<Take> takes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Take> getTakes() {
        return takes;
    }

    public void setTakes(List<Take> takes) {
        this.takes = takes;
    }
}
