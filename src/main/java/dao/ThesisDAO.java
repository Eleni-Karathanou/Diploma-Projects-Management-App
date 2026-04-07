package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Thesis;

public interface ThesisDAO extends JpaRepository<Thesis, Integer> {
}