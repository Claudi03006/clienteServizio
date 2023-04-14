package com.savarino.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Servizio;

public interface ServizioDAO extends JpaRepository<Servizio, Integer> {

}
