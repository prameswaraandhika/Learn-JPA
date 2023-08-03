package com.learnwithdika.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Basic Java", "Prameswara"));
        repository.insert(new Course(2, "Basic Swing", "Prameswara"));
        repository.insert(new Course(3, "Basic Spring", "Prameswara"));

        repository.deleteById(1);
    }

}
