package com.dao;

import java.util.List;

import com.evry.Patient;

public interface PatientDao {

	public void savePatient(Patient patient);
	public List<Patient> showPatients();
}
