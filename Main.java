/*Faça um programa em Java que no intervalo de 1 a 2500:
mostre todos os números que divididos por 11 que tem resto 5; 
mostre os números que são pares;
mostre os números que são ímpares;
mostre todos os números primos;*/


public class Main{
  public static void main(String[] args){

    int[] vetor = new int[2500];

    for(int i = 0; i < 2500; i++){
      vetor[i] = i+1;
    }

    //divisao por 11 q o resto eh 5

    System.out.printf("\nnum q dividindo 11 resta 5:\n");

    for(int i = 0; i < 2500; i++){
      if(vetor[i] % 11 == 5){
        System.out.println(vetor[i]);
      }
    }

    //numeros pares

    System.out.printf("\nnum pares:\n");

    for(int i = 0; i < 2500; i++){
      if(vetor[i] % 2 == 0){
        System.out.println(vetor[i]);
      }
    }

    //numeros pares

    System.out.printf("\nnum ipares:\n");

    for(int i = 0; i < 2500; i++){
      if(vetor[i] % 2 != 0){
        System.out.println(vetor[i]);
      }
    }

  }
}