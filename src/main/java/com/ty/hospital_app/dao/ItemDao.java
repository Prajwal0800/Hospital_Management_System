package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Item;

public interface ItemDao {
public Item saveItem(int eid, Item item);
public Item getItemById(int iid);
public boolean deleteItemById(int iid);
public Item updateItemById(int iid, Item item);
public List<Item> getAllItems();
}
