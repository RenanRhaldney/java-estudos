package com.renan.datahora.conteudo.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOverview {

    public static void main(String[] args) {

        // ==========================================================
        // DATA ATUAL
        // ==========================================================

        titulo("1. DATA ATUAL (LocalDate.now())");

        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        // ==========================================================
        // HORÁRIO ATUAL
        // ==========================================================

        titulo("2. HORÁRIO ATUAL (LocalTime.now())");

        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);

        // ==========================================================
        // DATA E HORA ATUAL
        // ==========================================================

        titulo("3. DATA E HORA ATUAL (LocalDateTime.now())");

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);

        // ==========================================================
        // DATA E HORA UTC
        // ==========================================================

        titulo("4. DATA E HORA UTC (Instant.now())");

        Instant instanteUtc = Instant.now();
        System.out.println(instanteUtc);

        // ==========================================================
        // CRIANDO DATAS
        // ==========================================================

        titulo("5. CRIANDO DATAS");

        LocalDate aniversario = LocalDate.of(1998, 12, 20);
        LocalDateTime reuniao = LocalDateTime.of(2026, 8, 10, 14, 30);

        System.out.println("LocalDate.of(): " + aniversario);
        System.out.println("LocalDateTime.of(): " + reuniao);

        // ==========================================================
        // CONVERTENDO STRING PARA DATA
        // ==========================================================

        titulo("6. CONVERTENDO STRING PARA DATA");

        LocalDate data = LocalDate.parse("2026-08-03");
        LocalDateTime dataHora = LocalDateTime.parse("2026-08-03T15:30:00");
        Instant utc = Instant.parse("2026-08-03T18:30:00Z");

        System.out.println("LocalDate.parse(): " + data);
        System.out.println("LocalDateTime.parse(): " + dataHora);
        System.out.println("Instant.parse(): " + utc);

        // ==========================================================
        // FORMATAÇÃO
        // ==========================================================

        titulo("7. FORMATANDO DATAS");

        DateTimeFormatter formatoBrasileiro =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formatoCompleto =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Formato brasileiro: "
                + data.format(formatoBrasileiro));

        System.out.println("Formato completo: "
                + dataHora.format(formatoCompleto));

        // ==========================================================
        // SOMANDO TEMPO
        // ==========================================================

        titulo("8. SOMANDO TEMPO");

        System.out.println("plusDays(10): " + data.plusDays(10));
        System.out.println("plusMonths(2): " + data.plusMonths(2));
        System.out.println("plusYears(1): " + data.plusYears(1));
        System.out.println("plusHours(5): " + dataHora.plusHours(5));
        System.out.println("plusMinutes(30): " + dataHora.plusMinutes(30));

        // ==========================================================
        // SUBTRAINDO TEMPO
        // ==========================================================

        titulo("9. SUBTRAINDO TEMPO");

        System.out.println("minusDays(5): " + data.minusDays(5));
        System.out.println("minusMonths(1): " + data.minusMonths(1));
        System.out.println("minusYears(2): " + data.minusYears(2));

        // ==========================================================
        // OBTENDO INFORMAÇÕES
        // ==========================================================

        titulo("10. OBTENDO INFORMAÇÕES DA DATA");

        System.out.println("getDayOfMonth(): " + data.getDayOfMonth());
        System.out.println("getMonth(): " + data.getMonth());
        System.out.println("getYear(): " + data.getYear());
        System.out.println("getDayOfWeek(): " + data.getDayOfWeek());
        System.out.println("getDayOfYear(): " + data.getDayOfYear());

        // ==========================================================
        // PRIMEIRO E ÚLTIMO DIA DO MÊS
        // ==========================================================

        titulo("11. PRIMEIRO E ÚLTIMO DIA DO MÊS");

        System.out.println("Primeiro dia: " + data.withDayOfMonth(1));
        System.out.println("Último dia: "
                + data.withDayOfMonth(data.lengthOfMonth()));

        // ==========================================================
        // COMPARAÇÃO
        // ==========================================================

        titulo("12. COMPARANDO DATAS");

        LocalDate data1 = LocalDate.of(2026, 1, 10);
        LocalDate data2 = LocalDate.of(2026, 5, 20);

        System.out.println("isBefore(): " + data1.isBefore(data2));
        System.out.println("isAfter(): " + data2.isAfter(data1));
        System.out.println("isEqual(): " + data1.isEqual(data2));

        // ==========================================================
        // PERIOD
        // ==========================================================

        titulo("13. DIFERENÇA ENTRE DATAS (Period)");

        Period periodo = Period.between(data1, data2);

        System.out.println("Anos: " + periodo.getYears());
        System.out.println("Meses: " + periodo.getMonths());
        System.out.println("Dias: " + periodo.getDays());

        // ==========================================================
        // DURATION
        // ==========================================================

        titulo("14. DIFERENÇA ENTRE HORÁRIOS (Duration)");

        Duration duracao = Duration.between(
                LocalTime.of(8, 0),
                LocalTime.of(12, 30));

        System.out.println("Horas: " + duracao.toHours());
        System.out.println("Minutos: " + duracao.toMinutes());

        // ==========================================================
        // FUSO HORÁRIO
        // ==========================================================

        titulo("15. FUSOS HORÁRIOS");

        ZoneId brasil = ZoneId.of("America/Sao_Paulo");
        ZoneId londres = ZoneId.of("Europe/London");
        ZoneId toquio = ZoneId.of("Asia/Tokyo");

        System.out.println("Brasil: " + brasil);
        System.out.println("Londres: " + londres);
        System.out.println("Tóquio: " + toquio);

        // ==========================================================
        // UTC -> FUSO HORÁRIO
        // ==========================================================

        titulo("16. CONVERTENDO UTC PARA OUTRO FUSO");

        ZonedDateTime brasilTime = instanteUtc.atZone(brasil);
        ZonedDateTime londonTime = instanteUtc.atZone(londres);

        System.out.println("Brasil: " + brasilTime);
        System.out.println("Londres: " + londonTime);

        // ==========================================================
        // INSTANT -> LOCALDATETIME
        // ==========================================================

        titulo("17. INSTANT PARA LOCALDATETIME");

        LocalDateTime horarioBrasil =
                LocalDateTime.ofInstant(instanteUtc, brasil);

        System.out.println(horarioBrasil);

        // ==========================================================
        // TIMESTAMP
        // ==========================================================

        titulo("18. TIMESTAMP");

        System.out.println("System.currentTimeMillis(): "
                + System.currentTimeMillis());

        System.out.println("Instant.now().toEpochMilli(): "
                + Instant.now().toEpochMilli());

        // ==========================================================
        // LOCALDATE -> LOCALDATETIME
        // ==========================================================

        titulo("19. LOCALDATE PARA LOCALDATETIME");

        System.out.println(data.atStartOfDay());

        // ==========================================================
        // LOCALDATE + LOCALTIME
        // ==========================================================

        titulo("20. LOCALDATE + LOCALTIME");

        LocalDateTime dataHoraCompleta =
                LocalDateTime.of(data, LocalTime.of(15, 45));

        System.out.println(dataHoraCompleta);

        // ==========================================================
        // FORMATOS ISO
        // ==========================================================

        titulo("21. FORMATOS ISO");

        System.out.println(DateTimeFormatter.ISO_DATE.format(dataHora));

        System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(dataHora));

        // ==========================================================
        // FUSO PADRÃO DA JVM
        // ==========================================================

        titulo("22. FUSO PADRÃO DA JVM");

        System.out.println(ZoneId.systemDefault());

    }

    /**
     * Exibe um título padronizado para separar os exemplos no console.
     */
    private static void titulo(String texto) {

        System.out.println();
        System.out.println("==========================================================");
        System.out.println(texto);
        System.out.println("==========================================================");
    }

}