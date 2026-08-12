package com.renan.composicaoobjetos.dto;

/*
 * DTO = Data Transfer Object
 *
 * Um DTO é um objeto utilizado para transportar dados entre
 * diferentes partes da aplicação, principalmente entre a
 * aplicação e o cliente da API.
 *
 * Neste caso, o DTO representa os dados que queremos devolver
 * quando consultamos a renda de um Worker.
 *
 * Em vez de retornar a entidade Worker inteira, retornamos
 * somente:
 *
 * - nome do trabalhador
 * - departamento
 * - renda calculada
 */
public record WorkerIncomeDTO(
		String name,
		String department,
		Double income
) {

}