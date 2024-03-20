package com.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started...." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springjdbc/springjdbc.xml");
        JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
        String query ="insert into student(sId, sName, sCity) values(?, ?, ?)";
        int rows = template.update(query, 102, "Kajal", "Noida");
        System.out.println(rows);
    }
}
