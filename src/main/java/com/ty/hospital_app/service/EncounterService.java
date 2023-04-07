package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.*;
import com.ty.hospital_app.dto.Encounter;

public class EncounterService {
	public Encounter saveEncounter(int bid,Encounter encounter) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter1=daoImp.saveEncounter(bid, encounter);
		if(encounter1 != null) {
			return encounter1;
		}
		else {
			return null;
		}
	}
	public Encounter getEncounterById(int eid) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter1=daoImp.getEncounterById(eid);
		if(encounter1 != null) {
			return encounter1;
		}
		else {
			return null;
		}
	}
	public void deleteEncounterById(int eid) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		boolean encounter1=daoImp.deleteEncounterById(eid);
		if(encounter1 == true) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	public Encounter updateEncounter(int eid,Encounter encounter) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter1=daoImp.updateEncounter(eid, encounter);
		if(encounter1 != null) {
			return encounter1;
		}
		else {
			return null;
		}
	}
}
