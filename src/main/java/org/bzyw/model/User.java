package org.bzyw.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * Created by bzyw on 2018/7/14.
 */
@Alias("user")
public class User implements Serializable {

    private static final long serialVersionUID = -2455333813004744530L;
    private long id;
    private String name;
    private int age;
    private String gender;
    private long addressId;
    private Address address;
    private List<Take> takes;

    public User() {
    }

    public User(String name, int age, String gender, long addressId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addressId = addressId;
    }

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

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }
}
