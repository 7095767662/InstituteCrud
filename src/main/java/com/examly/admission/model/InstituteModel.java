package com.examly.admission.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Institute")
public class InstituteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int instituteId;
	@Column
	private String instituteName;
	@Column
	private String instituteDescription;
	@Column
	private String instituteAddress;
	@Column
	private String mobile;
	@Column
	private String email;
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getInstituteDescription() {
		return instituteDescription;
	}
	public void setInstituteDescription(String instituteDescription) {
		this.instituteDescription = instituteDescription;
	}
	public String getInstituteAddress() {
		return instituteAddress;
	}
	public void setInstituteAddress(String instituteAddress) {
		this.instituteAddress = instituteAddress;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public InstituteModel(int instituteId, String instituteName, String instituteDescription, String instituteAddress,
			String mobile, String email) {
		super();
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.instituteDescription = instituteDescription;
		this.instituteAddress = instituteAddress;
		this.mobile = mobile;
		this.email = email;
	}
	public InstituteModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "InstituteModel [instituteId=" + instituteId + ", instituteName=" + instituteName
				+ ", instituteDescription=" + instituteDescription + ", instituteAddress=" + instituteAddress
				+ ", mobile=" + mobile + ", email=" + email + "]";
	}
	

}
