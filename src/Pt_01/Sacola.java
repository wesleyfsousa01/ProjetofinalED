/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pt_01;

import java.util.AbstractMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import Metodos_Ordenacao.Metodos;

/**
 *
 * @author Wesley Ferreira <Wesleyfsousa01@gmail.com>
 */
public class Sacola {
    
    public static void main (String [] args){
        ArrayList numerosRemovidos = new ArrayList();
        ArrayList numerosIseridos = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        int numeroDeOperacoes;
        while(true){
            System.out.println("Digite o número de operações que deseja realizar: \n");
            numeroDeOperacoes = sc.nextInt();
            if(numeroDeOperacoes>0 && numeroDeOperacoes<100){
                ArrayList lista = new ArrayList();
                
                boolean tipoPilha = true;
                boolean tipoFila = true;
                boolean tipoFilaDePrioridade = true;
                for (int i=0;i<numeroDeOperacoes;i++){
                    
                    System.out.println("Digite a operação que deseja realizar");
                    System.out.println("Opção [1](Inserir)/ Opção [2](remover): \n");
                    int operacao = sc.nextInt();
                    if(operacao == 1){
                        System.out.println("Digite o número que deseja inserir na sacola");
                        int numero = sc.nextInt();
                        if(numero >= 0 && numero <= 100){
                            lista.add(numero);
                            numerosIseridos.add(numero);
                            
                        }else {
                            System.out.println("Digite um número entre 0 e 100");
                                numeroDeOperacoes +=1; 
                            }
                    } else if (operacao == 2){
                            if(lista.isEmpty()){
                                System.out.println("Não existem elementos na sacola");
                                numeroDeOperacoes +=1;
                            }
                            else{
                                System.out.println("Digite o elemento que deseja remover: \n");
                                try {
                                    int n = sc.nextInt();
                                    
                                    if(lista.contains(n)){
                                        
                                        if(!lista.get(lista.size()-1).equals(n)){
                                            tipoPilha = false;
                                        }else if(!lista.get(0).equals(n)){
                                            tipoFila = false;
                                        
                                        }else if(n >(int) numerosRemovidos.get(0)){
                                            tipoFilaDePrioridade = false;
                                        }
                                    numerosRemovidos.add(n); //Salva as remoções;
                                        
                                    lista.remove(Integer.valueOf(n)); 
                                    //Remove o elemento espeficado da lista 
                                    System.out.println("Numero removido: " + n);
                                    //números da sacola
                                    System.out.println("Sacola:");
                                    System.out.println(lista.toString());
                                    } else{
                                            System.out.println("O número não existe na Sacola");
                                            numeroDeOperacoes +=1;
                                            
                                        }                            

                                    
                     
                                    
                                } catch (Exception e) {
                                    System.out.println("O número informado não existe na sacola");
                                    numeroDeOperacoes+=1;
                                }
                            }
                        }else{
                            System.out.println("Só são válidas duas opções \n)");
                            numeroDeOperacoes +=1;
                        }
                }
                //Definição da estrutura de dados
                if(tipoPilha){
                    System.out.println("É definitivamente uma pilha!");
                } else if (tipoFila){
                    System.out.println("É definitivamente uma fila!");
                    
                }else if(!tipoPilha && tipoFilaDePrioridade ){
                    System.out.println("Fila de priridade");
                }else{
                    System.out.println("Impossivel definir");
                }
                
                lista.clear();
                System.out.println("Programa Encerrado!!!");
                
            }else {
                System.out.println("Digite um número inteiro entre 1 e 100! \n");
            }
    }
}
}
