package com.staff.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.staff.microservice.model.Staff;
import com.staff.microservice.service.StaffService;

@RestController
public class StaffController {
	
	@Autowired
	private StaffService staffService;

	@PostMapping("/addStaff")
    public Staff addStaff(@RequestBody Staff staff) {
        return staffService.saveStaff(staff);
    }

    @GetMapping("/staffs")
    public List<Staff> findAllStaffs() {
        return staffService.getStaffs();
    }

    @GetMapping("/staffs/{staffId}")
    public Staff findStaffById(@PathVariable int staffId) {
        return staffService.getStaffById(staffId);
    }

    @PutMapping("/staffs")
    public Staff updateStaff(@RequestBody Staff staff) {
        return staffService.updateStaff(staff);
    }

    @DeleteMapping("/staffs/{staffId}")
    public String deleteStaff(@PathVariable int staffId) {
        return staffService.deleteStaff(staffId);
    }

}
