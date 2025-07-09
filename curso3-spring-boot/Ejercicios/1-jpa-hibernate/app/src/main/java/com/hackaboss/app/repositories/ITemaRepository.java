package com.hackaboss.app.repositories;

import com.hackaboss.app.models.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITemaRepository extends JpaRepository<Tema, Integer> {

    Tema save(Tema tema);
}
