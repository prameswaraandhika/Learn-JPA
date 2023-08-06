package com.learnwithdika.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learnwithdika.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.learnwithdika.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Basic Java", "Prameswara"));
        repository.save(new Course(2, "Swing Basic", "Prameswara"));
        repository.save(new Course(3, "JavaFX Basic", "Prameswara"));
        repository.save(new Course(4, "Spring Basic", "Prameswara"));
        repository.save(new Course(5, "PHP Basic", "Elif"));
        repository.save(new Course(6, "PHP Advanced", "Elif"));
        repository.deleteById(1L);
        System.out.println("FIND BY ID");
        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));
        System.out.println("FIND ALL");
        System.out.println(repository.findAll());
        System.out.println("COUNT");
        System.out.println(repository.count());
        System.out.println("FIND BY AUTHOR");
        System.out.println(repository.findByAuthor("Prameswara"));
        System.out.println("FIND BY NAME");
        System.out.println(repository.findByName("PHP Basic"));

    }

}
