package com.examly.admission.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.admission.model.InstituteModel;
import com.examly.admission.repository.InstituteRepo;

import net.bytebuddy.asm.Advice.Exit;

@RestController
@CrossOrigin("*")
public class InstituteController {
	@Autowired
	InstituteRepo instituteRepo;
	@PostMapping("/admin/addInstitute")
	public String addInstitute(@RequestBody InstituteModel instituteModel)
	{
    	InstituteModel exists = instituteRepo.findByEmail(instituteModel.getEmail());

		if(exists==null) {
			instituteRepo.save(instituteModel);
			return "Institute Added";
		}
		else {
			return "Institute Already Present";
		}
	}
	@PutMapping("/admin/editInstitute/{instituteId}")
	public String editInstitute(@PathVariable int instituteId,  @RequestBody InstituteModel instituteModel) {
    	InstituteModel exists = instituteRepo.findByInstituteId(instituteModel.getInstituteId());
    	Optional<InstituteModel> institute=instituteRepo.findById(instituteId);
    	if(institute.isPresent()) {
    		institute.get().setEmail(instituteModel.getEmail());
    		institute.get().setInstituteAddress(instituteModel.getInstituteAddress());
    		institute.get().setInstituteDescription(instituteModel.getInstituteDescription());
    		institute.get().setInstituteName(instituteModel.getInstituteName());
    		institute.get().setMobile(instituteModel.getMobile());
    		instituteRepo.save(institute.get());
    		return "Institute Edited";
    		
    	}
    	else {
    		return "Institute Not Present";
    	}

		
	}
	

}
