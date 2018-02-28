package if_else;

import java.util.Scanner;

public class credEsp_quest_09 {
    /**
     * Um banco concederá um crédito especial aos seus clientes de acordo com o 
     * saldo médio no último ano. Faça um programa que receba o saldo médio de 
     * um cliente e calcule o valor do crédito, de acordo com a tabela a seguir. 
     * Mostre o saldo médio e o valor do crédito.
          Saldo médio                            Percentual
          Acima de R$ 400,00                 30% do saldo médio
          R$ 400,00 ---- R$ 300,00           25% do saldo médio
          R$ 300,00 ---- R$ 200,00           20% do saldo médio
          Até R$ 200,00                      10% do saldo médio
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o saldo de crédito do cliente: ");
        double saldo = ler.nextDouble();
        double valorCRED = 0;

        if (saldo > 400) {
            valorCRED = (saldo * 0.30);
            
        }
        if (saldo < 400 & saldo > 300) {
            valorCRED = (saldo * 0.25);
           
        }
        if (saldo < 300 & saldo > 200) {
            valorCRED = saldo * 0.20;       
        }
        if (saldo <= 200) {
            valorCRED = saldo * 0.10;           
        }
        System.out.println("O valor do crédito é = " + valorCRED);
    }
}
