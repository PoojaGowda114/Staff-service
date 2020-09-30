package com.staff.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.staff.microservice.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
