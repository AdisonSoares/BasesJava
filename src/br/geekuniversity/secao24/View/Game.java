package br.geekuniversity.secao24.View;
import br.geekuniversity.secao24.Model.Calcular;
import java.util.Scanner;

/**
 * @Projeto_Game
 */
public class Game {

    //Variaveis globais, uso fora do main
    static Scanner sc = new Scanner(System.in);
    static int pontos = 0;
    static Calcular calc;

    //metodo main
    public static void main(String[] args) {
        Game.jogar();
    }

    //Metodo principal
    public static void jogar() {
        System.out.print("Informe o nivel de dificuldade entre 1, 2, 3 ou 4: ");
        int dificuldade = Game.sc.nextInt();
        Game.calc = new Calcular(dificuldade);
        System.out.println("Informe o resultado da seguinte operacao:");

        //Somar
        if (calc.getOperacao() == 0) {
            System.out.println(calc.getValor1() + " + " + calc.getValor2());
            int resposta = Game.sc.nextInt();

            if (calc.somar(resposta)) {
                //Se estiver certo ganha 1 ponto
                Game.pontos++;
                System.out.println("Voce tem: " + Game.pontos + " ponto(s)");
            }
        }

        //Diminuir
        else if (calc.getOperacao() == 1) {
            System.out.println(calc.getValor1() + " - " + calc.getValor2());
            int resposta = Game.sc.nextInt();

            if (calc.diminuir(resposta)) {
                //Se estiver certo ganha 1 ponto
                Game.pontos++;
                System.out.println("Voce tem: " + Game.pontos + " ponto(s)");
            }
        }

        //Multiplicar
        else if (calc.getOperacao() == 2) {
            System.out.println(calc.getValor1() + " x " + calc.getValor2());
            int resposta = Game.sc.nextInt();

            if (calc.multiplicar(resposta)) {
                //Se estiver certo ganha 1 ponto
                Game.pontos++;
                System.out.println("Voce tem: " + Game.pontos + " ponto(s)");
            }
        }
        else{
            System.out.println("Operacao "+calc.getOperacao()+" invalida!");
        }

        System.out.print("Se deseja continuar clique: 1-sim ou 0-nao: ");
        int continuar = Game.sc.nextInt();

        if (continuar == 1) {
            //Para iniciar o jogo e escolher nova dificuldade, nao perde os pontos
            Game.jogar();
        }else{
            System.out.println("Voce fez "+Game.pontos+" ponto(s), parabens!!!");
            System.out.println("Game over!");
            System.exit(0);
        }
    }
}
