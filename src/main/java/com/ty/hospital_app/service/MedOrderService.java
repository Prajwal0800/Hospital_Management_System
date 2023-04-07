package com.ty.hospital_app.service;
import com.ty.hospital_app.dao.imp.*;
import com.ty.hospital_app.dto.MedOrder;
public class MedOrderService {
	public MedOrder saveMedOrder(int eid, MedOrder medOrder) {
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		MedOrder medOrder1=daoImp.saveMedOrder(eid, medOrder);
		if(medOrder1 != null) {
			return medOrder1;
		}
		else {
			return null;
		}
	}
	public MedOrder getMedOrderById(int mid) {
		MedOrderDaoImp daoImp1=new MedOrderDaoImp();
		MedOrder medOrder=daoImp1.getMedOrderById(mid);
		if(medOrder != null) {
			return medOrder;
		}
		else {
			return null;
		}
	}
	public void deleteMedOrderById(int mid) {
		MedOrderDaoImp daoImp1=new MedOrderDaoImp();
		boolean b=daoImp1.deleteMedOrderById(mid);
		if(b == true) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	public MedOrder updateMedOrderById(int mid, MedOrder medOrder) {
		MedOrderDaoImp daoImp1=new MedOrderDaoImp();
		MedOrder medOrder1=daoImp1.updateMedOrderById(mid, medOrder);
		if(medOrder1 != null) {
			return medOrder1;
		}
		else {
			return null;
		}
	}
}
