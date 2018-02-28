package if_else;

import java.util.Scanner;

public class maior_quest_04 {
    /**
     * Faça um programa que receba três números e mostre o maior.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float maior;
        System.out.print("Digite o primeiro número: ");
        float n1 = ler.nextFloat();
        System.out.print("Digite o segundo número: ");
        float n2 = ler.nextFloat();
        System.out.print("Digite o terceiro número: ");
        float n3 = ler.nextFloat();
        
        if(n1 >=  n2){
            maior = n1;
        }else{
            maior = n2;
        }
        if(maior <= n3){
            maior = n3;
        }
        System.out.println("O maior número é = " +maior);
    }
    
}
