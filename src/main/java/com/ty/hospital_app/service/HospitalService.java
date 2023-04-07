package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.HospitalDaoImp;
import com.ty.hospital_app.dto.Hospital;

public class HospitalService {
	public void saveHospital(Hospital hospital) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospitall=daoImp.saveHospital(hospital);
		if(hospitall != null) {
			System.out.println("Data Saved");

		}
		else {
			System.out.println("Unfortunately Data not Saved");
		}
	}

	public Hospital getHospitalById(int hid) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospitall=daoImp.getHospitalById(hid);
		if(hospitall != null) {
			return hospitall;
		}
		else {
			return null;
		}
	}
	public void deleteHospitalById(int hid) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		boolean b=daoImp.deleteHospitalById(hid);
		if(b==true) {
			System.out.println("Data deleted");
		}
		else {
			System.out.println("Data not deleted");
		}
	}
	public Hospital updateHospitalById(int hid,Hospital hospital) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital1=daoImp.updateHospitalById(hid, hospital);
		if(hospital1 !=null) {
			return hospital1;
		}
		else {
			return null;
		}
	}
}
