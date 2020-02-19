/*Faça um programa em Java que peça para o usuário informar uma quantidade de números que irá digitar bem como ler esta quantidade de números. O programa deve verificar se os números estão em ordem crescente. Se não estiver, deve ordenar em ordem crescente. O algoritmo de ordenação deve ser escrito por você.*/

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    int quantNum;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Informe a quantidade de numeros que ira digitar: ");
    
    quantNum = scan.nextInt();

    Scanner[] vetor = new Scanner[quantNum];

    for(int i = 0; i < quantNum; i++){
      vetor[i] = scan.nextInt();
    } 

    for(int i = 0; i < quantNum; i++){
      System.out.println(+vetor[i]);
    }

  }
}
