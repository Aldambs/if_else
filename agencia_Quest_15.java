package if_else;

import java.util.Scanner;

public class agencia_Quest_15 {

    /**
     * Uma agência bancária possui dois tipos de investimentos, conforme o quadro
     * a seguir. Faça um programa que receba o tipo de investimento e o valor do 
     * investimento e que calcule e mostre o valor corrigido de acordo com o tipo
     * de investimento.
       Tipo                 Descrição           Rendimento Mensal
         1                  Poupança                 3%
         2                  Fundos de renda fixa     4%
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("DIGITE O TIPO DE INVESTIMENTO: ");
        byte tipo = ler.nextByte();
        System.out.print("DIGITE O VALOR DO INVESTIMENTO: ");
        float valorI = ler.nextFloat();
        float valorC = 0;
        
        if(tipo == 1){
            valorC = valorI + (valorI *0.03f);
        }
        if(tipo == 2){
           valorC = valorI + (valorI *0.04f); 
        }
        System.out.println("O valor corrigido = " +valorC);
    }
    
}
