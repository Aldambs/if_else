package if_else;

import java.text.DecimalFormat;
import java.util.Scanner;

public class custoCONS_Quest_10 {
    /**
     * O custo de um consumidor de um carro novo é a soma do custo de fábrica com 
     * a porcentagem do distribuidor e com os impostos, ambos aplicados ao custo 
     * de fábrica. Sabe- se que as porcentagens são as mesmas que estão na tabela
     * a seguir. Faça um programa que receba o custo de fábrica de um carro e 
     * mostre o custo ao consumidor.
       Custo de fábrica              % do distribuidor       % dos impostos
       Até R$ 12.000,00                      5                     Isento
       Entre R$ 12.000,00 e R$ 25.000,00     10                       15
       Acima de R$ 25.000,00                 15                       20
      */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");
        System.out.print("Informe o custo de fábrica: ");
        double custo = ler.nextDouble();
        double custoCONS = 0;
        
        if(custo <= 12.000){
            custoCONS = custo + (custo * 0.05);
        }
        if(custo > 12.000 && custo <= 25.000){
            custoCONS = custo + (custo * 0.10) + (custo * 0.15);
        }
        if(custo > 25.000){
            custoCONS = custo + (custo * 0.15) + (custo * 0.20);
        }
        System.out.println("O custo a ser pago = " +df.format(custoCONS));
    }
    
}
