package com.tutorial.jdbc;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by danil.karimov on 29.01.2018.
 */
public interface StudentDAO {

    public void setDataSource(DataSource dataSource);

    public void create(String name, Integer age);

    public void update(Integer id, Integer age);

    public void delete(Integer id);

    public Student getStudent(Integer id);

    public List<Student> listStudents();

    public void createMark(Integer id, Integer year, Integer mark);
}
