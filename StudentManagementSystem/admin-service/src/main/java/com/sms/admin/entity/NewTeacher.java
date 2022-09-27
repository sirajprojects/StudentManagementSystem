package com.sms.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "new_teacher")

public class NewTeacher {

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

	@Column(name = "is_class")
	private String isclass;

	@Column(name = "address")
	private String addres;

	@Column(name = "id_no")
	private String idno;

	@Column(name = "phone")
	private String phone;

	@Column(name = "adress")
	private String adress;

	@Column(name = "section")
	private String section;

	public NewTeacher() {
		super();
	}

	public NewTeacher(String firstname, String lastname, String bloodgroup, String gender, String fathername,
			String mothername, String dateofbirth, String religion, String email, String isclass, String addres,
			String idno, String phone, String adress, String section) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.bloodgroup = bloodgroup;
		this.gender = gender;
		this.fathername = fathername;
		this.mothername = mothername;
		this.dateofbirth = dateofbirth;
		this.religion = religion;
		this.email = email;
		this.isclass = isclass;
		this.addres = addres;
		this.idno = idno;
		this.phone = phone;
		this.adress = adress;

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

	public String getIsclass() {
		return isclass;
	}

	public String getAddres() {
		return addres;
	}

	public String getIdno() {
		return idno;
	}

	public String getPhone() {
		return phone;
	}

	public String getAdress() {
		return adress;
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

	public void setIsclass(String isclass) {
		this.isclass = isclass;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "NewTeacher [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", bloodgroup="
				+ bloodgroup + ", gender=" + gender + ", fathername=" + fathername + ", mothername=" + mothername
				+ ", dateofbirth=" + dateofbirth + ", religion=" + religion + ", email=" + email + ", isclass="
				+ isclass + ", addres=" + addres + ", idno=" + idno + ", phone=" + phone + ", adress=" + adress
				+ ", section=" + section + "]";
	}

}
