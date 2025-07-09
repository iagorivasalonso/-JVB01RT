package com.hackaboss.app.repositories;

import com.hackaboss.app.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Curso, Integer> {
}
