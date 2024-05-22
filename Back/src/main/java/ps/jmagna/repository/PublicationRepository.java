package ps.jmagna.repository;

import ps.jmagna.entities.PublicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ps.jmagna.entities.UserEntity;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PublicationRepository extends JpaRepository<PublicationEntity,Long>,
        JpaSpecificationExecutor<PublicationEntity> {
    List<PublicationEntity> findAllByDateTimeBetween(LocalDateTime date1, LocalDateTime date2);
    List<PublicationEntity> findAllByUserAndDraftIsTrueAndDeletedIsFalse(UserEntity user);

}
