/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pt_02;
import java.util.Scanner;
import Metodos_Ordenacao.Metodos;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Wesley Ferreira <Wesleyfsousa01@gmail.com>
 */
public class Teste {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        
        for(int j=0;j<5;j++){
         
        System.out.println("Digite o tamanho do Array a ser ordenado:");
        int tamanhoDoVetor = sc.nextInt();
        int vet[] = new int[tamanhoDoVetor];
        
        
        //preenche o tamanho do vetor aleatóriamente
        for (int i=0; i < vet.length; i++){
            vet[i] = (int) (Math.random() * vet.length);
        }
        
//         Desordenado
//        System.out.println("Vetor desornedado\n");
//        for(int i=0;i < vet.length; i++){
//            System.out.println(vet[i] + " ");   
//       }
        
        
        if(vet.length < 1000000){
            //BubbleSort
            long tempoInicialB = System.currentTimeMillis();
            Metodos.bubbleSort(vet);
            long tempoFinalB = System.currentTimeMillis();

            long tempoDexecussaoB = tempoFinalB - tempoInicialB  ;

            System.out.println("Tempo de execução BubbleSort: "+tempoDexecussaoB);
            
            //InsertionSort
            long tempoInicialIns = System.currentTimeMillis();
            Metodos.isertionSort(vet);
            long tempoFinalIns = System.currentTimeMillis();

            long tempoDexecussaoIns = tempoFinalIns - tempoInicialIns  ;

            System.out.println("Tempo de execução InsertionSort: "+tempoDexecussaoIns);
            
            //Selection
            long tempoInicialSel = System.currentTimeMillis();
            Metodos.selectionSort(vet);
            long tempoFinalSel = System.currentTimeMillis();

            long tempoDexecussaoSel = tempoFinalSel - tempoInicialSel  ;

            System.out.println("Tempo de execução SelectionSort: "+tempoDexecussaoSel);
            
        }
        
             
        //Ordenado
        //System.out.println("\n -------- Vetor ordenado-------\n");
        //Captura o tempo inicial
        
        //ShellSort
        long tempoInicialShel = System.currentTimeMillis();
        Metodos.shellSort(vet);
        //Captura o tempo final
        long tempoFinalShel = System.currentTimeMillis();
        //Diferença
        long tempoDeExecucaoShel = (tempoFinalShel - tempoInicialShel);
        
        System.out.println("Tempo de execução ShellSort: "+tempoDeExecucaoShel);
        
        //QuickSort
        long tempoInicialQuick = System.currentTimeMillis();
        Metodos.quickSort(vet);
        //Captura o tempo final
        long tempoFinalQuick = System.currentTimeMillis();
        //Diferença
        long tempoDeExecucaoQuick = (tempoFinalQuick - tempoInicialQuick);
        
        System.out.println("Tempo de execução QuickSort: "+tempoDeExecucaoQuick);
        
       //MergeSort
        long tempoInicialMerg = System.currentTimeMillis();
        Metodos.mergeSort(vet);
        //Captura o tempo final
        long tempoFinalMerg = System.currentTimeMillis();
        //Diferença
        long tempoDeExecucaoMerg = (tempoFinalMerg - tempoInicialMerg);
        
        System.out.println("Tempo de execução ShellSort: "+tempoDeExecucaoMerg);
            
        
        
//        for(int i=0;i < vet.length; i++){
//            System.out.println(vet[i] + "");   
//        }
        

    }
        
}
 
} 
