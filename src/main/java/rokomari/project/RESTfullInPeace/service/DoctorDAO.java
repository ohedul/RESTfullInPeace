package rokomari.project.RESTfullInPeace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import rokomari.project.RESTfullInPeace.model.Doctor;
import rokomari.project.RESTfullInPeace.repository.DoctorRepository;

@EnableJpaRepositories(basePackages ="rokomari.project.RESTfullInPeace.repository.DoctorRepository.class" )
@Service
public class DoctorDAO {
	
	@Autowired
	DoctorRepository doctorRepository;
	
	public Doctor save(Doctor doc) {
		return doctorRepository.save(doc);
	}
	
	public List<Doctor> getAllDoc(){
		return doctorRepository.findAll();
	}
	
	public Doctor findOne(Long docId) {
		return doctorRepository.findByDocId(docId);
	}
	
	public void delete(Doctor doc) {
		doctorRepository.delete(doc);
	}

}
