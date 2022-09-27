package com.sms.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "account_user")

public class NewAdmin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastname;

	@Column(name = "user_type")
	private String usertype;

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

	@Column(name = "joining_data")
	private String joiningdata;

	@Column(name = "email")
	private String email;

	@Column(name = "id_No")
	private String idno;

	@Column(name = "phone")
	private String phone;

	@Column(name = "address")
	private String address;

	public NewAdmin() {
		super();
	}

	public NewAdmin(String firstname, String lastname, String usertype, String gender, String fathername,
			String mothername, String dateofbirth, String religion, String joiningdata, String email, String idno,
			String phone, String address) {
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
		this.idno = idno;
		this.phone = phone;
		this.address = address;
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

	public String getUsertype() {
		return usertype;
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

	public String getJoiningdata() {
		return joiningdata;
	}

	public String getEmail() {
		return email;
	}

	public String getIdno() {
		return idno;
	}

	public String getPhone() {
		return phone;
	}

	public String getAdress() {
		return address;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
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

	public void setJoiningdata(String joiningdata) {
		this.joiningdata = joiningdata;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAdress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", usertype="
				+ usertype + ", gender=" + gender + ", fathername=" + fathername + ", mothername=" + mothername
				+ ", dateofbirth=" + dateofbirth + ", religion=" + religion + ", joiningdata=" + joiningdata
				+ ", email=" + email + ", idno=" + idno + ", phone=" + phone + ", address=" + address + "]";
	}

}
