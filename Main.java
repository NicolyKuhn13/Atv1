package tads.oo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static Random rand = new Random();

    private static int sortearDados() {
        int[] dados = new int[2];

        dados[0] = rand.nextInt(6) + 1;
        dados[1] = rand.nextInt(6) + 1;

        System.out.println("Dados sorteados! " + dados[0] + " + " + dados[1] + " = " + (dados[0] + dados[1]));

        return dados[0] + dados[1];
    }

    public static void main(String[] args) {
        int soma;
        int jogada;
        int fichas = 0;
        int aposta = 0;
        boolean jogando = true;

        System.out.println("Quantas fichas você deseja comprar? ");
        fichas = scan.nextInt();

        while (jogando && fichas > 0) {
            System.out.println("Você possuí " + fichas + " fichas.");
            System.out.println("Digite -1 para Sair, ou ...");
            System.out.println("Digite a Soma dos Dados para Jogar:");
            jogada = scan.nextInt();

            if (jogada < 0) {
                jogando = false;
                System.out.println("Saindo do Jogo...");
            } else {
                System.out.println("Quantas fichas deseja apostar?");
                aposta = scan.nextInt();

                if (aposta <= fichas) {
                    fichas -= aposta;

                    soma = sortearDados();
                    if (jogada == soma) {
                        fichas += (2 * aposta);
                        System.out.println("Acertou em cheio! Ganhou " + (2 * aposta) + " fichas.");
                    } else if (jogada == soma - 1 || jogada == soma + 1) {
                        fichas += (aposta / 2);
                        System.out.println("Quase acertou! Ganhou " + (aposta / 2) + " fichas.");
                    } else {
                        System.out.println("Não foi dessa vez! :(");
                    }
                } else {
                    System.out.println("Fichas insuficientes!");
                }
            }

            System.out.println();
        }
    }
}
