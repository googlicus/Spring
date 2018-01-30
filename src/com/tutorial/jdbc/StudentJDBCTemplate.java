package com.tutorial.jdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by danil.karimov on 29.01.2018.
 */
public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private PlatformTransactionManager transactionManager;
    private Logger logger = Logger.getLogger(StudentJDBCTemplate.class.getName());

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(this.dataSource);
    }

    public void setTransactionManager(PlatformTransactionManager transactionManager){
        this.transactionManager = transactionManager;
    }

    @Override
    public void create(String name, Integer age) {
        String sql = "insert into Student(name, age) values(?, ?)";
        jdbcTemplate.update(sql, name, age);
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
        Student student = jdbcTemplate.queryForObject("select * from Student, Marks where STUDENT.id=?",
                new Object[]{id}, new StudentMapper());
        return student;
    }

    @Override
    public List<Student> listStudents() {
        String sql = "select * from Student, Marks where Marks.SID=STUDENT.ID";
        List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
        return students;
    }

    @Override
    public void createMark(Integer id, Integer year, Integer mark) {
        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
        try {
            int sid = jdbcTemplate.queryForObject("select max(id) from STUDENT", int.class);
            jdbcTemplate.update("insert into Marks(SID, MARKS, YEARS) VALUES (?,?,?)", sid, mark, year);
            System.out.println("Created mark " + year + " " + mark);
            transactionManager.commit(status);
        } catch (DataAccessException ex){
            logger.info(ex.getMessage());
            transactionManager.rollback(status);
        }
    }
}
