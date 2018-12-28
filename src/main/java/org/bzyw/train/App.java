package org.bzyw.train;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.bzyw.dao.UserDao;
import org.bzyw.model.BeanAliasTest;
import org.bzyw.model.Female;
import org.bzyw.model.Male;
import org.bzyw.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        fromXML();
        //fromConfiguration();
    }

    public static void fromXML() throws IOException {
        InputStream input = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserDao dao = session.getMapper(UserDao.class);
            User user = dao.test(1L);
            System.out.println(user.getId() + "," + user.getName() + "," + user.getAge() + "," + user.getGender());

            Male user1 = dao.queryMale(1L);
            System.out.println(user1.getId() + ","
                    + user1.getName() + "," + user1.getGender() +
                    "," + user1.getAge() + "," + user1.getAddress().getCountry()
                    + "," + user1.getAddress().getDetail() + ","
                    + user1.getTakes().size() + "," + user1.getExaminations().size());
            Female user2 = dao.queryFemale(2L);
            System.out.println(user2.getId() + ","
                    + user2.getName() + "," + user2.getGender() +
                    "," + user2.getAge() + "," + user2.getAddress().getCountry()
                    + "," + user2.getAddress().getDetail() + ","
                    + user2.getTakes().size() + "," + user2.getExaminations().size());

            List<User> user3 = dao.queryUser(null, "m");
            System.out.println(user3.get(0).getId() + ","
                    + user3.get(0).getName() + "," + user3.get(0).getGender() +
                    "," + user3.get(0).getAge());

        } finally {
            session.close();
        }
    }

    public static void fromConfiguration() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-app.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(UserDao.class);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserDao userDao = session.getMapper(UserDao.class);
        } finally {
            session.close();
        }
    }
}
