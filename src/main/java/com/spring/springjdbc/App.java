package com.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

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
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        Student student = new Student();
//        student.setsId("103");
//        student.setsName("Kajal Kumari");
//        student.setsCity("Noida");
        
//        int result = studentDao.delete(student);
        Student student = studentDao.getStudent("102");
        System.out.println(student);
    }
}
