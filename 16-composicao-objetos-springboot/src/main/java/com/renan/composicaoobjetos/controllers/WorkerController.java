package com.renan.composicaoobjetos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renan.composicaoobjetos.dto.WorkerIncomeDTO;
import com.renan.composicaoobjetos.entities.Worker;
import com.renan.composicaoobjetos.repositories.WorkerRepository;

/*
 * @RestController informa ao Spring que esta classe é um Controller
 * responsável por receber requisições HTTP e retornar respostas.
 *
 * Além disso, o Spring utiliza o retorno dos métodos para construir
 * a resposta HTTP. Neste projeto, o objeto retornado será convertido
 * automaticamente para JSON pelo Jackson.
 */
@RestController

/*
 * Define o caminho base para os endpoints deste Controller.
 *
 * Como temos:
 *
 * @RequestMapping("/workers")
 *
 * todos os endpoints desta classe começarão com:
 *
 * /workers
 */
@RequestMapping(value = "/workers")
public class WorkerController {

	/*
	 * Injeta automaticamente uma implementação de WorkerRepository
	 * criada pelo Spring Data JPA.
	 *
	 * Isso permite utilizar o repository sem precisar criar
	 * manualmente uma instância dele.
	 *
	 * Exemplo:
	 *
	 * workerRepository.findById(...)
	 * workerRepository.findAll()
	 * workerRepository.save(...)
	 *
	 * Observação:
	 * Em projetos mais atuais, é comum preferir injeção por
	 * construtor em vez de @Autowired diretamente no atributo.
	 */
	@Autowired
	private WorkerRepository workerRepository;

	/*
	 * @GetMapping define que este método será executado quando
	 * recebermos uma requisição HTTP GET neste endereço:
	 *
	 * /workers/{id}/income/{year}/{month}
	 *
	 * Exemplo:
	 *
	 * GET /workers/1/income/2026/8
	 *
	 * Nesse caso:
	 *
	 * id    = 1
	 * year  = 2026
	 * month = 8
	 */
	@GetMapping(value = "/{id}/income/{year}/{month}")
	public WorkerIncomeDTO getIncome(

			/*
			 * @PathVariable pega o valor que está na URL e coloca
			 * dentro do parâmetro do método.
			 *
			 * Exemplo:
			 *
			 * URL:
			 * /workers/1/income/2026/8
			 *
			 * id = 1
			 */
			@PathVariable Long id,

			/*
			 * Pega o ano informado na URL.
			 */
			@PathVariable Integer year,

			/*
			 * Pega o mês informado na URL.
			 */
			@PathVariable Integer month) {

		/*
		 * Busca o Worker pelo ID utilizando o WorkerRepository.
		 *
		 * findById() retorna um Optional<Worker>.
		 *
		 * O .get() extrai o Worker de dentro do Optional.
		 *
		 * ATENÇÃO:
		 * Se o ID não existir no banco, .get() lançará uma exceção.
		 * Em uma API real, normalmente trataríamos esse caso para
		 * retornar HTTP 404 (Not Found).
		 */
		Worker worker = workerRepository.findById(id).get();

		/*
		 * Cria o DTO que será devolvido pela API.
		 *
		 * worker.getName()
		 *     → nome do trabalhador
		 *
		 * worker.getDepartment().getName()
		 *     → nome do departamento
		 *
		 * worker.income(year, month)
		 *     → calcula a renda do trabalhador no período solicitado
		 *
		 * O Controller, portanto, coordena a operação:
		 *
		 * Repository → busca os dados
		 * Entity     → executa a regra de cálculo
		 * DTO        → define os dados da resposta
		 */
		return new WorkerIncomeDTO(
				worker.getName(),
				worker.getDepartment().getName(),
				worker.income(year, month)
		);
	}
}