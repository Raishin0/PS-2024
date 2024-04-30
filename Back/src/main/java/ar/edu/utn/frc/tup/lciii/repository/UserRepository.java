package ar.edu.utn.frc.tup.lciii.repository;

import ar.edu.utn.frc.tup.lciii.entities.UserEntity;
import ar.edu.utn.frc.tup.lciii.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmailOrName(String email, String name);
    List<UserEntity> findAllByCreationTimeBetween(LocalDateTime date1,LocalDateTime date2);
    List<UserEntity> findAllByRole(UserRole role);
    UserEntity getByUsername(String username);
    UserDetails findByUsername(String username);
    UserDetails findByEmail(String email);
}
