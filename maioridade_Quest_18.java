package if_else;

import java.util.Scanner;

public class maioridade_Quest_18 {

    /**
     *Faça um programa que receba a idade de uma pessoa e mostre a mensagem de
     *maioridade ou não.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a idade da pessoa: ");
        byte id = ler.nextByte();
        
        if(id > 18){
            System.out.println("MAIOR DE IDADE!");
        }else{
            System.out.println("NÃO É DE MAIOR IDADE!");
        }
    }
    
}
