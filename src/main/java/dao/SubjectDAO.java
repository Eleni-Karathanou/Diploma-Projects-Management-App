package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Subject;

public interface SubjectDAO extends JpaRepository<Subject, Integer> {
}