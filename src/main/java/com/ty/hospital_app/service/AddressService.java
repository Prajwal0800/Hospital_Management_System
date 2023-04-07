package com.ty.hospital_app.service;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dao.imp.*;

public class AddressService {
public Address saveAddress(int bid, Address address) {
	AdressDaoImp daoImp=new AdressDaoImp();
	Address address1=daoImp.saveAddress(bid, address);
	if(address1 != null) {
		return address1;
	}
	else {
		return null;
	}
	
	
	}
public Address getAddressById(int aid) {
	AdressDaoImp daoImp1=new AdressDaoImp();
	Address address2=daoImp1.getAddressById(aid);
	if(address2 != null) {
		return address2;
	}
	else {
		return null;
	}
}
public void deleteAddressById(int aid) {
	AdressDaoImp daoImp1=new AdressDaoImp();
	boolean b=daoImp1.deleteAddressById(aid);
	if(b == true) {
		System.out.println("Data Deleted");
	}
	else {
		System.out.println("Data not Deleted");
	}
}

public Address updateAddressById(int aid, Address address) {
	AdressDaoImp daoImp1=new AdressDaoImp();
	Address adress=daoImp1.updateAddressById(aid, address);
	if(adress != null) {
		return adress;
	}
	else {
		return null;
	}
}
}

