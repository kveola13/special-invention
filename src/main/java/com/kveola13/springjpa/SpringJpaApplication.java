package com.kveola13.springjpa;

import com.kveola13.springjpa.jdbc.Person;
import com.kveola13.springjpa.jdbc.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJpaRepository personJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("User id 100001 -> {}", personJpaRepository.findById(100001));
        logger.info("Insert -> {}", personJpaRepository.insert(new Person("Ola U", "Oslo", new Date())));
        logger.info("Update -> {}", personJpaRepository.update(new Person(100003, "Ola I", "Oslo", new Date())));
        personJpaRepository.deleteById(100001);
        logger.info("All users -> {}", personJpaRepository.findAll());
    }
}
