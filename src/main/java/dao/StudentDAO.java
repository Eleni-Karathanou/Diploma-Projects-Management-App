package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Student;

public interface StudentDAO extends JpaRepository<Student, Integer> {
}