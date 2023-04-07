package com.ty.hospital_app.service;
import com.ty.hospital_app.dao.imp.*;
import com.ty.hospital_app.dto.User;

public class UserService {
	public void saveUser(User hospital) {
		UserDaoImp daoImp=new UserDaoImp();
		User user1=daoImp.saveUser(hospital);
		if(user1 != null) {
			System.out.println("Data Saved");

		}
		else {
			System.out.println("Unfortunately Data not Saved");
		}
	}
	public User getUserById(int uid) {
		UserDaoImp daoImp=new UserDaoImp();
		User user1=daoImp.getUserById(uid);
		if(user1 != null) {
			return user1;
		}
		else {
			return null;
		}
	}
	public void deleteHospitalById(int uid) {
		UserDaoImp daoImp=new UserDaoImp();
		boolean b=daoImp.deleteHospitalById(uid);
		if(b==true) {
			System.out.println("Data deleted");
		}
		else {
			System.out.println("Data not deleted");
		}
	}
	public User updateHospitalById(int uid, User user) {
		UserDaoImp daoImp=new UserDaoImp();
		User user1=daoImp.updateHospitalById(uid, user);
		if(user1 !=null) {
			return user1;
		}
		else {
			return null;
		}
	}
}
