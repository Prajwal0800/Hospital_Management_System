package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.BranchDaoImp;
import com.ty.hospital_app.dto.Branch;

public class BranchService {
	public Branch saveBranch(int hid, Branch branch) {
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch1=daoImp.saveBranch(hid, branch);
		if(branch1 != null) {
			return branch1;
		}
		else {
			return null;
		}
	}
	public Branch getBranchById(int bid) {
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch1=daoImp.getBranchById(bid);
		if(branch1 != null) {
			return branch1;
		}
		else {
			return null;
		}
	}

	public void deleteBranchById(int bid) {
		BranchDaoImp daoImp=new BranchDaoImp();
		boolean branch1=daoImp.deleteBranchById(bid);
		if(branch1 == true) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}

	public Branch updateBranchById(int bid, Branch branch) {
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch1=daoImp.updateBranchById(bid, branch);
		if(branch1 != null) {
			return branch1;
		}
		else {
			return null;
		}
	}
}
