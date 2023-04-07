package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestSavePerson {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		HospitalService service=new HospitalService();
		
		hospital.setName("Appolo");
		hospital.setWebsite("www.apllo.com");
		service.saveHospital(hospital);

	}

}
