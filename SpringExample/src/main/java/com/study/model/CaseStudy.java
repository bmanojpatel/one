package com.study.model;

import java.io.Serializable;

public class CaseStudy implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long uniqueID; // auto generated.
	
	private String studyId;  //1.1.2
	
	private String patientName;
	
	private Integer patientId; 

	public Long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(Long uniqueID) {
		this.uniqueID = uniqueID;
	}

	public String getStudyId() {
		return studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	@Override
	public String toString() {
		return "CaseStudy [uniqueID=" + uniqueID + ", studyId=" + studyId + ", patientName=" + patientName + ", patientId="
				+ patientId + "]";
	}
	
}
