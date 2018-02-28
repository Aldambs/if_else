package if_else;

import java.util.Scanner;

public class escolha_quest_05 {

    /**
     * Faça um programa que receba dois números e execute as operações listadas 
     * a seguir de acordo com a escolha do usuário.
       Escolha do usuário         Operação
            1                      Média entre os números digitados
            2                      Diferença do maior pelo menor
            3                      Produto entre os números digitados
            4                      Divisão do primeiro pelo segundo
       Se a opção digitada for inválida, mostrar uma mensagem de erro e terminar 
       a execução do programa. Lembre-se de que na opção 4 o segundo números deve 
       ser diferente de zero.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        byte op = 0;
        float n1, n2, med, dif, prod, div;
        
        System.out.print("Digite o primeiro número: ");
        n1 = ler.nextFloat();
        System.out.print("Digite o segunddo número: ");
        n2 = ler.nextFloat();
        System.out.println("DIGITE A OPÇAO DESEJADA (1, 2, 3 ou 4:) ");
        op = ler.nextByte();

        if (op == 1) {
            med = (n1 + n2) / 2;
            System.out.println("A média é = " + med);
        }
        if (op == 2) {
            if(n1 > n2){
                dif = n1 - n2;
            }else{
                dif = n2 - n1;
            }          
            System.out.println("A diferença é = " + dif);
        }
        if (op == 3) {
            prod = n1 * n2;
            System.out.println("O produto é = " + prod);
        }
        if (op == 4) {
            if (n2 == 0) {
                System.out.println("Número errado!");
            } else {
                div = n1 / n2;
                System.out.println("A divisão é = " + div);
            }
        }
        if(op != 1 && op != 2 && op != 3 || op != 4){
            System.out.println("OPÇÃO INVÁLIDA!!");
        }
    }
}
