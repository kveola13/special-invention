package com.kveola13.springjpa;

import com.kveola13.springjpa.jdbc.Person;
import com.kveola13.springjpa.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonSpringDataRepository personSpringDataRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("User id 100001 -> {}", personSpringDataRepository.findById(100001));
        logger.info("Insert -> {}", personSpringDataRepository.save(new Person("Ola U", "Oslo", new Date())));
        logger.info("Update -> {}", personSpringDataRepository.save(new Person(100003, "Ola I", "Oslo", new Date())));
        personSpringDataRepository.deleteById(100001);
        logger.info("All users -> {}", personSpringDataRepository.findAll());
    }
}
