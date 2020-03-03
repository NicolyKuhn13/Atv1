/*Utilizando os conceitos abordados até o momento (tipos primitivos e vetores)
implemente um sistema em Java que irá simular um jogo de sorteio de dados. 
O jogo consiste no usuário tentar adivinhar a soma de dois dados aleatórios. 
Ao iniciar, o usuário deve informar o nome e uma quantidade de fichas.
A cada jogada o usuário deve informar o valor da soma e também uma quantidade de fichas para apostar. 
O usuário não pode apostar mais fichas do que possui. 
O sistema sorteia dois números aleatórios entre 1 e 6. Se o palpite for correto, 
o usuário recebe o dobro do que foi apostado. Se o palpite for próximo (+/- 1) o usuário recebe metade do que foi apostado. 
O jogo termina quando o usuário desejar sair ou acabar suas fichas. 
Deve ser mostrado um relatório da partida, informando o número de jogadas, a quantidade de acertos, 
a quantidade de fichas ganhas e a quantidade de fichas perdidas.*/

import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){

        String user;
        int fichas, fichaJogada;
        int num1, num2;
        int palpite, soma;
        Scanner scan = new Scanner(System.in);

        System.out.printf("\nInforme o seu nome de Usuário: ");
        user = scan.nextLine();

        System.out.printf("\nBem vind@ %s\n\n", user);

        System("Agora informe a quantidade de fichas que possui: ");
        fichas = scan.nextInt();

        Random rand = new Random();

        while(fichas != 0){
            
            num1 = rand.nextInt(6)+1;
            num2 = rand.nextInt(6)+1;

            soma = num1 + num2;

            System.out.printf("\nFaça sua jogada, informe o seu palpite (soma de dois números entre 1 e 6): ");
            palpite = scan.nextInt();
            System.out.printf("\nInforme a quantidade de fichas que irá apostar: ");
            fichaJogada = scan.nextInt();

            if(palpite == soma){
                System.out.printf("Parabéns, você acertou o valor!!");
            }

            fichas = fichas - fichaJogada;
        }
            
    }
}