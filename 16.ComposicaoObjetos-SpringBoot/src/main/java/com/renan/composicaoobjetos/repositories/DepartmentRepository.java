package com.renan.composicaoobjetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renan.composicaoobjetos.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
