package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Address;

public interface AddressDao {
	public Address saveAddress(int bid,Address address);
	public Address getAddressById(int aid);
	public boolean deleteAddressById(int aid);
	public Address updateAddressById(int aid,Address address);
	public List<Address> getAddressAll();
}
