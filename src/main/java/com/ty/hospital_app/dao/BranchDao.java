package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Branch;

public interface BranchDao {
	public Branch saveBranch(int hid,Branch branch);
	public Branch getBranchById(int bid);
	public boolean deleteBranchById(int bid);
	public Branch updateBranchById(int bid,Branch branch);
	public List<Branch> getAllBranch();
}
