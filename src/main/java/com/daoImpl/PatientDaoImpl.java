package com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.PatientDao;
import com.evry.Patient;
import com.uitl.HibernateUtil;

public class PatientDaoImpl implements PatientDao {

	public void savePatient(Patient patient) {

          Session ses=HibernateUtil.getSessionFactory().openSession();
          Transaction tx=ses.beginTransaction();
          ses.save(patient);
          tx.commit();
          
		
	}

	public List<Patient> showPatients() {
		List<Patient> patientList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From Patient");
        patientList = query.list();
        return patientList;
	}

	
}
