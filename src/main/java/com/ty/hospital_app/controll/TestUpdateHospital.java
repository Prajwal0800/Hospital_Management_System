package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestUpdateHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hospital hospital=new Hospital();
HospitalService service=new HospitalService();
hospital.setName("Prestine");
hospital.setWebsite("www.prestine.com");
service.updateHospitalById(4, hospital);
	}

}
