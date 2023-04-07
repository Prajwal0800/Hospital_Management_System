package com.ty.hospital_app.service;
import com.ty.hospital_app.dao.imp.*;
import com.ty.hospital_app.dto.Observation;
public class ObservationService {
	public Observation saveObservation(int eid, Observation observation) {
		ObservationDaoImp daoImp=new ObservationDaoImp();
		Observation observation1=daoImp.saveObservation(eid, observation);
		if(observation1 != null) {
			return observation1;
		}
		else {
			return null;
		}
	}
	public Observation getObservationById(int oid) {
		ObservationDaoImp daoImp1=new ObservationDaoImp();
		Observation observation=daoImp1.getObservationById(oid);
		if(observation != null) {
			return observation;
		}
		else {
			return null;
		}
	}
	public void deleteObservationById(int oid) {
		ObservationDaoImp daoImp1=new ObservationDaoImp();
		boolean b=daoImp1.deleteObservationById(oid);
		if(b == true) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	public Observation updateObservationById(int oid, Observation observation) {
		ObservationDaoImp daoImp1=new ObservationDaoImp();
		Observation observation1=daoImp1.updateObservationById(oid, observation);
		if(observation1 != null) {
			return observation1;
		}
		else {
			return null;
		}
	}
}
