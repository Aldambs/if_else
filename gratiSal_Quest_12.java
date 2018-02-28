package if_else;

import java.util.Scanner;

public class gratiSal_Quest_12 {
    /**
     * Faça um programa que receba o salário de um funcionário e, usando a tabela 
     * a seguir, calcule e mostre o valor a receber. Sabe-se que este é composto 
     * pelo salário do funcionário acrescido da gratificação e descontado o imposto
     * de 7% sobre o salário sem gratificação.
       TABELA DAS GRATIFICAÇÕES
       Salário                          Gratificações
       Até R$ 350,00                      R$ 100,00
       R$ 350,00 ---- R$ 600,00           R$ 75,00
       R$ 600,00 ---- R$ 900,00           R$ 50,00
       Acima de R$ 900,00                 R$ 35,00
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o salário do funcionário: ");
        double sal = ler.nextDouble();
        double valorR = 0, salario = 0;
   
        if(sal <= 350){
            salario = sal - (sal * 0.07);
            valorR = salario + 100;
        }
        if(sal > 350 && sal <= 600){
            salario = sal - (sal * 0.07);
            valorR = salario + 75;
        }
        if(sal > 600 && sal <= 900){
            salario = sal - (sal * 0.07);
            valorR = salario + 50;
        }
        if(sal > 900){
            salario = sal - (sal * 0.07);
            valorR = salario + 35;
        }
        System.out.println("O VALOR A RECEBER = " +valorR);
    }
    
}
