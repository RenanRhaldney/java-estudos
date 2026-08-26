package com.renan.tratamentoexcecoes.conteudo.exceptions;

/**
 * Exceção personalizada utilizada para representar
 * violações de regras de negócio da aplicação.
 *
 * RuntimeException:
 * ------------------------------------------------------------
 * É uma exceção não verificada (unchecked exception).
 *
 * Isso significa que não somos obrigados a utilizar
 * try-catch ou throws para todos os métodos que podem
 * lançar essa exceção.
 */
public class DomainException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DomainException(String message) {
        super(message);
    }
}