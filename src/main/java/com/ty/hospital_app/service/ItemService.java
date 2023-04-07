package com.ty.hospital_app.service;
import com.ty.hospital_app.dao.imp.*;
import com.ty.hospital_app.dto.Item;

public class ItemService {
	public Item saveItem(int eid, Item item) {
		ItemDaoImp daoImp=new ItemDaoImp();
		Item item1=daoImp.saveItem(eid, item);
		if(item1 != null) {
			return item1;
		}
		else {
			return null;
		}
	}
	public Item getItemById(int iid) {
		ItemDaoImp daoImp1=new ItemDaoImp();
		Item item=daoImp1.getItemById(iid);
		if(item != null) {
			return item;
		}
		else {
			return null;
		}
	}
	public void deleteItemById(int iid)
	{
		ItemDaoImp daoImp1=new ItemDaoImp();
		boolean b=daoImp1.deleteItemById(iid);
		if(b == true) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	public Item updateItemById(int iid, Item item) {
		ItemDaoImp daoImp1=new ItemDaoImp();
		Item item1=daoImp1.updateItemById(iid, item);
		if(item1 != null) {
			return item1;
		}
		else {
			return null;
		}
	}
}
