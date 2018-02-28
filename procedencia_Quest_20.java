package if_else;

import java.util.Scanner;

public class procedencia_Quest_20 {

    /**
     * Faça um programa que receba o preço de um produto e o seu código de origem
     * e mostre a sua procedência . A procedência obedece à tabela a seguir.
       Código de origem                 Procedência
             1                             Sul
             2                             Norte
             3                             Leste
             4                             Oeste
             5 ou 6                        Nordeste
             7 ou 8 ou 9                   Sudeste
             10 a 20                       Centro – Oeste
             21 a 30                       Nordeste
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double preco = ler.nextDouble();
        System.out.print("Digite o código de origem: ");
        byte cod = ler.nextByte();
        
        if(cod == 1){
            System.out.println("A procedência é do SUL");
        }
        if(cod == 2){
            System.out.println("A procedência é do NORTE");
        }
        if(cod == 3){
            System.out.println("A procedência é do LESTE");
        }
        if(cod == 4){
            System.out.println("A procedência é do OESTE");
        }
        if(cod == 5 || cod == 6){
            System.out.println("A procedência é do NORDESTE");
        }
        if(cod == 7 || cod == 8 || cod == 9){
            System.out.println("A procedência é do SUDESTE");
        }
        if(cod >= 10 && cod <= 20){
            System.out.println("A procedência é do CENTRO OESTE");
        }
        if(cod >= 21 && cod <= 30){
            System.out.println("A procedência é do NORDESTE");
        }
    }
    
}
