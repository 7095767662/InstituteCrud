package com.examly.admission.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.admission.model.InstituteModel;

public interface InstituteRepo extends JpaRepository<InstituteModel, Integer>{
	InstituteModel findByEmail(String email);

	InstituteModel findByInstituteId(int instituteId);

}
