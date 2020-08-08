package com.kveola13.springjpa.springdata;

import com.kveola13.springjpa.jdbc.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
