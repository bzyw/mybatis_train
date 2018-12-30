package org.bzyw.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.bzyw.model.BeanAliasTest;
import org.bzyw.model.Female;
import org.bzyw.model.Male;
import org.bzyw.model.User;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by bzyw on 2018/7/14.
 */
public interface UserDao {
    public abstract Female queryFemale(long id);

    public abstract Male queryMale(long id);

    @Select("select id,t_name name,t_gender gender,t_age age from t_user where id=#{id}")
    public User test(long id);

    public List<User> queryUser(@Param("name") String name, @Param("gender") String gender);

    public String sumFunction(@Param("num1") int num1, @Param("num2") int num2, @Param("date") Date date);

    //获取不到OUT值
    //public void addCredit(@Param("userId") long userId, @Param("credit") short credit, @Param("date") Date date, @Param("result") String result);
    public void addCredit(@Param("map")Map<String,Object> map);

}
