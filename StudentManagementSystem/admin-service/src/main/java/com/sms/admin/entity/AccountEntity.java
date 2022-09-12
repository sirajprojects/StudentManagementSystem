package com.sms.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accountentity")

public class AccountEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "usertype")
	private String usertype;

	@Column(name = "gender")
	private String gender;

	@Column(name = "fathername")
	private String fathername;

	@Column(name = "mothername")
	private String mothername;

	@Column(name = "dateofbirth")
	private String dateofbirth;

	@Column(name = "religion")
	private String religion;

	@Column(name = "joiningdata")
	private String joiningdata;

	@Column(name = "email")
	private String email;

	@Column(name = "subject")
	private String subject;

	@Column(name = "inclass")
	private String inclass;

	@Column(name = "section")
	private String section;

	@Column(name = "idno")
	private String idno;

	@Column(name = "phone")
	private String phone;

	@Column(name = "adress")
	private String adress;

	public AccountEntity(String firstname, String lastname, String usertype, String gender, String fathername,
			String mothername, String dateofbirth, String religion, String joiningdata, String email, String subject,
			String inclass, String section, String idno, String phone, String adress) {
		super();

		this.firstname = firstname;
		this.lastname = lastname;
		this.usertype = usertype;
		this.gender = gender;
		this.fathername = fathername;
		this.mothername = mothername;
		this.dateofbirth = dateofbirth;
		this.religion = religion;
		this.joiningdata = joiningdata;
		this.email = email;
		this.subject = subject;
		this.inclass = inclass;
		this.section = section;
		this.idno = idno;
		this.phone = phone;
		this.adress = adress;
	}

	public long getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getJoiningdata() {
		return joiningdata;
	}

	public void setJoiningdata(String joiningdata) {
		this.joiningdata = joiningdata;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getInclass() {
		return inclass;
	}

	public void setInclass(String inclass) {
		this.inclass = inclass;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getIdno() {
		return idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", usertype="
				+ usertype + ", gender=" + gender + ", fathername=" + fathername + ", mothername=" + mothername
				+ ", dateofbirth=" + dateofbirth + ", religion=" + religion + ", joiningdata=" + joiningdata
				+ ", email=" + email + ", subject=" + subject + ", inclass=" + inclass + ", section=" + section
				+ ", idno=" + idno + ", phone=" + phone + ", adress=" + adress + "]";
	}

}
