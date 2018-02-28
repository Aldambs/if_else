package if_else;

import java.util.Scanner;

public class descon_Quest_16 {

    /**
     * Uma empresa decide aplicar descontos nos seus preços usando a tabela a seguir.
     * Faça um programa que receba o preço atual de um produto e seu código e que 
     * calcule e mostre o preço atual, o valor do desconto e o novo preço.
       Preço atual                  % de desconto
       Até R$ 30,00                   Sem desconto
       Entre R$ 30,00 e R$ 100,00          10
       Acima de R$ 100,00                  15
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("DIGITE O CÓDIGO DO PRODUTO: ");
        byte cod = ler.nextByte();
        System.out.print("DIGITE O PREÇO ATUAL DO PRODUTO: ");
        float pr = ler.nextFloat();
        float prAT = 0, desc = 0, novoPR = 0;
        
        if (cod == 1) {
            if (pr <= 30) {
                prAT = pr;
                desc = 0.0f;
                novoPR = pr;
            }
        }
        if (cod == 2) {
            if (pr > 30 && pr <= 100) {
                prAT = pr;
                desc = pr * 0.10f;
                novoPR = pr - desc;
            }
        }
        if (cod == 3) {
            if (pr > 100) {
                prAT = pr;
                desc = pr * 0.15f;
                novoPR = pr - desc;
            }
        }
        System.out.println("O PREÇO ATUAL É = " + prAT);
        System.out.println("O DESCONTO É = " + desc);
        System.out.println("O NOVO PREÇO É = " + novoPR);
    }
    
}
