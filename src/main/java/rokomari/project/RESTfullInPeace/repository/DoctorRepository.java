package rokomari.project.RESTfullInPeace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rokomari.project.RESTfullInPeace.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{
	Doctor findByDocId(Long docId);

}
