package dao;

import java.util.List;

import model.Patient;

public interface Daointerface {

	public List<model.Patient> viewPatient();
	public String savePatient();
	public List<Patient> getPatients();
	
}
