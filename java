package com.mycompany.primeiraaulajava;

/**
 *
 * @author aluno
 */

import java.util.Scanner;

public class PrimeiraaulaJava {

    public static void main(String[] args) {
            //sintaxe padrão do java
            //semppre que terminar algum código pracisa adicionar ;
       
            //int n;
        
        float num1, num2, num3, media;
        Scanner dado;
        dado = new Scanner(System.in);
            //armazena os dados
      
            //.out.println->printar na tela
            //.in.não printa na tela 
            //adicionar o ln no fim significa que vai para linha de baixo,
            //se não, fica tudo na mesma linha.
        //System.out.println("Digite um número inteiro: ");
        //n = dado.nextInt();
        
        System.out.println("Digite a 1º nota: ");
         num1 = dado.nextFloat();
         
           System.out.println("Digite a 2º nota: ");
         num2 = dado.nextFloat();
         
           System.out.println("Digite a 3º nota: ");
         num3 = dado.nextFloat();
         
         media = (num1 + num2 + num3)/3;
                 
         System.out.println("A média dos números são: " + media);
         
         if((media >= 7) && (media <= 10)){
            System.out.println("Aprovado!");}
              
         else{
            System.out.println("Reprovado!");
                        
                        }
         }
    }
