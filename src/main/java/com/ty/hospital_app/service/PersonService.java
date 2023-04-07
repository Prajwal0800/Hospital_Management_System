package com.ty.hospital_app.service;
import com.ty.hospital_app.dao.imp.*;
import com.ty.hospital_app.dto.Person;

public class PersonService {
	public Person savePerson(int eid,Person person) {
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person1=daoImp.savePerson(eid, person);
		if(person1 != null) {
			return person1;
		}
		else {
			return null;
		}
	}
	public Person getPersonById(int pid) {
		PersonDaoImp daoImp1=new 		PersonDaoImp();
		Person person=daoImp1.getPersonById(pid);
		if(person != null) {
			return person;
		}
		else {
			return null;
		}
	}
	public void deletegetPersonById(int pid) {
		PersonDaoImp daoImp1=new PersonDaoImp();
		boolean b=daoImp1.deletegetPersonById(pid);
		if(b == true) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	public Person updategetPersonById(int pid,Person person) {
		PersonDaoImp daoImp1=new PersonDaoImp();
		Person person1=daoImp1.updategetPersonById(pid, person);
		if(person1 != null) {
			return person1;
		}
		else {
			return null;
		}
	}
}
