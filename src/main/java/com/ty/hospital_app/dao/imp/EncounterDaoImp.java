package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.EncounterDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;

public class EncounterDaoImp implements EncounterDao{

	public Encounter saveEncounter(int bid, Encounter encounter) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class,bid);
		if(branch!=null) {
			entityTransaction.begin();
			entityManager.persist(encounter);
			entityTransaction.commit();
			return encounter;
		}
		else {
			return null;
		}
	}

	public Encounter getEncounterById(int eid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		return encounter;
	}

	public boolean deleteEncounterById(int eid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter != null) {
			entityTransaction.begin();
			entityManager.remove(encounter);;
			entityTransaction.commit();	
			return true;
		}
		else {
			return false;
		}
	}

	public Encounter updateEncounter(int eid, Encounter encounter) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter1=entityManager.find(Encounter.class, eid);
		if(encounter1 != null) {
			encounter.setBranches(encounter1.getBranches());
			encounter.setDateOfJoin(encounter1.getDateOfJoin());
			encounter.setDischarge(encounter1.getDischarge());
			encounter.setPersons(encounter1.getPersons());
			entityTransaction.begin();
			entityManager.merge(encounter);
			entityTransaction.commit();
			return encounter;
		}
		else {
			return null;
		}
	}

	public List<Encounter> getAllEncounter() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Encounter s");
		List<Encounter> encounter=query.getResultList();
		return encounter;
	}

}
