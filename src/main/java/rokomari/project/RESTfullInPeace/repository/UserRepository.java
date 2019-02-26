package rokomari.project.RESTfullInPeace.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import rokomari.project.RESTfullInPeace.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	Optional <Users> findByEmail(String name);

}
