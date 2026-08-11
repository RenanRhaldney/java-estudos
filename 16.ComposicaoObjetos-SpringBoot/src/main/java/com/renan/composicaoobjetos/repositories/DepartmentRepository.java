package com.renan.composicaoobjetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renan.composicaoobjetos.entities.Department;

/*
 * Repository responsável pelo acesso aos dados da entidade Department.
 *
 * Ao estender JpaRepository, o Spring Data JPA fornece
 * automaticamente operações de persistência, como:
 *
 * - save()
 * - findById()
 * - findAll()
 * - deleteById()
 * - existsById()
 * - count()
 * etc.
 *
 * Não precisamos implementar esses métodos manualmente.
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}