/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos_Ordenacao;

import java.util.Arrays;

/**
 *
 * @author wesley
 */
public class Metodos {
    
    
    public static void bubbleSort(int vet []){
        int vetor [];
        int temp;
        boolean controle;
        vetor = vet;
         for(int i = 0; i < vetor.length; ++i){
            controle = true;
            for(int j = 0; j < (vetor.length - 1); ++j){

            if(vetor[j] > vetor[j + 1]){
            temp = vetor[j];
            vetor[j] = vetor[j + 1];
            vetor[j + 1] = temp;
            controle = false;
            }
            }
            if(controle){
            break;
            }

        }
    }
    
    public static void selectionSort(int vet []){
        int vetor [];
        vetor = vet;
        int menor, aux;
        for(int i=0; i < vetor.length; i++){
            menor = i;
            for(int j= i+1; j < vetor.length; j++){
                if (vetor[j] < vetor[i]){
                    menor = j;
                }
            }
            aux = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = aux;   
        }
    }
    
    public static void isertionSort(int vet []){
        int vetor [];
        vetor = vet;
        int aux ,j;
        for(int i=1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1;
            while (j > 0 && vetor[j] > aux){
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
    }
        // Metodo quickSort
    public static void quickSort(int[] vetor){
        ordenacao(vetor, 0, vetor.length -1);
    }
    
    private static void ordenacao(int[] vetor, int esquerda, int direita){
        
        if(esquerda < direita){
            int pivo = particao (vetor, esquerda, direita);
            ordenacao(vetor, esquerda, pivo);
            ordenacao(vetor, pivo +1 ,direita);
        }
    }

    private static int particao(int[] vetor, int esquerda, int direita) {
        int meio = (esquerda + direita) /2;
        int pivo = vetor[meio];
        int i = esquerda -1;
        int j = direita +1;
        while(true){
            do{
                i++;
            }while(vetor[i] < pivo);
            do{
                j--;
            }while(vetor[j] > pivo);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux; 
        }
    }
        // Metodo MergeSort
      public static void mergeSort(int[] vetor){
        int [] aux = new int[vetor.length];
        ordenar(vetor, aux, 0, vetor.length -1);
        
    }
    
     private static void ordenar(int[] vet, int[] aux, int inicio, int fim ){
        if ( inicio < fim){
            int meio = (inicio + fim)/2;
            
            ordenar(vet, aux, inicio, meio);
            ordenar(vet, aux, meio+1, fim );
            intercalar(vet, aux, inicio, meio, fim);
        }
    }

    private static void intercalar(int[] vet, int[] aux, int inicio, int meio, int fim) {
        for (int k = inicio; k <= fim; k++)
            aux[k] = vet[k];
        
        int i = inicio;
        int j = meio +1;
        
        for(int k=inicio;k <= fim; k++){
        if (i > meio){
            vet[k] = aux[j++];
            }
        else if (j > fim){
            vet[k] = aux [i++];
        }
        else if (aux[i] < aux [j]){
            vet[k] = aux[i++];
        }
        else{
            vet[k] = aux[j++];
        }
        }
    }
    //Metodo shellSort
    public static void shellSort(int vetor[]){
        int h =1;
        int n = vetor.length;
        
        while(h < n){
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);
        
        int elemento, j;
        while (h > 0){
            for(int i=h; i<n;i++){
                elemento = vetor[i];
                j = i;
                while (j >= h && vetor[j - h] > elemento){
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = elemento;
            }
            h = h/2;
        }
    }
}

    

