package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Application;

public interface ApplicationDAO extends JpaRepository<Application, Integer> {
}