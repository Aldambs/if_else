package if_else;

import java.util.Scanner;

public class reajust_quest_08 {
    /**
     * Faça um programa para calcular e mostrar o salário reajustado de um 
     * funcionário. Sabe-se que o percentual de aumento é o mesmo da tabela a seguir:
       Salário          Percentual de aumento
       Até R$ 300,00          35%
       Acima de R$ 300,00     15%
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: ");
        double sal = ler.nextDouble();
        double reaj = 0;
        
        if(sal <= 300){
            reaj = sal + (sal * 0.35);
        }else if(sal >= 300){
            reaj = sal + (sal * 0.15);
        }
        System.out.println("O salário foi reajustado em = " +reaj);
    }
    
}
