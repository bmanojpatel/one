package com.study.bo;

import com.study.model.CaseStudy;

public interface CaseStudyBO {

	void save(CaseStudy study);
	
	void update(CaseStudy study);
	
	void delete(CaseStudy study);
	
	CaseStudy findByCaseStudyId( String studyId );
	
}
