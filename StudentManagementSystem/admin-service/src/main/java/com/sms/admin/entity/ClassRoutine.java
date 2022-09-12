package com.sms.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classroutine")

public class ClassRoutine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "subjectname")
	private String subjectname;

	@Column(name = "subjecttype")
	private String subjecttype;

	@Column(name = "selectclass")
	private String selectclass;
	
	@Column(name = "selectcode")
	private String selectcode;

	public ClassRoutine(String subjectname, String subjecttype, String selectclass, String selectcode) {
		super();
		this.subjectname = subjectname;
		this.subjecttype = subjecttype;
		this.selectclass = selectclass;
		this.selectcode = selectcode;
	}

	public long getId() {
		return id;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public String getSubjecttype() {
		return subjecttype;
	}

	public String getSelectclass() {
		return selectclass;
	}

	public String getSelectcode() {
		return selectcode;
	}

	

	public void setStujectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public void setSubjecttype(String subjecttype) {
		this.subjecttype = subjecttype;
	}

	public void setSelectclass(String selectclass) {
		this.selectclass = selectclass;
	}

	public void setSelectcode(String selectcode) {
		this.selectcode = selectcode;
	}

	@Override
	public String toString() {
		return "ClassRoutine [id=" + id + ", subjectname=" + subjectname + ", subjecttype=" + subjecttype
				+ ", selectclass=" + selectclass + ", selectcode=" + selectcode + "]";
	}
	
	
	
	
	
}