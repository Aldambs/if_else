package if_else;

import java.util.Scanner;

public class media4nota_quest_01 {
    /**
     * Faça um programa que receba quatro notas de um aluno, calcule e mostre a
     * média aritmética das notas e a mensagem de aprovado ou reprovado, 
     * considerando para aprovação média 7.
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       float not1, not2, not3, not4, med;
       System.out.print("Digite a 1º nota: ");
       not1 = ler.nextFloat();
       System.out.print("Digite a 2º nota: ");
       not2 = ler.nextFloat();
       System.out.print("Digite a 3º nota: ");
       not3 = ler.nextFloat();
       System.out.print("Digite a 4º nota: ");
       not4 = ler.nextFloat();
       
       med = (not1 + not2 + not3 + not4) / 4;
       
       if(med < 7){
           System.out.println("Média = " +med+ "\nReprovado!");
       }else{
           System.out.println("Média = " +med+ "\nAprovado!");
       }
    }  
}
