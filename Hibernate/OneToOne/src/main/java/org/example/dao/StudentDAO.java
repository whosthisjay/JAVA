package org.example.dao;

import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDAO {

    public void createStudent(Student student) {
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        }
    }

    public Student readStudent(int studentId) {
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            return session.get(Student.class, studentId);
        }
    }

    public void updateStudent(Student student) {
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(student);
            transaction.commit();
        }
    }

    public void deleteStudent(int studentId) {
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Student student = session.get(Student.class, studentId);
            if (student != null) {
                session.delete(student);
            }
            transaction.commit();
        }
    }

    // New method to get all students
    public List<Student> getAllStudents() {
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            Query<Student> query = session.createQuery("FROM Student", Student.class);
            return query.list();
        }
    }
}
