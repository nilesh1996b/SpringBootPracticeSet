package com.nilesh.practice.dao;

import com.nilesh.practice.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    private EntityManager entityManager;

    @Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student getStudentById(int id) {

        return entityManager.find(Student.class,id);
        }

    @Override
    public List<Student> getAllStudent(String lasttName) {

        TypedQuery<Student> list = entityManager.createQuery("FROM Student WHERE lastName =:fn",Student.class);
        list.setParameter("fn",lasttName);

        return list.getResultList();
    }

}
