package com.sms.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "newclassschedule")

public class NewClassSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;

	@Column(name = "teachername")
	private String teachername;

	@Column(name = "idno")
	private String idno;
	
	@Column(name = "gender")
	private String gender;

	@Column(name = "isclass")
	private String isclass	;
	
	@Column(name = "subject")
	private String subject;

	@Column(name = "section")
	private String section;
	
	
	@Column(name = "time")
	private String time;

	@Column(name = "date")
	private String date;
	
	
	@Column(name = "phone")
	private String phone;

	@Column(name = "email")
	private String email;

	public NewClassSchedule(String teachername, String idno, String gender, String isclass, String subject,
			String section, String time, String date, String phone, String email) {
		super();
		this.teachername = teachername;
		this.idno = idno;
		this.gender = gender;
		this.isclass = isclass;
		this.subject = subject;
		this.section = section;
		this.time = time;
		this.date = date;
		this.phone = phone;
		this.email = email;
	}

	public long getId() {
		return id;
	}



	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public String getIdno() {
		return idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIsclass() {
		return isclass;
	}

	public void setIsclass(String isclass) {
		this.isclass = isclass;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "NewClassSchedule [id=" + id + ", teachername=" + teachername + ", idno=" + idno + ", gender=" + gender
				+ ", isclass=" + isclass + ", subject=" + subject + ", section=" + section + ", time=" + time
				+ ", date=" + date + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
	
}