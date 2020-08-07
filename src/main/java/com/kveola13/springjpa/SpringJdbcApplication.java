package com.kveola13.springjpa;

import com.kveola13.springjpa.jdbc.Person;
import com.kveola13.springjpa.jdbc.PersonJDBCDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJDBCDao dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* logger.info("All users -> {}", dao.findAll());
        logger.info("user -> {}", dao.findById(100001));
        logger.info("deleting -> 100001, number of rows affected - {}", dao.deleteById(100001));
        logger.info("inserting -> {}", dao.insert(
                new Person(100004, "John", "Washington", new Date())));
        logger.info("updating -> {}", dao.update(
                new Person(100003, "Ola P", "Berlin", new Date())));*/
    }
}
