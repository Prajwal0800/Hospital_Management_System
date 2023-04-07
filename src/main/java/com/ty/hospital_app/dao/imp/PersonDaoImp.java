package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.PersonDao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;

public class PersonDaoImp implements PersonDao {

	public Person savePerson(int eid, Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter !=null) {
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		}
		else {
			return null;
		}
	}

	public Person getPersonById(int pid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person person=entityManager.find(Person.class, pid);
		return person;
	}

	public boolean deletegetPersonById(int pid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class, pid);
		if(person != null) {
			entityTransaction.begin();
			entityManager.remove(person);;
			entityTransaction.commit();	
			return true;
		}
		else {
			return false;
		}
	}

	public Person updategetPersonById(int pid, Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person1=entityManager.find(Person.class, pid);
		if(person1 != null) {
			person.setAddress(person1.getAddress());
			person.setAge(person1.getAge());
			person.setDob(person1.getDob());
			person.setEncounters(person1.getEncounters());
			person.setGender(person1.getGender());
			person.setName(person1.getName());
			person.setPhno(person1.getPhno());
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			return person;
		}
		else {
			return null;
		}
	}

	public List<Person> getAllPerson() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s");
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getAllPersonByGender(String gender) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s");
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getAllPersonByAge(int age) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s");
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getAllPersonByPhone(long phno) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s");
		List<Person> person=query.getResultList();
		return person;
	}

}
