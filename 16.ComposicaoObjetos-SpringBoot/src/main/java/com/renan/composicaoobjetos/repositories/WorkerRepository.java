package com.renan.composicaoobjetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renan.composicaoobjetos.entities.Worker;

/*
 * Repository é a camada responsável pelo acesso aos dados
 * da entidade Worker.
 *
 * Ao estender JpaRepository, o Spring Data JPA fornece
 * automaticamente vários métodos prontos para:
 *
 * - salvar
 * - buscar
 * - atualizar
 * - excluir
 * - verificar existência
 * etc.
 *
 * Não precisamos criar uma classe de implementação.
 */
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}