package if_else;

import java.util.Scanner;

public class media2nota_quest_02 {
    /**
     * Faça um programa que receba duas notas, calcule e mostre a média aritmética 
     * e a mensagem que está na tabela a seguir:
       Média Aritmética          Mensagem
       0,0 ---- 4,0              Reprovado
       4,0 ---- 7,0              Exame
       7,0 ---- 10,0             Aprovado
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float not1, not2, med;
        System.out.print("Digite a 1º nota: ");
        not1 = ler.nextFloat();
        System.out.print("Digite a 2º nota: ");
        not2 = ler.nextFloat();
        
        med = (not1 + not2) / 2;
        
        if (med >= 0 & med < 4) {
            System.out.println("A média é = " + med + "\nReprovado!");
        } else {
            if (med >= 4 & med < 7) {
                System.out.println("A média é = " + med + "\nExame!");
            } else {
                if (med >= 7 & med <= 10) {
                    System.out.println("A média é = " + med + "\nAprovado!");
                }
            }
        }
    }
}
