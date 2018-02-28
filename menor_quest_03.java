package if_else;

import java.util.Scanner;

public class menor_quest_03 {
    /*
    *Faça um programa que receba dois números e mostre o menor.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        float num1 = ler.nextFloat();
        System.out.print("Digite o segundo valor: ");
        float num2 = ler.nextFloat();
        
        if(num1 < num2){
            System.out.println("O menor número é = " +num1);
        }else{
            if(num1 > num2){
                System.out.println("O menor número é = " +num2); 
            }
        }
    }
    
}
