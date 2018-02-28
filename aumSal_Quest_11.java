/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/**
 *
 * @author ALDA MATOS
 */
public class aumSal_Quest_11 {

    /**
     * Faça um programa que receba o salário de um funcionário e, usando a tabela 
     * a seguir, calcule e mostre o valor do aumento e o novo salário.
       Salário                        Percentual de aumento
       Até R$ 300,00                             15
       R$ 300,00 ---- R$ 600,00                  10
       R$ 600,00 ---- R$ 900,00                   5
       Acima R$ 900,00                            0
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o salário do funcionário: ");
        double sal = ler.nextDouble();
        double aum = 0, novoSal = 0;
        
        if(sal <= 300){
            aum = sal * 0.15;
            novoSal = aum + sal;
        }
        if(sal > 300 && sal <= 600){
            aum = sal * 0.10;
            novoSal = aum + sal;
        }
        if(sal > 600 && sal <= 900){
            aum = sal * 0.05;
            novoSal = aum + sal;
        }
        if(sal > 900){
            aum = sal * 0;
            novoSal = aum + sal;
        }
        System.out.println("O aumento foi = " +aum+ "\nO novo salário é = " +novoSal);
    }
    
}
