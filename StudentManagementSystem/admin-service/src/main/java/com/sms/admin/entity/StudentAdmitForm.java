package com.sms.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity


@Table(name = "student_admit_form")

public class StudentAdmitForm {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastname;

	@Column(name = "blood_group")
	private String bloodgroup;

	@Column(name = "gender")
	private String gender;

	@Column(name = "father_name")
	private String fathername;

	@Column(name = "mother_name")
	private String mothername;

	@Column(name = "date_of_birth")
	private String dateofbirth;

	@Column(name = "religion")
	private String religion;

	@Column(name = "email")
	private String email;

	@Column(name = "admission_id")
	private String admissionid;

	@Column(name = "roll_no")
	private String roll;

	@Column(name = "phone")
	private String phone;

	@Column(name = "address")
	private String address;

	@Column(name = "is_class")
	private String isclass;

	@Column(name = "section")
	private String section;

	
	
	public StudentAdmitForm() {
		super();
	}

	public StudentAdmitForm(String firstname, String lastname, String bloodgroup, String gender, String fathername,
			String mothername, String dateofbirth, String religion, String email, String admissionid, String roll,
			String phone, String address, String isclass, String section) {
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.bloodgroup = bloodgroup;
		this.gender = gender;
		this.fathername = fathername;
		this.mothername = mothername;
		this.dateofbirth = dateofbirth;
		this.religion = religion;
		this.email = email;
		this.admissionid = admissionid;
		this.roll = roll;
		this.phone = phone;
		this.address = address;
		this.isclass = isclass;
		this.section = section;
	}

	public long getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public String getGender() {
		return gender;
	}

	public String getFathername() {
		return fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public String getReligion() {
		return religion;
	}

	public String getEmail() {
		return email;
	}

	public String getAdmissionid() {
		return admissionid;
	}

	public String getRoll() {
		return roll;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public String getIsclass() {
		return isclass;
	}

	public String getSection() {
		return section;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAdmissionid(String admissionid) {
		this.admissionid = admissionid;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setIsclass(String isclass) {
		this.isclass = isclass;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "StudentAdmitForm [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", bloodgroup="
				+ bloodgroup + ", gender=" + gender + ", fathername=" + fathername + ", mothername=" + mothername
				+ ", dateofbirth=" + dateofbirth + ", religion=" + religion + ", email=" + email + ", admissionid="
				+ admissionid + ", roll=" + roll + ", phone=" + phone + ", address=" + address + ", isclass=" + isclass
				+ ", section=" + section + "]";
	}
	
	

}
