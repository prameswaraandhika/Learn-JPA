package com.learnwithdika.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = """
            INSERT INTO COURSE (id, name, author)
            VALUES (?, ?, ?);
            """;
    private static String DELETE_QUERY = """
            DELETE FROM COURSE
            WHERE ID ?
            """;

    publitc void insert(Course course) {
        springJdbcTemplate.update(
                INSERT_QUERY,
                course.getId(),
                course.getName(),
                course.getAuthor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }
}
