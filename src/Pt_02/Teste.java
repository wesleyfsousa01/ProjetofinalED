/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pt_02;
import Metodos_Ordenacao.Metodos;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Wesley Ferreira <Wesleyfsousa01@gmail.com>
 */
public class Teste {
    public static void main (String[] args){
        int []vet = new int [1000000];
        
        for (int i=0; i < vet.length; i++){
            vet[i] = (int) (Math.random() * vet.length);
        }
        
        // Desordenado
        //System.out.println("Vetor desornedado\n");
//        for(int i=0;i < vet.length; i++){
//            System.out.println(vet[i] + " ");   
//        }
        
        
        
        
        
        //Ordenado
        //System.out.println("\n -------- Vetor ordenado-------\n");
        //Captura o tempo inicial
        long tempoInicial = System.currentTimeMillis();
        Metodos.mergeSort(vet);
        //Captura o tempo final
        long tempoFinal = System.currentTimeMillis();
        //Diferença
        long tempoDeExecucao = (tempoFinal - tempoInicial);
        
//        for(int i=0;i < vet.length; i++){
//            System.out.println(vet[i] + "");   
//        }
        
        System.out.println("Tempo de Execução: " + tempoDeExecucao);
        
}
 
} 
