package com.tutorial.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by danil.karimov on 29.01.2018.
 */
public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setAge(resultSet.getInt("age"));
        student.setName(resultSet.getString("name"));
        student.setMarks(resultSet.getInt("marks"));
        student.setYear(resultSet.getInt("years"));
        student.setSid(resultSet.getInt("sid"));

        return student;
    }
}
