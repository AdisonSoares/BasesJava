package br.geekuniversity.secao22;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @Datas
 */
public class Programa82 {
    public static void main(String[] args) {

        //Devolve a data atual no formato internacional ISO
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        //Criando datas a partir de uma especifica
        LocalDate ano_novo = LocalDate.of(2023, Month.JANUARY, 1);
        System.out.println(ano_novo);

        //Acesso individual
        int ano = ano_novo.getYear();
        Month mes = ano_novo.getMonth();
        int dia = ano_novo.getDayOfMonth();

        System.out.println("O ano novo sera no dia "+dia+"º do mes de "+mes+" do ano de "+ano);

        //Quanto tempo falta de hoje para o ano novo
        Period periodo = Period.between(hoje, ano_novo);
        System.out.println(periodo);

        //Acesso individual
        System.out.println("Faltam "+periodo.getYears()+" anos, "+periodo.getMonths()+" meses e "+periodo.getDays()+" dias para o ano novo");

        //Formatar a partir de um fora do padrao internacional - DATA
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatar));

        //Exibir a data e hora - Formado ISO internacional
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        //Formatar a partir de um fora do padrao internacional - DATA e HORA
        DateTimeFormatter formatar_hora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(agora.format(formatar_hora));

        //Horario de intervalos
        LocalTime intervalo = LocalTime.of(9, 30);
        System.out.println(intervalo);

    }
}
