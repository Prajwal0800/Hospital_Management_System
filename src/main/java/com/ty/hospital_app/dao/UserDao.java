package com.ty.hospital_app.dao;

import java.util.List;
import com.ty.hospital_app.dto.User;

public interface UserDao {
	public User saveUser(User hospital);
	public User getUserById(int uid);
	public boolean deleteHospitalById(int uid);
	public User updateHospitalById(int uid, User user);
	public List<User> getAllUser();
	public List<User> getAllUserByRole(String role);
}
