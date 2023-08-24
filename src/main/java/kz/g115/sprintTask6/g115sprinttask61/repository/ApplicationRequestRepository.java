package kz.g115.sprintTask6.g115sprinttask61.repository;

import kz.g115.sprintTask6.g115sprinttask61.entity.ApplicationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRequestRepository extends JpaRepository<ApplicationRequest, Long> {

}
