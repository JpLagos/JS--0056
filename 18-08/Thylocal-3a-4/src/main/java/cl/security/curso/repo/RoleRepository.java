package cl.security.curso.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.security.curso.model.ERole;
import cl.security.curso.model.Role;


@Repository
public interface RoleRepository  extends JpaRepository<Role, Long> {

	Optional<Role> findByName(ERole name);
	
	
}
