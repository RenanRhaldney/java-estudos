package overview;

public class EnumerationOverview {

    public static void main(String[] args) {

        /*
         * ==========================================================
         * ENUM (Enumeration)
         * ==========================================================
         *
         * Enum é um tipo especial de classe utilizado para representar
         * um conjunto fixo de constantes.
         *
         * Exemplos:
         * - Dias da semana
         * - Status de pedido
         * - Níveis de acesso
         * - Categorias de produtos
         *
         * Vantagens:
         * ✔ Mais segurança (Type Safety)
         * ✔ Evita Strings inválidas
         * ✔ Código mais organizado e legível
         */

        // Atribuindo um valor ao enum
        OrderStatus status = OrderStatus.PENDING;

        System.out.println("Status atual: " + status);

        // ==========================================================
        // name()
        // Retorna o nome da constante exatamente como foi declarada.
        // ==========================================================

        System.out.println(status.name());

        // Saída:
        // PENDING

        // ==========================================================
        // ordinal()
        // Retorna a posição da constante (começando em 0).
        // Evite usar em regras de negócio.
        // ==========================================================

        System.out.println(status.ordinal());

        // Saída:
        // 0

        // ==========================================================
        // values()
        // Retorna um vetor contendo todos os valores do enum.
        // Muito utilizado para percorrer todas as opções.
        // ==========================================================

        System.out.println("\nTodos os status:");

        for (OrderStatus s : OrderStatus.values()) {
            System.out.println(s);
        }

        // ==========================================================
        // valueOf()
        // Converte uma String para Enum.
        // A String deve ser exatamente igual ao nome da constante.
        // ==========================================================

        OrderStatus status2 = OrderStatus.valueOf("DELIVERED");

        System.out.println("\nConvertido da String:");
        System.out.println(status2);

        // Caso a String não exista:
        //
        // OrderStatus.valueOf("ABC");
        //
        // Será lançada:
        // IllegalArgumentException

        // ==========================================================
        // Comparando enums
        // Como enum é uma constante única, utilize ==
        // ==========================================================

        if (status == OrderStatus.PENDING) {
            System.out.println("\nPedido ainda está pendente.");
        }

        // Também é possível utilizar switch

        switch (status) {

        case PENDING:
            System.out.println("Aguardando processamento.");
            break;

        case PROCESSING:
            System.out.println("Pedido em processamento.");
            break;

        case SHIPPED:
            System.out.println("Pedido enviado.");
            break;

        case DELIVERED:
            System.out.println("Pedido entregue.");
            break;

        case CANCELED:
            System.out.println("Pedido cancelado.");
            break;
        }

        // ==========================================================
        // Enum com atributos
        // ==========================================================

        UserLevel level = UserLevel.ADMIN;

        System.out.println("\nNível: " + level);
        System.out.println("Código: " + level.getCode());

    }

}

/*
 * ==========================================================
 * Enum simples
 * ==========================================================
 */
enum OrderStatus {

    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELED;

}

/*
 * ==========================================================
 * Enum com atributos
 * ==========================================================
 */
enum UserLevel {

    ADMIN(1),
    MANAGER(2),
    EMPLOYEE(3);

    // Atributo
    private int code;

    // Construtor (sempre privado)
    UserLevel(int code) {
        this.code = code;
    }

    // Getter
    public int getCode() {
        return code;
    }

}