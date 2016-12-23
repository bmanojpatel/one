package com.study.bo.impl;

import com.study.bo.CaseStudyBO;
import com.study.dao.CaseStudyDao;
import com.study.model.CaseStudy;

public class CaseStudyBOImpl implements CaseStudyBO {
	
	private CaseStudyDao caseStudyDao;

	public void setCaseStudyDao(CaseStudyDao caseStudyDao) {
		this.caseStudyDao = caseStudyDao;
	}

	@Override
	public void save(CaseStudy study) {

		this.caseStudyDao.save(study);
		
	}

	@Override
	public void update(CaseStudy study) {

		this.caseStudyDao.update(study);
		
	}

	@Override
	public void delete(CaseStudy study) {

		this.caseStudyDao.delete(study);
		
	}

	@Override
	public CaseStudy findByCaseStudyId(String studyId) {
		return this.caseStudyDao.findByCaseStudyId(studyId);
	}

}
