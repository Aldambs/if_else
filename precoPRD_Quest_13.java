package if_else;

import java.util.Scanner;

public class precoPRD_Quest_13 {

    /**
     * Faça um programa que receba o preço de um produto, calcule e mostre, de 
     * acordo com as tabelas a seguir, o novo preço e a classificação.
        TABELA 1 – PERCENTUAL DE AUMENTO
        Preço                           %
        Até R$ 50,00                     5
        Entre R$50,00 e R$ 100,00       10
        Acima de R$ 100,00              15
        TABELA 2 - CLASSIFICAÇÕES
        Novo preço                                   %
        Até R$ 80,00                               Barato
        Entre R$ 80,00 e R$ 120,00(inclusive)      Normal
        Entre R$ 120,00 e R$ 200,00(inclusive)     Caro
        Maior que R$ 200,00                        Muito caro
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        float valorPRD = ler.nextFloat();
        float novoPRE = 0;
        
        if(valorPRD <= 50){
            novoPRE = valorPRD + (valorPRD * 0.05f);
        }
        if(valorPRD > 50 && valorPRD <= 100){
            novoPRE = valorPRD + (valorPRD * 0.10f);
        }
        if(valorPRD > 100){
            novoPRE = valorPRD + (valorPRD * 0.15f);
        }
        System.out.println("O novo preço é = " +novoPRE);
        
        if(novoPRE <= 80){
            System.out.println("BARATO!");
        }
        if(novoPRE > 80 && novoPRE <= 120){
            System.out.println("NORMAL!");
        }
        if(novoPRE > 120 && novoPRE <= 200){
            System.out.println("CARO!");
        }
        if(novoPRE > 200){
            System.out.println("MUITO CARO!");
        }       
    }
    
}
