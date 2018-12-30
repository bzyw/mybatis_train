package org.bzyw.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * Created by bzyw on 2018/7/15.
 */
@Alias("beanAliasTest")
public class BeanAliasTest implements Serializable {
    private static final long serialVersionUID = 2616189571876652617L;
    private String attribute;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
