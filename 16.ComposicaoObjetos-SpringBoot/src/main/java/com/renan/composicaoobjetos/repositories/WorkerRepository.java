package com.renan.composicaoobjetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renan.composicaoobjetos.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
