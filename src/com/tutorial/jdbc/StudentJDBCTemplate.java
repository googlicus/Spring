package com.tutorial.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by danil.karimov on 29.01.2018.
 */
public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(this.dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        String sql = "insert into Student(name, age) values(?, ?)";
        jdbcTemplate.execute(sql);
        System.out.println("Created record: name " + name + " age " + age);
    }

    @Override
    public void update(Integer id, Integer age) {
        String sql = "update Student set age=? where id=?";
        jdbcTemplate.update(sql, age, id);
        System.out.println("Updated record: name " + id + " age " + age);
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from Student where id=?";
        jdbcTemplate.update(sql, id);
        System.out.println("Deleted record: name " + id);
    }

    @Override
    public Student getStudent(Integer id) {
        Student student = jdbcTemplate.queryForObject("select * from Student where id=?",
                new Object[]{id}, new StudentMapper());
        return student;
    }

    @Override
    public List<Student> listStudents() {
        String sql = "select * from Student";
        List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
        return students;
    }
}
