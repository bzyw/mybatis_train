package org.bzyw.model;

import org.apache.ibatis.type.Alias;

/**
 * Created by bzyw on 2018/7/15.
 */
@Alias("beanAliasTest")
public class BeanAliasTest {
    private String attribute;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
