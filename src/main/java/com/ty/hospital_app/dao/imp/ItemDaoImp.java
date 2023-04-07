package com.ty.hospital_app.dao.imp;
import com.ty.hospital_app.dto.MedOrder;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ItemDao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;

public class ItemDaoImp implements ItemDao {

	public Item saveItem(int eid, Item item) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medOrder=entityManager.find(MedOrder.class, entityTransaction);
		if(medOrder!=null) {
			entityTransaction.begin();
			entityManager.persist(item);
			entityTransaction.commit();
			return item;
		}
		else {
			return null;
		}
	}

	public Item getItemById(int iid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Item item=entityManager.find(Item.class, iid);
		return item;
	}

	public boolean deleteItemById(int iid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item=entityManager.find(Item.class, iid);
		if(item != null) {
			entityTransaction.begin();
			entityManager.remove(item);;
			entityTransaction.commit();	
			return true;
		}
		else {
			return false;
		}
	}

	public Item updateItemById(int iid, Item item) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item1=entityManager.find(Item.class, iid);
		if(item1 != null) {
			item.setCost(item1.getCost());
			item.setMedOrder(item1.getMedOrder());
			item.setName(item1.getName());
			item.setQuantity(item1.getQuantity());
			entityTransaction.begin();
			entityManager.merge(item);
			entityTransaction.commit();
			return item;
		}
		else {
			return null;
		}
	}

	public List<Item> getAllItems() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Item s");
		List<Item> item=query.getResultList();
		return item;
	}

}
