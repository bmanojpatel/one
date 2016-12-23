package com.study.dao;

import com.study.model.CaseStudy;

public interface CaseStudyDao {

	void save(CaseStudy study);
	
	void update(CaseStudy study);
	
	void delete(CaseStudy study);
	
	CaseStudy findByCaseStudyId( String studyId );
			
}
