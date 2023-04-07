package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.MedOrder;

public interface MedOrderDao {
	public MedOrder saveMedOrder(int eid, MedOrder medOrder);
	public MedOrder getMedOrderById(int mid);
	public boolean deleteMedOrderById(int mid);
	public MedOrder updateMedOrderById(int mid, MedOrder medOrder);
	public List<MedOrder> getAllMedOrder();
	public List<MedOrder> getAllMedOrderByDoctorName(String name);
//	public List<MedOrder> getAllMedOrderByDate(String Date);
	
}
