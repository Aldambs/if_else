package if_else;

import java.text.DecimalFormat;
import java.util.Scanner;

public class novoSal_Quest_14 {
    /**
     * Faça um programa que receba o salário de um funcionário e, usando a tabela 
     * a seguir, calcule e mostre o novo salário.
       Faixa salarial               % de Aumento
       Até R$ 300,00                     50%
       R$ 300,00 ---- R$ 500,00          40%
       R$ 500,00 ---- R$ 700,00          30%
       R$ 700,00 ---- R$ 800,00          20%
       R$ 800,00 ---- R$ 1.000,00        10%
       Acima de R$ 1.000,00               5%
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");
        System.out.print("Digite o salário do funcionário: ");
        float sal = ler.nextFloat();
        float novoSal = 0;
        
        if(sal <= 300){
            novoSal = sal + (sal * 0.50f);
        }
        if(sal > 300 && sal <= 500){
           novoSal = sal + (sal * 0.40f); 
        }
        if(sal > 500 && sal <= 700){
           novoSal = sal + (sal * 0.30f); 
        }
        if(sal > 700 && sal <= 800){
           novoSal = sal + (sal * 0.20f); 
        }
        if(sal > 800 && sal <= 1000){
           novoSal = sal + (sal * 0.10f); 
        }
        if(sal > 1000){
           novoSal = sal + (sal * 0.05f); 
        }
        System.out.println("O novo salário = " +df.format(novoSal));
    }  
}
