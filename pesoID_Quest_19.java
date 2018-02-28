package if_else;

import java.util.Scanner;

public class pesoID_Quest_19 {

    /**
     * Faça um programa que receba a altura e o sexo de uma pessoa e que calcule 
     * e mostre o seu peso ideal, utilizando as seguintes fórmulas:
       • para homens: (72.2*h) – 58;
       • para mulheres: (62.1*h) – 44.7
     */
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        System.out.print("DIGITE A ALTURA DA PESSOA: ");
        float alt = ler.nextFloat();
        System.out.print("DIGITE O SEXO DA PESSOA: ");
        char sexo = ler.next().charAt(0);
        
        double pesoIDEAL = 0;
        
        if(sexo == 'H'){
            pesoIDEAL = (72.2 * alt) - 58;
        }
        if(sexo == 'M'){
            pesoIDEAL = (62.1 * alt) - 44.7;
        }
        System.out.println("O PESO IDEAL É = " +pesoIDEAL);
    }
    
}
