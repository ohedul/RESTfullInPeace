package rokomari.project.RESTfullInPeace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import rokomari.project.RESTfullInPeace.model.Patient;
import rokomari.project.RESTfullInPeace.repository.PatientRepository;

@EnableJpaRepositories(basePackages = "rokomari.project.RESTfullInPeace.repository.PatientRepository.class")
@Service
public class PatientDAO {
	
	@Autowired
	PatientRepository patientRepository;
	
	public Patient save(Patient ptnt) {
		return patientRepository.save(ptnt);
	}
	
	public List<Patient> findAll(){
		return patientRepository.findAll();
	}
	
	public Patient findOne(Long patId) {
		return patientRepository.findByPatId(patId);
	}
	
	public void delete(Patient pnt) {
		patientRepository.delete(pnt);
	}
	
	

}
