package com.study.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.study.dao.CaseStudyDao;
import com.study.model.CaseStudy;

public class CaseStudyDaoImpl extends HibernateDaoSupport implements CaseStudyDao {

	@Override
	public void save(CaseStudy study) {

		getHibernateTemplate().save(study);
		
	}

	@Override
	public void update(CaseStudy study) {
 
		getHibernateTemplate().update(study);
	}

	@Override
	public void delete(CaseStudy study) {

		getHibernateTemplate().delete(study);
		
	}

	@Override
	public CaseStudy findByCaseStudyId( String studyId ) {
		List list = getHibernateTemplate().find("from CaseStudy where studyId=?", studyId );
		return (CaseStudy)list.get(0);
	}

}
