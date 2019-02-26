package rokomari.project.RESTfullInPeace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rokomari.project.RESTfullInPeace.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{
	Patient findByPatId(Long patId);


}
