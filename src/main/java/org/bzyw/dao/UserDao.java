package org.bzyw.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.bzyw.model.BeanAliasTest;
import org.bzyw.model.Female;
import org.bzyw.model.Male;
import org.bzyw.model.User;

import java.util.List;

/**
 * Created by bzyw on 2018/7/14.
 */
public interface UserDao {
    public abstract Female queryFemale(long id);

    public abstract Male queryMale(long id);

    @Select("select id,t_name name,t_gender gender,t_age age from t_user where id=#{id}")
    public User test(long id);

    public List<User> queryUser(@Param("name") String name, @Param("gender") String gender);
}
