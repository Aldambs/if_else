package if_else;

import java.util.Scanner;

public class aumentoSal_Quest_07 {

    /**
     * Uma empresa decide dar um aumento de 30% aos funcionários com salários 
     * inferiores a R$ 500,00. Faça um programa que receba o salário do funcionário
     * e mostre o valor do salário reajustado ou uma mensagem, caso o funcionário
     * não tenha direito ao aumento.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: ");
        float sal = ler.nextFloat();
        float reaj, novoSal;
        
        if(sal < 500){
            reaj = sal * 0.30f;
            novoSal = sal + reaj;
            System.out.println("O novo valor = " +novoSal);
        }else{
            System.out.println("NÃO TEM DIREITO A REAJUSTE!");
        }
        
    }
    
}
