package com.example.GLStudentManagmentSystem.StudentManagment.service;

import java.util.Currency;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Service;

import com.example.GLStudentManagmentSystem.StudentManagment.Model.Student;
import com.example.GLStudentManagmentSystem.StudentManagment.Repository.StudentDao;

@Service
public class StudentDaoImpl implements StudentDao {

	@Autowired
	EntityManager entityManager;

	@Override
	@Transactional
	public List<Student> FindAll() {

		org.hibernate.Session session = this.entityManager.unwrap(org.hibernate.Session.class);
		org.hibernate.query.Query<Student> theQuery = session.createQuery("From Student_Table");

		List<Student> studentsList = theQuery.getResultList();

		return studentsList;

	}

	@Override
	@Transactional
	public void save(Student student) {
		org.hibernate.Session session = this.entityManager.unwrap(org.hibernate.Session.class);
		session.save(session);

	}

	@Override
	public void saveorUpdate(Student student) {
		org.hibernate.Session session = this.entityManager.unwrap(org.hibernate.Session.class);
		session.saveOrUpdate(session);

	}

}
