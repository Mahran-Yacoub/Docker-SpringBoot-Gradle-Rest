package exalt.company.rest_gradle_springboot_docker.repo;


import exalt.company.rest_gradle_springboot_docker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepoDB extends JpaRepository<Customer,Integer> {

}
