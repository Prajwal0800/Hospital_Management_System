package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Person;

public interface PersonDao {
	public Person savePerson(int eid,Person person);
	public Person getPersonById(int pid);
	public boolean deletegetPersonById(int pid);
	public Person updategetPersonById(int pid,Person person);
	public List<Person> getAllPerson();
	public List<Person> getAllPersonByGender(String gender);
	public List<Person> getAllPersonByAge(int age);
	public List<Person> getAllPersonByPhone(long phno);
}
