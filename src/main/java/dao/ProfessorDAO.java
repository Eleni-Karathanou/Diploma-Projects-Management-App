package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Professor;

public interface ProfessorDAO extends JpaRepository<Professor, Integer> {
}