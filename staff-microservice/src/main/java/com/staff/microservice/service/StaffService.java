package com.staff.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.microservice.model.Staff;
import com.staff.microservice.repository.StaffRepository;

@Service
public class StaffService {

	@Autowired
	private StaffRepository staffRepository;

	public Staff saveStaff(Staff staff) {
		return staffRepository.save(staff);
	}

	public List<Staff> getStaffs() {
		return staffRepository.findAll();
	}

	public Staff getStaffById(int staffId) {
		return staffRepository.findById(staffId).orElse(null);
	}

	public String deleteStaff(int staffId) {
		staffRepository.deleteById(staffId);
		return "Staff removed!!" + staffId;
	}

	public Staff updateStaff(Staff staff) {
		Staff existingStaff = staffRepository.findById(staff.getStaffId()).orElse(null);
		existingStaff.setStaffName(staff.getStaffName());
		existingStaff.setStaffEmail(staff.getStaffEmail());
		return staffRepository.save(existingStaff);

	}

}
